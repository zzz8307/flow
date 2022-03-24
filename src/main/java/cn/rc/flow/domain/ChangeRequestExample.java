package cn.rc.flow.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChangeRequestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangeRequestExample() {
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

        public Criteria andRequestedByIsNull() {
            addCriterion("requested_by is null");
            return (Criteria) this;
        }

        public Criteria andRequestedByIsNotNull() {
            addCriterion("requested_by is not null");
            return (Criteria) this;
        }

        public Criteria andRequestedByEqualTo(String value) {
            addCriterion("requested_by =", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByNotEqualTo(String value) {
            addCriterion("requested_by <>", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByGreaterThan(String value) {
            addCriterion("requested_by >", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByGreaterThanOrEqualTo(String value) {
            addCriterion("requested_by >=", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByLessThan(String value) {
            addCriterion("requested_by <", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByLessThanOrEqualTo(String value) {
            addCriterion("requested_by <=", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByLike(String value) {
            addCriterion("requested_by like", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByNotLike(String value) {
            addCriterion("requested_by not like", value, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByIn(List<String> values) {
            addCriterion("requested_by in", values, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByNotIn(List<String> values) {
            addCriterion("requested_by not in", values, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByBetween(String value1, String value2) {
            addCriterion("requested_by between", value1, value2, "requestedBy");
            return (Criteria) this;
        }

        public Criteria andRequestedByNotBetween(String value1, String value2) {
            addCriterion("requested_by not between", value1, value2, "requestedBy");
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

        public Criteria andApprovalIsNull() {
            addCriterion("approval is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNotNull() {
            addCriterion("approval is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalEqualTo(String value) {
            addCriterion("approval =", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotEqualTo(String value) {
            addCriterion("approval <>", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThan(String value) {
            addCriterion("approval >", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("approval >=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThan(String value) {
            addCriterion("approval <", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThanOrEqualTo(String value) {
            addCriterion("approval <=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLike(String value) {
            addCriterion("approval like", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotLike(String value) {
            addCriterion("approval not like", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalIn(List<String> values) {
            addCriterion("approval in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotIn(List<String> values) {
            addCriterion("approval not in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalBetween(String value1, String value2) {
            addCriterion("approval between", value1, value2, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotBetween(String value1, String value2) {
            addCriterion("approval not between", value1, value2, "approval");
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

        public Criteria andRiskIsNull() {
            addCriterion("risk is null");
            return (Criteria) this;
        }

        public Criteria andRiskIsNotNull() {
            addCriterion("risk is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEqualTo(Integer value) {
            addCriterion("risk =", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotEqualTo(Integer value) {
            addCriterion("risk <>", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThan(Integer value) {
            addCriterion("risk >", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk >=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThan(Integer value) {
            addCriterion("risk <", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThanOrEqualTo(Integer value) {
            addCriterion("risk <=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskIn(List<Integer> values) {
            addCriterion("risk in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotIn(List<Integer> values) {
            addCriterion("risk not in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskBetween(Integer value1, Integer value2) {
            addCriterion("risk between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotBetween(Integer value1, Integer value2) {
            addCriterion("risk not between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andImpactIsNull() {
            addCriterion("impact is null");
            return (Criteria) this;
        }

        public Criteria andImpactIsNotNull() {
            addCriterion("impact is not null");
            return (Criteria) this;
        }

        public Criteria andImpactEqualTo(Integer value) {
            addCriterion("impact =", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactNotEqualTo(Integer value) {
            addCriterion("impact <>", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactGreaterThan(Integer value) {
            addCriterion("impact >", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactGreaterThanOrEqualTo(Integer value) {
            addCriterion("impact >=", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactLessThan(Integer value) {
            addCriterion("impact <", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactLessThanOrEqualTo(Integer value) {
            addCriterion("impact <=", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactIn(List<Integer> values) {
            addCriterion("impact in", values, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactNotIn(List<Integer> values) {
            addCriterion("impact not in", values, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactBetween(Integer value1, Integer value2) {
            addCriterion("impact between", value1, value2, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactNotBetween(Integer value1, Integer value2) {
            addCriterion("impact not between", value1, value2, "impact");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupIsNull() {
            addCriterion("owner_group is null");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupIsNotNull() {
            addCriterion("owner_group is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupEqualTo(String value) {
            addCriterion("owner_group =", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupNotEqualTo(String value) {
            addCriterion("owner_group <>", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupGreaterThan(String value) {
            addCriterion("owner_group >", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("owner_group >=", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupLessThan(String value) {
            addCriterion("owner_group <", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupLessThanOrEqualTo(String value) {
            addCriterion("owner_group <=", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupLike(String value) {
            addCriterion("owner_group like", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupNotLike(String value) {
            addCriterion("owner_group not like", value, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupIn(List<String> values) {
            addCriterion("owner_group in", values, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupNotIn(List<String> values) {
            addCriterion("owner_group not in", values, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupBetween(String value1, String value2) {
            addCriterion("owner_group between", value1, value2, "ownerGroup");
            return (Criteria) this;
        }

        public Criteria andOwnerGroupNotBetween(String value1, String value2) {
            addCriterion("owner_group not between", value1, value2, "ownerGroup");
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

        public Criteria andJustificationIsNull() {
            addCriterion("justification is null");
            return (Criteria) this;
        }

        public Criteria andJustificationIsNotNull() {
            addCriterion("justification is not null");
            return (Criteria) this;
        }

        public Criteria andJustificationEqualTo(String value) {
            addCriterion("justification =", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationNotEqualTo(String value) {
            addCriterion("justification <>", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationGreaterThan(String value) {
            addCriterion("justification >", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationGreaterThanOrEqualTo(String value) {
            addCriterion("justification >=", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationLessThan(String value) {
            addCriterion("justification <", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationLessThanOrEqualTo(String value) {
            addCriterion("justification <=", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationLike(String value) {
            addCriterion("justification like", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationNotLike(String value) {
            addCriterion("justification not like", value, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationIn(List<String> values) {
            addCriterion("justification in", values, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationNotIn(List<String> values) {
            addCriterion("justification not in", values, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationBetween(String value1, String value2) {
            addCriterion("justification between", value1, value2, "justification");
            return (Criteria) this;
        }

        public Criteria andJustificationNotBetween(String value1, String value2) {
            addCriterion("justification not between", value1, value2, "justification");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanIsNull() {
            addCriterion("implementation_plan is null");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanIsNotNull() {
            addCriterion("implementation_plan is not null");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanEqualTo(String value) {
            addCriterion("implementation_plan =", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanNotEqualTo(String value) {
            addCriterion("implementation_plan <>", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanGreaterThan(String value) {
            addCriterion("implementation_plan >", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanGreaterThanOrEqualTo(String value) {
            addCriterion("implementation_plan >=", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanLessThan(String value) {
            addCriterion("implementation_plan <", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanLessThanOrEqualTo(String value) {
            addCriterion("implementation_plan <=", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanLike(String value) {
            addCriterion("implementation_plan like", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanNotLike(String value) {
            addCriterion("implementation_plan not like", value, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanIn(List<String> values) {
            addCriterion("implementation_plan in", values, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanNotIn(List<String> values) {
            addCriterion("implementation_plan not in", values, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanBetween(String value1, String value2) {
            addCriterion("implementation_plan between", value1, value2, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andImplementationPlanNotBetween(String value1, String value2) {
            addCriterion("implementation_plan not between", value1, value2, "implementationPlan");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisIsNull() {
            addCriterion("risk_impact_analysis is null");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisIsNotNull() {
            addCriterion("risk_impact_analysis is not null");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisEqualTo(String value) {
            addCriterion("risk_impact_analysis =", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisNotEqualTo(String value) {
            addCriterion("risk_impact_analysis <>", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisGreaterThan(String value) {
            addCriterion("risk_impact_analysis >", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("risk_impact_analysis >=", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisLessThan(String value) {
            addCriterion("risk_impact_analysis <", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisLessThanOrEqualTo(String value) {
            addCriterion("risk_impact_analysis <=", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisLike(String value) {
            addCriterion("risk_impact_analysis like", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisNotLike(String value) {
            addCriterion("risk_impact_analysis not like", value, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisIn(List<String> values) {
            addCriterion("risk_impact_analysis in", values, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisNotIn(List<String> values) {
            addCriterion("risk_impact_analysis not in", values, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisBetween(String value1, String value2) {
            addCriterion("risk_impact_analysis between", value1, value2, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andRiskImpactAnalysisNotBetween(String value1, String value2) {
            addCriterion("risk_impact_analysis not between", value1, value2, "riskImpactAnalysis");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanIsNull() {
            addCriterion("backout_plan is null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanIsNotNull() {
            addCriterion("backout_plan is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanEqualTo(String value) {
            addCriterion("backout_plan =", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanNotEqualTo(String value) {
            addCriterion("backout_plan <>", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanGreaterThan(String value) {
            addCriterion("backout_plan >", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanGreaterThanOrEqualTo(String value) {
            addCriterion("backout_plan >=", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanLessThan(String value) {
            addCriterion("backout_plan <", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanLessThanOrEqualTo(String value) {
            addCriterion("backout_plan <=", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanLike(String value) {
            addCriterion("backout_plan like", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanNotLike(String value) {
            addCriterion("backout_plan not like", value, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanIn(List<String> values) {
            addCriterion("backout_plan in", values, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanNotIn(List<String> values) {
            addCriterion("backout_plan not in", values, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanBetween(String value1, String value2) {
            addCriterion("backout_plan between", value1, value2, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andBackoutPlanNotBetween(String value1, String value2) {
            addCriterion("backout_plan not between", value1, value2, "backoutPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanIsNull() {
            addCriterion("test_plan is null");
            return (Criteria) this;
        }

        public Criteria andTestPlanIsNotNull() {
            addCriterion("test_plan is not null");
            return (Criteria) this;
        }

        public Criteria andTestPlanEqualTo(String value) {
            addCriterion("test_plan =", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanNotEqualTo(String value) {
            addCriterion("test_plan <>", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanGreaterThan(String value) {
            addCriterion("test_plan >", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanGreaterThanOrEqualTo(String value) {
            addCriterion("test_plan >=", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanLessThan(String value) {
            addCriterion("test_plan <", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanLessThanOrEqualTo(String value) {
            addCriterion("test_plan <=", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanLike(String value) {
            addCriterion("test_plan like", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanNotLike(String value) {
            addCriterion("test_plan not like", value, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanIn(List<String> values) {
            addCriterion("test_plan in", values, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanNotIn(List<String> values) {
            addCriterion("test_plan not in", values, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanBetween(String value1, String value2) {
            addCriterion("test_plan between", value1, value2, "testPlan");
            return (Criteria) this;
        }

        public Criteria andTestPlanNotBetween(String value1, String value2) {
            addCriterion("test_plan not between", value1, value2, "testPlan");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateIsNull() {
            addCriterion("planned_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateIsNotNull() {
            addCriterion("planned_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateEqualTo(Date value) {
            addCriterion("planned_start_date =", value, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateNotEqualTo(Date value) {
            addCriterion("planned_start_date <>", value, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateGreaterThan(Date value) {
            addCriterion("planned_start_date >", value, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("planned_start_date >=", value, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateLessThan(Date value) {
            addCriterion("planned_start_date <", value, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateLessThanOrEqualTo(Date value) {
            addCriterion("planned_start_date <=", value, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateIn(List<Date> values) {
            addCriterion("planned_start_date in", values, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateNotIn(List<Date> values) {
            addCriterion("planned_start_date not in", values, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateBetween(Date value1, Date value2) {
            addCriterion("planned_start_date between", value1, value2, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedStartDateNotBetween(Date value1, Date value2) {
            addCriterion("planned_start_date not between", value1, value2, "plannedStartDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateIsNull() {
            addCriterion("planned_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateIsNotNull() {
            addCriterion("planned_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateEqualTo(Date value) {
            addCriterion("planned_end_date =", value, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateNotEqualTo(Date value) {
            addCriterion("planned_end_date <>", value, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateGreaterThan(Date value) {
            addCriterion("planned_end_date >", value, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("planned_end_date >=", value, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateLessThan(Date value) {
            addCriterion("planned_end_date <", value, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateLessThanOrEqualTo(Date value) {
            addCriterion("planned_end_date <=", value, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateIn(List<Date> values) {
            addCriterion("planned_end_date in", values, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateNotIn(List<Date> values) {
            addCriterion("planned_end_date not in", values, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateBetween(Date value1, Date value2) {
            addCriterion("planned_end_date between", value1, value2, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andPlannedEndDateNotBetween(Date value1, Date value2) {
            addCriterion("planned_end_date not between", value1, value2, "plannedEndDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateIsNull() {
            addCriterion("actual_start_date is null");
            return (Criteria) this;
        }

        public Criteria andActualStartDateIsNotNull() {
            addCriterion("actual_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualStartDateEqualTo(Date value) {
            addCriterion("actual_start_date =", value, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateNotEqualTo(Date value) {
            addCriterion("actual_start_date <>", value, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateGreaterThan(Date value) {
            addCriterion("actual_start_date >", value, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("actual_start_date >=", value, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateLessThan(Date value) {
            addCriterion("actual_start_date <", value, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateLessThanOrEqualTo(Date value) {
            addCriterion("actual_start_date <=", value, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateIn(List<Date> values) {
            addCriterion("actual_start_date in", values, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateNotIn(List<Date> values) {
            addCriterion("actual_start_date not in", values, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateBetween(Date value1, Date value2) {
            addCriterion("actual_start_date between", value1, value2, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualStartDateNotBetween(Date value1, Date value2) {
            addCriterion("actual_start_date not between", value1, value2, "actualStartDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateIsNull() {
            addCriterion("actual_end_date is null");
            return (Criteria) this;
        }

        public Criteria andActualEndDateIsNotNull() {
            addCriterion("actual_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualEndDateEqualTo(Date value) {
            addCriterion("actual_end_date =", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateNotEqualTo(Date value) {
            addCriterion("actual_end_date <>", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateGreaterThan(Date value) {
            addCriterion("actual_end_date >", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("actual_end_date >=", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateLessThan(Date value) {
            addCriterion("actual_end_date <", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateLessThanOrEqualTo(Date value) {
            addCriterion("actual_end_date <=", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateIn(List<Date> values) {
            addCriterion("actual_end_date in", values, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateNotIn(List<Date> values) {
            addCriterion("actual_end_date not in", values, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateBetween(Date value1, Date value2) {
            addCriterion("actual_end_date between", value1, value2, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateNotBetween(Date value1, Date value2) {
            addCriterion("actual_end_date not between", value1, value2, "actualEndDate");
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