package com.weshare.pojo;

import java.util.ArrayList;
import java.util.List;

public class WsArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsArticleExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Long value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Long value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Long value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Long value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Long value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Long value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Long> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Long> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Long value1, Long value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Long value1, Long value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andAKindIsNull() {
            addCriterion("a_kind is null");
            return (Criteria) this;
        }

        public Criteria andAKindIsNotNull() {
            addCriterion("a_kind is not null");
            return (Criteria) this;
        }

        public Criteria andAKindEqualTo(String value) {
            addCriterion("a_kind =", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindNotEqualTo(String value) {
            addCriterion("a_kind <>", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindGreaterThan(String value) {
            addCriterion("a_kind >", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindGreaterThanOrEqualTo(String value) {
            addCriterion("a_kind >=", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindLessThan(String value) {
            addCriterion("a_kind <", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindLessThanOrEqualTo(String value) {
            addCriterion("a_kind <=", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindLike(String value) {
            addCriterion("a_kind like", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindNotLike(String value) {
            addCriterion("a_kind not like", value, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindIn(List<String> values) {
            addCriterion("a_kind in", values, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindNotIn(List<String> values) {
            addCriterion("a_kind not in", values, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindBetween(String value1, String value2) {
            addCriterion("a_kind between", value1, value2, "aKind");
            return (Criteria) this;
        }

        public Criteria andAKindNotBetween(String value1, String value2) {
            addCriterion("a_kind not between", value1, value2, "aKind");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andASeenumIsNull() {
            addCriterion("a_seenum is null");
            return (Criteria) this;
        }

        public Criteria andASeenumIsNotNull() {
            addCriterion("a_seenum is not null");
            return (Criteria) this;
        }

        public Criteria andASeenumEqualTo(Integer value) {
            addCriterion("a_seenum =", value, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumNotEqualTo(Integer value) {
            addCriterion("a_seenum <>", value, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumGreaterThan(Integer value) {
            addCriterion("a_seenum >", value, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_seenum >=", value, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumLessThan(Integer value) {
            addCriterion("a_seenum <", value, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumLessThanOrEqualTo(Integer value) {
            addCriterion("a_seenum <=", value, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumIn(List<Integer> values) {
            addCriterion("a_seenum in", values, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumNotIn(List<Integer> values) {
            addCriterion("a_seenum not in", values, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumBetween(Integer value1, Integer value2) {
            addCriterion("a_seenum between", value1, value2, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andASeenumNotBetween(Integer value1, Integer value2) {
            addCriterion("a_seenum not between", value1, value2, "aSeenum");
            return (Criteria) this;
        }

        public Criteria andACtimeIsNull() {
            addCriterion("a_ctime is null");
            return (Criteria) this;
        }

        public Criteria andACtimeIsNotNull() {
            addCriterion("a_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andACtimeEqualTo(String value) {
            addCriterion("a_ctime =", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeNotEqualTo(String value) {
            addCriterion("a_ctime <>", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeGreaterThan(String value) {
            addCriterion("a_ctime >", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeGreaterThanOrEqualTo(String value) {
            addCriterion("a_ctime >=", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeLessThan(String value) {
            addCriterion("a_ctime <", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeLessThanOrEqualTo(String value) {
            addCriterion("a_ctime <=", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeLike(String value) {
            addCriterion("a_ctime like", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeNotLike(String value) {
            addCriterion("a_ctime not like", value, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeIn(List<String> values) {
            addCriterion("a_ctime in", values, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeNotIn(List<String> values) {
            addCriterion("a_ctime not in", values, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeBetween(String value1, String value2) {
            addCriterion("a_ctime between", value1, value2, "aCtime");
            return (Criteria) this;
        }

        public Criteria andACtimeNotBetween(String value1, String value2) {
            addCriterion("a_ctime not between", value1, value2, "aCtime");
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