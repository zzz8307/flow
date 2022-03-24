package cn.rc.flow.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncidentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncidentExample() {
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

        public Criteria andCallerIdIsNull() {
            addCriterion("caller_id is null");
            return (Criteria) this;
        }

        public Criteria andCallerIdIsNotNull() {
            addCriterion("caller_id is not null");
            return (Criteria) this;
        }

        public Criteria andCallerIdEqualTo(String value) {
            addCriterion("caller_id =", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotEqualTo(String value) {
            addCriterion("caller_id <>", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdGreaterThan(String value) {
            addCriterion("caller_id >", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdGreaterThanOrEqualTo(String value) {
            addCriterion("caller_id >=", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdLessThan(String value) {
            addCriterion("caller_id <", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdLessThanOrEqualTo(String value) {
            addCriterion("caller_id <=", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdLike(String value) {
            addCriterion("caller_id like", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotLike(String value) {
            addCriterion("caller_id not like", value, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdIn(List<String> values) {
            addCriterion("caller_id in", values, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotIn(List<String> values) {
            addCriterion("caller_id not in", values, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdBetween(String value1, String value2) {
            addCriterion("caller_id between", value1, value2, "callerId");
            return (Criteria) this;
        }

        public Criteria andCallerIdNotBetween(String value1, String value2) {
            addCriterion("caller_id not between", value1, value2, "callerId");
            return (Criteria) this;
        }

        public Criteria andOpenedForIsNull() {
            addCriterion("opened_for is null");
            return (Criteria) this;
        }

        public Criteria andOpenedForIsNotNull() {
            addCriterion("opened_for is not null");
            return (Criteria) this;
        }

        public Criteria andOpenedForEqualTo(String value) {
            addCriterion("opened_for =", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForNotEqualTo(String value) {
            addCriterion("opened_for <>", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForGreaterThan(String value) {
            addCriterion("opened_for >", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForGreaterThanOrEqualTo(String value) {
            addCriterion("opened_for >=", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForLessThan(String value) {
            addCriterion("opened_for <", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForLessThanOrEqualTo(String value) {
            addCriterion("opened_for <=", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForLike(String value) {
            addCriterion("opened_for like", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForNotLike(String value) {
            addCriterion("opened_for not like", value, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForIn(List<String> values) {
            addCriterion("opened_for in", values, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForNotIn(List<String> values) {
            addCriterion("opened_for not in", values, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForBetween(String value1, String value2) {
            addCriterion("opened_for between", value1, value2, "openedFor");
            return (Criteria) this;
        }

        public Criteria andOpenedForNotBetween(String value1, String value2) {
            addCriterion("opened_for not between", value1, value2, "openedFor");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNull() {
            addCriterion("contact_type is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNotNull() {
            addCriterion("contact_type is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(String value) {
            addCriterion("contact_type =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotEqualTo(String value) {
            addCriterion("contact_type <>", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThan(String value) {
            addCriterion("contact_type >", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contact_type >=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThan(String value) {
            addCriterion("contact_type <", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThanOrEqualTo(String value) {
            addCriterion("contact_type <=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLike(String value) {
            addCriterion("contact_type like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotLike(String value) {
            addCriterion("contact_type not like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIn(List<String> values) {
            addCriterion("contact_type in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotIn(List<String> values) {
            addCriterion("contact_type not in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeBetween(String value1, String value2) {
            addCriterion("contact_type between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotBetween(String value1, String value2) {
            addCriterion("contact_type not between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNull() {
            addCriterion("symptom is null");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNotNull() {
            addCriterion("symptom is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomEqualTo(String value) {
            addCriterion("symptom =", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotEqualTo(String value) {
            addCriterion("symptom <>", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThan(String value) {
            addCriterion("symptom >", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThanOrEqualTo(String value) {
            addCriterion("symptom >=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThan(String value) {
            addCriterion("symptom <", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThanOrEqualTo(String value) {
            addCriterion("symptom <=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLike(String value) {
            addCriterion("symptom like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotLike(String value) {
            addCriterion("symptom not like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomIn(List<String> values) {
            addCriterion("symptom in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotIn(List<String> values) {
            addCriterion("symptom not in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomBetween(String value1, String value2) {
            addCriterion("symptom between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotBetween(String value1, String value2) {
            addCriterion("symptom not between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andCmdbCiIsNull() {
            addCriterion("cmdb_ci is null");
            return (Criteria) this;
        }

        public Criteria andCmdbCiIsNotNull() {
            addCriterion("cmdb_ci is not null");
            return (Criteria) this;
        }

        public Criteria andCmdbCiEqualTo(String value) {
            addCriterion("cmdb_ci =", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiNotEqualTo(String value) {
            addCriterion("cmdb_ci <>", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiGreaterThan(String value) {
            addCriterion("cmdb_ci >", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiGreaterThanOrEqualTo(String value) {
            addCriterion("cmdb_ci >=", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiLessThan(String value) {
            addCriterion("cmdb_ci <", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiLessThanOrEqualTo(String value) {
            addCriterion("cmdb_ci <=", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiLike(String value) {
            addCriterion("cmdb_ci like", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiNotLike(String value) {
            addCriterion("cmdb_ci not like", value, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiIn(List<String> values) {
            addCriterion("cmdb_ci in", values, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiNotIn(List<String> values) {
            addCriterion("cmdb_ci not in", values, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiBetween(String value1, String value2) {
            addCriterion("cmdb_ci between", value1, value2, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andCmdbCiNotBetween(String value1, String value2) {
            addCriterion("cmdb_ci not between", value1, value2, "cmdbCi");
            return (Criteria) this;
        }

        public Criteria andHoldReasonIsNull() {
            addCriterion("hold_reason is null");
            return (Criteria) this;
        }

        public Criteria andHoldReasonIsNotNull() {
            addCriterion("hold_reason is not null");
            return (Criteria) this;
        }

        public Criteria andHoldReasonEqualTo(String value) {
            addCriterion("hold_reason =", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonNotEqualTo(String value) {
            addCriterion("hold_reason <>", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonGreaterThan(String value) {
            addCriterion("hold_reason >", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonGreaterThanOrEqualTo(String value) {
            addCriterion("hold_reason >=", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonLessThan(String value) {
            addCriterion("hold_reason <", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonLessThanOrEqualTo(String value) {
            addCriterion("hold_reason <=", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonLike(String value) {
            addCriterion("hold_reason like", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonNotLike(String value) {
            addCriterion("hold_reason not like", value, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonIn(List<String> values) {
            addCriterion("hold_reason in", values, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonNotIn(List<String> values) {
            addCriterion("hold_reason not in", values, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonBetween(String value1, String value2) {
            addCriterion("hold_reason between", value1, value2, "holdReason");
            return (Criteria) this;
        }

        public Criteria andHoldReasonNotBetween(String value1, String value2) {
            addCriterion("hold_reason not between", value1, value2, "holdReason");
            return (Criteria) this;
        }

        public Criteria andPendingTimeIsNull() {
            addCriterion("pending_time is null");
            return (Criteria) this;
        }

        public Criteria andPendingTimeIsNotNull() {
            addCriterion("pending_time is not null");
            return (Criteria) this;
        }

        public Criteria andPendingTimeEqualTo(Date value) {
            addCriterion("pending_time =", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeNotEqualTo(Date value) {
            addCriterion("pending_time <>", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeGreaterThan(Date value) {
            addCriterion("pending_time >", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pending_time >=", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeLessThan(Date value) {
            addCriterion("pending_time <", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeLessThanOrEqualTo(Date value) {
            addCriterion("pending_time <=", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeIn(List<Date> values) {
            addCriterion("pending_time in", values, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeNotIn(List<Date> values) {
            addCriterion("pending_time not in", values, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeBetween(Date value1, Date value2) {
            addCriterion("pending_time between", value1, value2, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeNotBetween(Date value1, Date value2) {
            addCriterion("pending_time not between", value1, value2, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupIsNull() {
            addCriterion("ownership_group is null");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupIsNotNull() {
            addCriterion("ownership_group is not null");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupEqualTo(String value) {
            addCriterion("ownership_group =", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupNotEqualTo(String value) {
            addCriterion("ownership_group <>", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupGreaterThan(String value) {
            addCriterion("ownership_group >", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupGreaterThanOrEqualTo(String value) {
            addCriterion("ownership_group >=", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupLessThan(String value) {
            addCriterion("ownership_group <", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupLessThanOrEqualTo(String value) {
            addCriterion("ownership_group <=", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupLike(String value) {
            addCriterion("ownership_group like", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupNotLike(String value) {
            addCriterion("ownership_group not like", value, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupIn(List<String> values) {
            addCriterion("ownership_group in", values, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupNotIn(List<String> values) {
            addCriterion("ownership_group not in", values, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupBetween(String value1, String value2) {
            addCriterion("ownership_group between", value1, value2, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andOwnershipGroupNotBetween(String value1, String value2) {
            addCriterion("ownership_group not between", value1, value2, "ownershipGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupIsNull() {
            addCriterion("assignment_group is null");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupIsNotNull() {
            addCriterion("assignment_group is not null");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupEqualTo(String value) {
            addCriterion("assignment_group =", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupNotEqualTo(String value) {
            addCriterion("assignment_group <>", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupGreaterThan(String value) {
            addCriterion("assignment_group >", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupGreaterThanOrEqualTo(String value) {
            addCriterion("assignment_group >=", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupLessThan(String value) {
            addCriterion("assignment_group <", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupLessThanOrEqualTo(String value) {
            addCriterion("assignment_group <=", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupLike(String value) {
            addCriterion("assignment_group like", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupNotLike(String value) {
            addCriterion("assignment_group not like", value, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupIn(List<String> values) {
            addCriterion("assignment_group in", values, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupNotIn(List<String> values) {
            addCriterion("assignment_group not in", values, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupBetween(String value1, String value2) {
            addCriterion("assignment_group between", value1, value2, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignmentGroupNotBetween(String value1, String value2) {
            addCriterion("assignment_group not between", value1, value2, "assignmentGroup");
            return (Criteria) this;
        }

        public Criteria andAssignedToIsNull() {
            addCriterion("assigned_to is null");
            return (Criteria) this;
        }

        public Criteria andAssignedToIsNotNull() {
            addCriterion("assigned_to is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedToEqualTo(String value) {
            addCriterion("assigned_to =", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotEqualTo(String value) {
            addCriterion("assigned_to <>", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToGreaterThan(String value) {
            addCriterion("assigned_to >", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToGreaterThanOrEqualTo(String value) {
            addCriterion("assigned_to >=", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToLessThan(String value) {
            addCriterion("assigned_to <", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToLessThanOrEqualTo(String value) {
            addCriterion("assigned_to <=", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToLike(String value) {
            addCriterion("assigned_to like", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotLike(String value) {
            addCriterion("assigned_to not like", value, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToIn(List<String> values) {
            addCriterion("assigned_to in", values, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotIn(List<String> values) {
            addCriterion("assigned_to not in", values, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToBetween(String value1, String value2) {
            addCriterion("assigned_to between", value1, value2, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andAssignedToNotBetween(String value1, String value2) {
            addCriterion("assigned_to not between", value1, value2, "assignedTo");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdIsNull() {
            addCriterion("correlation_id is null");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdIsNotNull() {
            addCriterion("correlation_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdEqualTo(String value) {
            addCriterion("correlation_id =", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdNotEqualTo(String value) {
            addCriterion("correlation_id <>", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdGreaterThan(String value) {
            addCriterion("correlation_id >", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdGreaterThanOrEqualTo(String value) {
            addCriterion("correlation_id >=", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdLessThan(String value) {
            addCriterion("correlation_id <", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdLessThanOrEqualTo(String value) {
            addCriterion("correlation_id <=", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdLike(String value) {
            addCriterion("correlation_id like", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdNotLike(String value) {
            addCriterion("correlation_id not like", value, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdIn(List<String> values) {
            addCriterion("correlation_id in", values, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdNotIn(List<String> values) {
            addCriterion("correlation_id not in", values, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdBetween(String value1, String value2) {
            addCriterion("correlation_id between", value1, value2, "correlationId");
            return (Criteria) this;
        }

        public Criteria andCorrelationIdNotBetween(String value1, String value2) {
            addCriterion("correlation_id not between", value1, value2, "correlationId");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIsNull() {
            addCriterion("short_description is null");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIsNotNull() {
            addCriterion("short_description is not null");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionEqualTo(String value) {
            addCriterion("short_description =", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotEqualTo(String value) {
            addCriterion("short_description <>", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionGreaterThan(String value) {
            addCriterion("short_description >", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("short_description >=", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLessThan(String value) {
            addCriterion("short_description <", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLessThanOrEqualTo(String value) {
            addCriterion("short_description <=", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLike(String value) {
            addCriterion("short_description like", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotLike(String value) {
            addCriterion("short_description not like", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIn(List<String> values) {
            addCriterion("short_description in", values, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotIn(List<String> values) {
            addCriterion("short_description not in", values, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionBetween(String value1, String value2) {
            addCriterion("short_description between", value1, value2, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotBetween(String value1, String value2) {
            addCriterion("short_description not between", value1, value2, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(String value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(String value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(String value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(String value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(String value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(String value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLike(String value) {
            addCriterion("problem_id like", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotLike(String value) {
            addCriterion("problem_id not like", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<String> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<String> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(String value1, String value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(String value1, String value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andCloseCodeIsNull() {
            addCriterion("close_code is null");
            return (Criteria) this;
        }

        public Criteria andCloseCodeIsNotNull() {
            addCriterion("close_code is not null");
            return (Criteria) this;
        }

        public Criteria andCloseCodeEqualTo(String value) {
            addCriterion("close_code =", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeNotEqualTo(String value) {
            addCriterion("close_code <>", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeGreaterThan(String value) {
            addCriterion("close_code >", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("close_code >=", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeLessThan(String value) {
            addCriterion("close_code <", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeLessThanOrEqualTo(String value) {
            addCriterion("close_code <=", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeLike(String value) {
            addCriterion("close_code like", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeNotLike(String value) {
            addCriterion("close_code not like", value, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeIn(List<String> values) {
            addCriterion("close_code in", values, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeNotIn(List<String> values) {
            addCriterion("close_code not in", values, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeBetween(String value1, String value2) {
            addCriterion("close_code between", value1, value2, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseCodeNotBetween(String value1, String value2) {
            addCriterion("close_code not between", value1, value2, "closeCode");
            return (Criteria) this;
        }

        public Criteria andCloseNotesIsNull() {
            addCriterion("close_notes is null");
            return (Criteria) this;
        }

        public Criteria andCloseNotesIsNotNull() {
            addCriterion("close_notes is not null");
            return (Criteria) this;
        }

        public Criteria andCloseNotesEqualTo(String value) {
            addCriterion("close_notes =", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesNotEqualTo(String value) {
            addCriterion("close_notes <>", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesGreaterThan(String value) {
            addCriterion("close_notes >", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesGreaterThanOrEqualTo(String value) {
            addCriterion("close_notes >=", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesLessThan(String value) {
            addCriterion("close_notes <", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesLessThanOrEqualTo(String value) {
            addCriterion("close_notes <=", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesLike(String value) {
            addCriterion("close_notes like", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesNotLike(String value) {
            addCriterion("close_notes not like", value, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesIn(List<String> values) {
            addCriterion("close_notes in", values, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesNotIn(List<String> values) {
            addCriterion("close_notes not in", values, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesBetween(String value1, String value2) {
            addCriterion("close_notes between", value1, value2, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCloseNotesNotBetween(String value1, String value2) {
            addCriterion("close_notes not between", value1, value2, "closeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseCodeIsNull() {
            addCriterion("cause_code is null");
            return (Criteria) this;
        }

        public Criteria andCauseCodeIsNotNull() {
            addCriterion("cause_code is not null");
            return (Criteria) this;
        }

        public Criteria andCauseCodeEqualTo(String value) {
            addCriterion("cause_code =", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeNotEqualTo(String value) {
            addCriterion("cause_code <>", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeGreaterThan(String value) {
            addCriterion("cause_code >", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cause_code >=", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeLessThan(String value) {
            addCriterion("cause_code <", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeLessThanOrEqualTo(String value) {
            addCriterion("cause_code <=", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeLike(String value) {
            addCriterion("cause_code like", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeNotLike(String value) {
            addCriterion("cause_code not like", value, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeIn(List<String> values) {
            addCriterion("cause_code in", values, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeNotIn(List<String> values) {
            addCriterion("cause_code not in", values, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeBetween(String value1, String value2) {
            addCriterion("cause_code between", value1, value2, "causeCode");
            return (Criteria) this;
        }

        public Criteria andCauseCodeNotBetween(String value1, String value2) {
            addCriterion("cause_code not between", value1, value2, "causeCode");
            return (Criteria) this;
        }

        public Criteria andClosedByIsNull() {
            addCriterion("closed_by is null");
            return (Criteria) this;
        }

        public Criteria andClosedByIsNotNull() {
            addCriterion("closed_by is not null");
            return (Criteria) this;
        }

        public Criteria andClosedByEqualTo(String value) {
            addCriterion("closed_by =", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByNotEqualTo(String value) {
            addCriterion("closed_by <>", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByGreaterThan(String value) {
            addCriterion("closed_by >", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByGreaterThanOrEqualTo(String value) {
            addCriterion("closed_by >=", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByLessThan(String value) {
            addCriterion("closed_by <", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByLessThanOrEqualTo(String value) {
            addCriterion("closed_by <=", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByLike(String value) {
            addCriterion("closed_by like", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByNotLike(String value) {
            addCriterion("closed_by not like", value, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByIn(List<String> values) {
            addCriterion("closed_by in", values, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByNotIn(List<String> values) {
            addCriterion("closed_by not in", values, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByBetween(String value1, String value2) {
            addCriterion("closed_by between", value1, value2, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedByNotBetween(String value1, String value2) {
            addCriterion("closed_by not between", value1, value2, "closedBy");
            return (Criteria) this;
        }

        public Criteria andClosedTimeIsNull() {
            addCriterion("closed_time is null");
            return (Criteria) this;
        }

        public Criteria andClosedTimeIsNotNull() {
            addCriterion("closed_time is not null");
            return (Criteria) this;
        }

        public Criteria andClosedTimeEqualTo(Date value) {
            addCriterion("closed_time =", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeNotEqualTo(Date value) {
            addCriterion("closed_time <>", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeGreaterThan(Date value) {
            addCriterion("closed_time >", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("closed_time >=", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeLessThan(Date value) {
            addCriterion("closed_time <", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeLessThanOrEqualTo(Date value) {
            addCriterion("closed_time <=", value, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeIn(List<Date> values) {
            addCriterion("closed_time in", values, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeNotIn(List<Date> values) {
            addCriterion("closed_time not in", values, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeBetween(Date value1, Date value2) {
            addCriterion("closed_time between", value1, value2, "closedTime");
            return (Criteria) this;
        }

        public Criteria andClosedTimeNotBetween(Date value1, Date value2) {
            addCriterion("closed_time not between", value1, value2, "closedTime");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
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

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andSysModCountIsNull() {
            addCriterion("sys_mod_count is null");
            return (Criteria) this;
        }

        public Criteria andSysModCountIsNotNull() {
            addCriterion("sys_mod_count is not null");
            return (Criteria) this;
        }

        public Criteria andSysModCountEqualTo(Integer value) {
            addCriterion("sys_mod_count =", value, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountNotEqualTo(Integer value) {
            addCriterion("sys_mod_count <>", value, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountGreaterThan(Integer value) {
            addCriterion("sys_mod_count >", value, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_mod_count >=", value, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountLessThan(Integer value) {
            addCriterion("sys_mod_count <", value, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountLessThanOrEqualTo(Integer value) {
            addCriterion("sys_mod_count <=", value, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountIn(List<Integer> values) {
            addCriterion("sys_mod_count in", values, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountNotIn(List<Integer> values) {
            addCriterion("sys_mod_count not in", values, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountBetween(Integer value1, Integer value2) {
            addCriterion("sys_mod_count between", value1, value2, "sysModCount");
            return (Criteria) this;
        }

        public Criteria andSysModCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_mod_count not between", value1, value2, "sysModCount");
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