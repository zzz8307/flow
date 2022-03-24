package cn.rc.flow.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiCallHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiCallHistoryExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSysIdIsNull() {
            addCriterion("sys_id is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("sys_id =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("sys_id <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("sys_id >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_id >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("sys_id <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("sys_id <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("sys_id like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("sys_id not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("sys_id in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("sys_id not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("sys_id between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("sys_id not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(String value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(String value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(String value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(String value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(String value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLike(String value) {
            addCriterion("sender_id like", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotLike(String value) {
            addCriterion("sender_id not like", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<String> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<String> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(String value1, String value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(String value1, String value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNull() {
            addCriterion("endpoint is null");
            return (Criteria) this;
        }

        public Criteria andEndpointIsNotNull() {
            addCriterion("endpoint is not null");
            return (Criteria) this;
        }

        public Criteria andEndpointEqualTo(String value) {
            addCriterion("endpoint =", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotEqualTo(String value) {
            addCriterion("endpoint <>", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThan(String value) {
            addCriterion("endpoint >", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointGreaterThanOrEqualTo(String value) {
            addCriterion("endpoint >=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThan(String value) {
            addCriterion("endpoint <", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLessThanOrEqualTo(String value) {
            addCriterion("endpoint <=", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointLike(String value) {
            addCriterion("endpoint like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotLike(String value) {
            addCriterion("endpoint not like", value, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointIn(List<String> values) {
            addCriterion("endpoint in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotIn(List<String> values) {
            addCriterion("endpoint not in", values, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointBetween(String value1, String value2) {
            addCriterion("endpoint between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andEndpointNotBetween(String value1, String value2) {
            addCriterion("endpoint not between", value1, value2, "endpoint");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIsNull() {
            addCriterion("request_body is null");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIsNotNull() {
            addCriterion("request_body is not null");
            return (Criteria) this;
        }

        public Criteria andRequestBodyEqualTo(String value) {
            addCriterion("request_body =", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotEqualTo(String value) {
            addCriterion("request_body <>", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyGreaterThan(String value) {
            addCriterion("request_body >", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyGreaterThanOrEqualTo(String value) {
            addCriterion("request_body >=", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLessThan(String value) {
            addCriterion("request_body <", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLessThanOrEqualTo(String value) {
            addCriterion("request_body <=", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLike(String value) {
            addCriterion("request_body like", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotLike(String value) {
            addCriterion("request_body not like", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIn(List<String> values) {
            addCriterion("request_body in", values, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotIn(List<String> values) {
            addCriterion("request_body not in", values, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyBetween(String value1, String value2) {
            addCriterion("request_body between", value1, value2, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotBetween(String value1, String value2) {
            addCriterion("request_body not between", value1, value2, "requestBody");
            return (Criteria) this;
        }

        public Criteria andHttpStatusIsNull() {
            addCriterion("http_status is null");
            return (Criteria) this;
        }

        public Criteria andHttpStatusIsNotNull() {
            addCriterion("http_status is not null");
            return (Criteria) this;
        }

        public Criteria andHttpStatusEqualTo(Integer value) {
            addCriterion("http_status =", value, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusNotEqualTo(Integer value) {
            addCriterion("http_status <>", value, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusGreaterThan(Integer value) {
            addCriterion("http_status >", value, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("http_status >=", value, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusLessThan(Integer value) {
            addCriterion("http_status <", value, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("http_status <=", value, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusIn(List<Integer> values) {
            addCriterion("http_status in", values, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusNotIn(List<Integer> values) {
            addCriterion("http_status not in", values, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusBetween(Integer value1, Integer value2) {
            addCriterion("http_status between", value1, value2, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andHttpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("http_status not between", value1, value2, "httpStatus");
            return (Criteria) this;
        }

        public Criteria andDutationIsNull() {
            addCriterion("dutation is null");
            return (Criteria) this;
        }

        public Criteria andDutationIsNotNull() {
            addCriterion("dutation is not null");
            return (Criteria) this;
        }

        public Criteria andDutationEqualTo(Integer value) {
            addCriterion("dutation =", value, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationNotEqualTo(Integer value) {
            addCriterion("dutation <>", value, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationGreaterThan(Integer value) {
            addCriterion("dutation >", value, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationGreaterThanOrEqualTo(Integer value) {
            addCriterion("dutation >=", value, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationLessThan(Integer value) {
            addCriterion("dutation <", value, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationLessThanOrEqualTo(Integer value) {
            addCriterion("dutation <=", value, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationIn(List<Integer> values) {
            addCriterion("dutation in", values, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationNotIn(List<Integer> values) {
            addCriterion("dutation not in", values, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationBetween(Integer value1, Integer value2) {
            addCriterion("dutation between", value1, value2, "dutation");
            return (Criteria) this;
        }

        public Criteria andDutationNotBetween(Integer value1, Integer value2) {
            addCriterion("dutation not between", value1, value2, "dutation");
            return (Criteria) this;
        }

        public Criteria andResponseBodyIsNull() {
            addCriterion("response_body is null");
            return (Criteria) this;
        }

        public Criteria andResponseBodyIsNotNull() {
            addCriterion("response_body is not null");
            return (Criteria) this;
        }

        public Criteria andResponseBodyEqualTo(String value) {
            addCriterion("response_body =", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyNotEqualTo(String value) {
            addCriterion("response_body <>", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyGreaterThan(String value) {
            addCriterion("response_body >", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyGreaterThanOrEqualTo(String value) {
            addCriterion("response_body >=", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyLessThan(String value) {
            addCriterion("response_body <", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyLessThanOrEqualTo(String value) {
            addCriterion("response_body <=", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyLike(String value) {
            addCriterion("response_body like", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyNotLike(String value) {
            addCriterion("response_body not like", value, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyIn(List<String> values) {
            addCriterion("response_body in", values, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyNotIn(List<String> values) {
            addCriterion("response_body not in", values, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyBetween(String value1, String value2) {
            addCriterion("response_body between", value1, value2, "responseBody");
            return (Criteria) this;
        }

        public Criteria andResponseBodyNotBetween(String value1, String value2) {
            addCriterion("response_body not between", value1, value2, "responseBody");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}