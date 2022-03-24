package cn.rc.flow.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author rc
 */
public class Query {
    private AndClause andClause;
    private OrClause orClause;
    private String orderByClause;

    public AndClause getAndClause() {
        return andClause;
    }

    public OrClause getOrClause() {
        return orClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public Query setOrderByClause(String orderBy) {
        this.orderByClause = orderBy;
        return this;
    }

    public Query setAndClause(Map<String, String> map) {
        AndClause clause = new AndClause();
        map.forEach(clause::add);
        this.andClause = clause;
        return this;
    }

    public Query setOrClause(List<Map<String, String>> listMap) {
        OrClause clause = new OrClause();
        listMap.forEach(map -> {
            AndClause c = clause.or();
            map.forEach(c::add);
        });
        this.orClause = clause;
        return this;
    }

    private static class AndClause {
        private final List<ConditionClause> conditionList;

        AndClause() {
            this.conditionList = new ArrayList<>();
        }

        public List<ConditionClause> getConditionList() {
            return conditionList;
        }

        public boolean isValid() {
            return conditionList.isEmpty();
        }

        public AndClause add(String condition) {
            conditionList.add(new ConditionClause(condition));
            return this;
        }

        public AndClause add(String condition, String value) {
            conditionList.add(new ConditionClause(condition, value));
            return this;
        }
    }

    private static class OrClause {
        private final List<AndClause> clauseList;

        OrClause() {
            super();
            this.clauseList = new ArrayList<>();
        }

        public boolean isValid() {
            return clauseList.isEmpty();
        }

        public List<AndClause> getClauseList() {
            return clauseList;
        }

        public AndClause or() {
            AndClause c = new AndClause();
            this.clauseList.add(c);
            return c;
        }
    }

    private static class ConditionClause {
        private final String condition;
        private final String value;
        private final boolean noValue;

        public String getCondition() {
            return condition;
        }

        public String getValue() {
            return value;
        }

        public boolean isNoValue() {
            return noValue;
        }

        ConditionClause(String condition) {
            this.condition = condition;
            this.value = null;
            this.noValue = true;
        }

        ConditionClause(String condition, String value) {
            this.condition = condition;
            this.value = value;
            this.noValue = false;
        }
    }
}
