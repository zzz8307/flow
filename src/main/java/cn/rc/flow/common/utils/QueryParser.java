package cn.rc.flow.common.utils;

import cn.rc.flow.common.exception.InvalidQueryFieldException;
import com.google.common.base.CaseFormat;

import java.lang.reflect.Field;
import java.util.*;

import static cn.rc.flow.common.consts.ErrorMessageConsts.INVALID_QUERY_FIELD_MESSAGE;

/**
 * @author rc
 */
public class QueryParser {

    private static final String ORDER_BY_DESC_CLAUSE = "ORDERBYDESC";
    private static final String ORDER_BY_CLAUSE = "ORDERBY";

    private static final String EQUAL_OPERATOR = "=";
    private static final String NOT_EQUAL_OPERATOR = "!=";
    private static final String LIKE_OPERATOR = "LIKE";
    private static final String STARTS_WITH_OPERATOR = "STARTSWITH";
    private static final String ENDS_WITH_OPERATOR = "ENDSWITH";

    private static final String OR_OPERATOR = "OR";

    private final Class<?> domainClass;
    private final boolean isIgnoreInvalidField;

    public QueryParser(Class<?> domainClass, boolean isIgnoreInvalidField) {
        this.domainClass = domainClass;
        this.isIgnoreInvalidField = isIgnoreInvalidField;
    }

    public Query parse(String query) {
        if (query == null || query.isBlank()) {
            return null;
        }

        return convert(query);
    }

    private Query convert(String query) {
        List<String> queries = new ArrayList<>(Arrays.asList(query.split("\\^")));

        if (queries.isEmpty()) {
            return null;
        }

        Query q = new Query()
                .setOrderByClause(convert2OrderByClause(queries));

        List<String> and = new ArrayList<>();
        List<List<String>> or = new ArrayList<>();

        List<String> or0 = new ArrayList<>();
        for (ListIterator<String> iterator = queries.listIterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            if (!next.startsWith(OR_OPERATOR) && iterator.hasNext()) {
                if (iterator.next().startsWith(OR_OPERATOR)) {
                    if (!or0.isEmpty()) {
                        or.add(or0);
                        or0 = new ArrayList<>();
                    }
                    iterator.previous();
                    or0.add(iterator.previous());
                } else {
                    iterator.previous();
                    and.add(iterator.previous());
                }
            } else if (next.startsWith(OR_OPERATOR)) {
                or0.add(next.split(OR_OPERATOR)[1]);
            } else {
                and.add(next);
            }
            iterator.remove();
        }

        if (!or0.isEmpty()) {
            or.add(or0);
        }

        Map<String, String> andClause = convert2Operator(and);
        List<Map<String, String>> orClause = new ArrayList<>();
        for (List<String> list : or) {
            orClause.add(convert2Operator(list));
        }

        return q.setAndClause(andClause).setOrClause(orClause);
    }

    private String convert2OrderByClause(List<String> queries) {
        boolean flag = false;
        StringBuilder orderBy = new StringBuilder("order by ");

        for (ListIterator<String> iterator = queries.listIterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            if (next.startsWith(ORDER_BY_DESC_CLAUSE)) {
                String field = next.split(ORDER_BY_DESC_CLAUSE)[1];
                if (checkField(field)) {
                    flag = true;
                    orderBy.append(field).append(" DESC,");
                    iterator.remove();
                }
            } else if (next.startsWith(ORDER_BY_CLAUSE)) {
                String field = next.split(ORDER_BY_CLAUSE)[1];
                if (checkField(field)) {
                    flag = true;
                    orderBy.append(field).append(",");
                    iterator.remove();
                }
            }
        }
        // remove the last comma
        return flag ? orderBy.deleteCharAt(orderBy.length() - 1).toString() : null;
    }

    private Map<String, String> convert2Operator(List<String> queries) {
        HashMap<String, String> map = new HashMap<>();
        for (String s : queries) {
            if (s.contains(NOT_EQUAL_OPERATOR)) {
                String[] split = s.split(NOT_EQUAL_OPERATOR);
                if (checkField(split[0])) {
                    map.put(split[0] + " " + NOT_EQUAL_OPERATOR, split[1]);
                }
            } else if (s.contains(EQUAL_OPERATOR)) {
                String[] split = s.split(EQUAL_OPERATOR);
                if (checkField(split[0])) {
                    map.put(split[0] + " " + EQUAL_OPERATOR, split[1]);
                }
            } else if (s.contains(LIKE_OPERATOR)) {
                String[] split = s.split(LIKE_OPERATOR);
                if (checkField(split[0])) {
                    map.put(split[0] + " " + LIKE_OPERATOR, "%" + split[1] + "%");
                }
            } else if (s.contains(STARTS_WITH_OPERATOR)) {
                String[] split = s.split(STARTS_WITH_OPERATOR);
                if (checkField(split[0])) {
                    map.put(split[0] + " " + LIKE_OPERATOR, split[1] + "%");
                }
            } else if (s.contains(ENDS_WITH_OPERATOR)) {
                String[] split = s.split(ENDS_WITH_OPERATOR);
                if (checkField(split[0])) {
                    map.put(split[0] + " " + LIKE_OPERATOR, "%" + split[1]);
                }
            }
        }
        return map;
    }

    private boolean checkField(String field) {
        String f = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, field);

        for (Field classField : domainClass.getDeclaredFields()) {
            if (classField.getName().equals(f)) {
                return true;
            }
        }

        if (isIgnoreInvalidField) {
            return false;
        }
        throw new InvalidQueryFieldException(INVALID_QUERY_FIELD_MESSAGE);
    }
}
