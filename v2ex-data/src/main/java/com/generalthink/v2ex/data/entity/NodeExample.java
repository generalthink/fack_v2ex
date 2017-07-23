package com.generalthink.v2ex.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAliasesIsNull() {
            addCriterion("aliases is null");
            return (Criteria) this;
        }

        public Criteria andAliasesIsNotNull() {
            addCriterion("aliases is not null");
            return (Criteria) this;
        }

        public Criteria andAliasesEqualTo(String value) {
            addCriterion("aliases =", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesNotEqualTo(String value) {
            addCriterion("aliases <>", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesGreaterThan(String value) {
            addCriterion("aliases >", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesGreaterThanOrEqualTo(String value) {
            addCriterion("aliases >=", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesLessThan(String value) {
            addCriterion("aliases <", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesLessThanOrEqualTo(String value) {
            addCriterion("aliases <=", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesLike(String value) {
            addCriterion("aliases like", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesNotLike(String value) {
            addCriterion("aliases not like", value, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesIn(List<String> values) {
            addCriterion("aliases in", values, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesNotIn(List<String> values) {
            addCriterion("aliases not in", values, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesBetween(String value1, String value2) {
            addCriterion("aliases between", value1, value2, "aliases");
            return (Criteria) this;
        }

        public Criteria andAliasesNotBetween(String value1, String value2) {
            addCriterion("aliases not between", value1, value2, "aliases");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdIsNull() {
            addCriterion("node_group_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdIsNotNull() {
            addCriterion("node_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdEqualTo(Integer value) {
            addCriterion("node_group_id =", value, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdNotEqualTo(Integer value) {
            addCriterion("node_group_id <>", value, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdGreaterThan(Integer value) {
            addCriterion("node_group_id >", value, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_group_id >=", value, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdLessThan(Integer value) {
            addCriterion("node_group_id <", value, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("node_group_id <=", value, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdIn(List<Integer> values) {
            addCriterion("node_group_id in", values, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdNotIn(List<Integer> values) {
            addCriterion("node_group_id not in", values, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("node_group_id between", value1, value2, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("node_group_id not between", value1, value2, "nodeGroupId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdIsNull() {
            addCriterion("node_category_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdIsNotNull() {
            addCriterion("node_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdEqualTo(Integer value) {
            addCriterion("node_category_id =", value, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdNotEqualTo(Integer value) {
            addCriterion("node_category_id <>", value, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdGreaterThan(Integer value) {
            addCriterion("node_category_id >", value, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_category_id >=", value, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdLessThan(Integer value) {
            addCriterion("node_category_id <", value, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("node_category_id <=", value, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdIn(List<Integer> values) {
            addCriterion("node_category_id in", values, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdNotIn(List<Integer> values) {
            addCriterion("node_category_id not in", values, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("node_category_id between", value1, value2, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andNodeCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("node_category_id not between", value1, value2, "nodeCategoryId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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