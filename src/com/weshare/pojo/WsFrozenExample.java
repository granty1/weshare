package com.weshare.pojo;

import java.util.ArrayList;
import java.util.List;

public class WsFrozenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsFrozenExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Long value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Long value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Long value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Long value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Long value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Long value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Long> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Long> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Long value1, Long value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Long value1, Long value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andFCauseIsNull() {
            addCriterion("f_cause is null");
            return (Criteria) this;
        }

        public Criteria andFCauseIsNotNull() {
            addCriterion("f_cause is not null");
            return (Criteria) this;
        }

        public Criteria andFCauseEqualTo(String value) {
            addCriterion("f_cause =", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseNotEqualTo(String value) {
            addCriterion("f_cause <>", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseGreaterThan(String value) {
            addCriterion("f_cause >", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseGreaterThanOrEqualTo(String value) {
            addCriterion("f_cause >=", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseLessThan(String value) {
            addCriterion("f_cause <", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseLessThanOrEqualTo(String value) {
            addCriterion("f_cause <=", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseLike(String value) {
            addCriterion("f_cause like", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseNotLike(String value) {
            addCriterion("f_cause not like", value, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseIn(List<String> values) {
            addCriterion("f_cause in", values, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseNotIn(List<String> values) {
            addCriterion("f_cause not in", values, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseBetween(String value1, String value2) {
            addCriterion("f_cause between", value1, value2, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCauseNotBetween(String value1, String value2) {
            addCriterion("f_cause not between", value1, value2, "fCause");
            return (Criteria) this;
        }

        public Criteria andFCtimeIsNull() {
            addCriterion("f_ctime is null");
            return (Criteria) this;
        }

        public Criteria andFCtimeIsNotNull() {
            addCriterion("f_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andFCtimeEqualTo(String value) {
            addCriterion("f_ctime =", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeNotEqualTo(String value) {
            addCriterion("f_ctime <>", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeGreaterThan(String value) {
            addCriterion("f_ctime >", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("f_ctime >=", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeLessThan(String value) {
            addCriterion("f_ctime <", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeLessThanOrEqualTo(String value) {
            addCriterion("f_ctime <=", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeLike(String value) {
            addCriterion("f_ctime like", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeNotLike(String value) {
            addCriterion("f_ctime not like", value, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeIn(List<String> values) {
            addCriterion("f_ctime in", values, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeNotIn(List<String> values) {
            addCriterion("f_ctime not in", values, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeBetween(String value1, String value2) {
            addCriterion("f_ctime between", value1, value2, "fCtime");
            return (Criteria) this;
        }

        public Criteria andFCtimeNotBetween(String value1, String value2) {
            addCriterion("f_ctime not between", value1, value2, "fCtime");
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