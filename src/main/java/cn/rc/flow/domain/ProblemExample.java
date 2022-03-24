package cn.rc.flow.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andFirstReportedByTaskIsNull() {
            addCriterion("first_reported_by_task is null");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskIsNotNull() {
            addCriterion("first_reported_by_task is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskEqualTo(String value) {
            addCriterion("first_reported_by_task =", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskNotEqualTo(String value) {
            addCriterion("first_reported_by_task <>", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskGreaterThan(String value) {
            addCriterion("first_reported_by_task >", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskGreaterThanOrEqualTo(String value) {
            addCriterion("first_reported_by_task >=", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskLessThan(String value) {
            addCriterion("first_reported_by_task <", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskLessThanOrEqualTo(String value) {
            addCriterion("first_reported_by_task <=", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskLike(String value) {
            addCriterion("first_reported_by_task like", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskNotLike(String value) {
            addCriterion("first_reported_by_task not like", value, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskIn(List<String> values) {
            addCriterion("first_reported_by_task in", values, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskNotIn(List<String> values) {
            addCriterion("first_reported_by_task not in", values, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskBetween(String value1, String value2) {
            addCriterion("first_reported_by_task between", value1, value2, "firstReportedByTask");
            return (Criteria) this;
        }

        public Criteria andFirstReportedByTaskNotBetween(String value1, String value2) {
            addCriterion("first_reported_by_task not between", value1, value2, "firstReportedByTask");
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

        public Criteria andWorkaroundIsNull() {
            addCriterion("workaround is null");
            return (Criteria) this;
        }

        public Criteria andWorkaroundIsNotNull() {
            addCriterion("workaround is not null");
            return (Criteria) this;
        }

        public Criteria andWorkaroundEqualTo(String value) {
            addCriterion("workaround =", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundNotEqualTo(String value) {
            addCriterion("workaround <>", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundGreaterThan(String value) {
            addCriterion("workaround >", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundGreaterThanOrEqualTo(String value) {
            addCriterion("workaround >=", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundLessThan(String value) {
            addCriterion("workaround <", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundLessThanOrEqualTo(String value) {
            addCriterion("workaround <=", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundLike(String value) {
            addCriterion("workaround like", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundNotLike(String value) {
            addCriterion("workaround not like", value, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundIn(List<String> values) {
            addCriterion("workaround in", values, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundNotIn(List<String> values) {
            addCriterion("workaround not in", values, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundBetween(String value1, String value2) {
            addCriterion("workaround between", value1, value2, "workaround");
            return (Criteria) this;
        }

        public Criteria andWorkaroundNotBetween(String value1, String value2) {
            addCriterion("workaround not between", value1, value2, "workaround");
            return (Criteria) this;
        }

        public Criteria andCauseNotesIsNull() {
            addCriterion("cause_notes is null");
            return (Criteria) this;
        }

        public Criteria andCauseNotesIsNotNull() {
            addCriterion("cause_notes is not null");
            return (Criteria) this;
        }

        public Criteria andCauseNotesEqualTo(String value) {
            addCriterion("cause_notes =", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesNotEqualTo(String value) {
            addCriterion("cause_notes <>", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesGreaterThan(String value) {
            addCriterion("cause_notes >", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesGreaterThanOrEqualTo(String value) {
            addCriterion("cause_notes >=", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesLessThan(String value) {
            addCriterion("cause_notes <", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesLessThanOrEqualTo(String value) {
            addCriterion("cause_notes <=", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesLike(String value) {
            addCriterion("cause_notes like", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesNotLike(String value) {
            addCriterion("cause_notes not like", value, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesIn(List<String> values) {
            addCriterion("cause_notes in", values, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesNotIn(List<String> values) {
            addCriterion("cause_notes not in", values, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesBetween(String value1, String value2) {
            addCriterion("cause_notes between", value1, value2, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andCauseNotesNotBetween(String value1, String value2) {
            addCriterion("cause_notes not between", value1, value2, "causeNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesIsNull() {
            addCriterion("fix_notes is null");
            return (Criteria) this;
        }

        public Criteria andFixNotesIsNotNull() {
            addCriterion("fix_notes is not null");
            return (Criteria) this;
        }

        public Criteria andFixNotesEqualTo(String value) {
            addCriterion("fix_notes =", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesNotEqualTo(String value) {
            addCriterion("fix_notes <>", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesGreaterThan(String value) {
            addCriterion("fix_notes >", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesGreaterThanOrEqualTo(String value) {
            addCriterion("fix_notes >=", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesLessThan(String value) {
            addCriterion("fix_notes <", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesLessThanOrEqualTo(String value) {
            addCriterion("fix_notes <=", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesLike(String value) {
            addCriterion("fix_notes like", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesNotLike(String value) {
            addCriterion("fix_notes not like", value, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesIn(List<String> values) {
            addCriterion("fix_notes in", values, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesNotIn(List<String> values) {
            addCriterion("fix_notes not in", values, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesBetween(String value1, String value2) {
            addCriterion("fix_notes between", value1, value2, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andFixNotesNotBetween(String value1, String value2) {
            addCriterion("fix_notes not between", value1, value2, "fixNotes");
            return (Criteria) this;
        }

        public Criteria andResolvedByIsNull() {
            addCriterion("resolved_by is null");
            return (Criteria) this;
        }

        public Criteria andResolvedByIsNotNull() {
            addCriterion("resolved_by is not null");
            return (Criteria) this;
        }

        public Criteria andResolvedByEqualTo(String value) {
            addCriterion("resolved_by =", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByNotEqualTo(String value) {
            addCriterion("resolved_by <>", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByGreaterThan(String value) {
            addCriterion("resolved_by >", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByGreaterThanOrEqualTo(String value) {
            addCriterion("resolved_by >=", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByLessThan(String value) {
            addCriterion("resolved_by <", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByLessThanOrEqualTo(String value) {
            addCriterion("resolved_by <=", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByLike(String value) {
            addCriterion("resolved_by like", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByNotLike(String value) {
            addCriterion("resolved_by not like", value, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByIn(List<String> values) {
            addCriterion("resolved_by in", values, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByNotIn(List<String> values) {
            addCriterion("resolved_by not in", values, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByBetween(String value1, String value2) {
            addCriterion("resolved_by between", value1, value2, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedByNotBetween(String value1, String value2) {
            addCriterion("resolved_by not between", value1, value2, "resolvedBy");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeIsNull() {
            addCriterion("resolved_time is null");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeIsNotNull() {
            addCriterion("resolved_time is not null");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeEqualTo(Date value) {
            addCriterion("resolved_time =", value, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeNotEqualTo(Date value) {
            addCriterion("resolved_time <>", value, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeGreaterThan(Date value) {
            addCriterion("resolved_time >", value, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("resolved_time >=", value, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeLessThan(Date value) {
            addCriterion("resolved_time <", value, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeLessThanOrEqualTo(Date value) {
            addCriterion("resolved_time <=", value, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeIn(List<Date> values) {
            addCriterion("resolved_time in", values, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeNotIn(List<Date> values) {
            addCriterion("resolved_time not in", values, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeBetween(Date value1, Date value2) {
            addCriterion("resolved_time between", value1, value2, "resolvedTime");
            return (Criteria) this;
        }

        public Criteria andResolvedTimeNotBetween(Date value1, Date value2) {
            addCriterion("resolved_time not between", value1, value2, "resolvedTime");
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