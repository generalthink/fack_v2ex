package com.generalthink.v2ex.data.entity;

import java.util.ArrayList;
import java.util.List;

public class UserMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMessageExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdIsNull() {
            addCriterion("notice_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdIsNotNull() {
            addCriterion("notice_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdEqualTo(Integer value) {
            addCriterion("notice_user_id =", value, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdNotEqualTo(Integer value) {
            addCriterion("notice_user_id <>", value, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdGreaterThan(Integer value) {
            addCriterion("notice_user_id >", value, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_user_id >=", value, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdLessThan(Integer value) {
            addCriterion("notice_user_id <", value, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_user_id <=", value, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdIn(List<Integer> values) {
            addCriterion("notice_user_id in", values, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdNotIn(List<Integer> values) {
            addCriterion("notice_user_id not in", values, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_user_id between", value1, value2, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andNoticeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_user_id not between", value1, value2, "noticeUserId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(String value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(String value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(String value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(String value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLike(String value) {
            addCriterion("message_type like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotLike(String value) {
            addCriterion("message_type not like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<String> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<String> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(String value1, String value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(String value1, String value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIsNull() {
            addCriterion("message_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIsNotNull() {
            addCriterion("message_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdEqualTo(Integer value) {
            addCriterion("message_type_id =", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotEqualTo(Integer value) {
            addCriterion("message_type_id <>", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdGreaterThan(Integer value) {
            addCriterion("message_type_id >", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_type_id >=", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdLessThan(Integer value) {
            addCriterion("message_type_id <", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_type_id <=", value, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdIn(List<Integer> values) {
            addCriterion("message_type_id in", values, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotIn(List<Integer> values) {
            addCriterion("message_type_id not in", values, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("message_type_id between", value1, value2, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_type_id not between", value1, value2, "messageTypeId");
            return (Criteria) this;
        }

        public Criteria andMessageReadIsNull() {
            addCriterion("message_read is null");
            return (Criteria) this;
        }

        public Criteria andMessageReadIsNotNull() {
            addCriterion("message_read is not null");
            return (Criteria) this;
        }

        public Criteria andMessageReadEqualTo(Byte value) {
            addCriterion("message_read =", value, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadNotEqualTo(Byte value) {
            addCriterion("message_read <>", value, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadGreaterThan(Byte value) {
            addCriterion("message_read >", value, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadGreaterThanOrEqualTo(Byte value) {
            addCriterion("message_read >=", value, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadLessThan(Byte value) {
            addCriterion("message_read <", value, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadLessThanOrEqualTo(Byte value) {
            addCriterion("message_read <=", value, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadIn(List<Byte> values) {
            addCriterion("message_read in", values, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadNotIn(List<Byte> values) {
            addCriterion("message_read not in", values, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadBetween(Byte value1, Byte value2) {
            addCriterion("message_read between", value1, value2, "messageRead");
            return (Criteria) this;
        }

        public Criteria andMessageReadNotBetween(Byte value1, Byte value2) {
            addCriterion("message_read not between", value1, value2, "messageRead");
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