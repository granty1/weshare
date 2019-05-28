package com.weshare.pojo;

import java.util.ArrayList;
import java.util.List;

public class WsFocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsFocusExample() {
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

        public Criteria andUFocusIsNull() {
            addCriterion("u_focus is null");
            return (Criteria) this;
        }

        public Criteria andUFocusIsNotNull() {
            addCriterion("u_focus is not null");
            return (Criteria) this;
        }

        public Criteria andUFocusEqualTo(Long value) {
            addCriterion("u_focus =", value, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusNotEqualTo(Long value) {
            addCriterion("u_focus <>", value, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusGreaterThan(Long value) {
            addCriterion("u_focus >", value, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusGreaterThanOrEqualTo(Long value) {
            addCriterion("u_focus >=", value, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusLessThan(Long value) {
            addCriterion("u_focus <", value, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusLessThanOrEqualTo(Long value) {
            addCriterion("u_focus <=", value, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusIn(List<Long> values) {
            addCriterion("u_focus in", values, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusNotIn(List<Long> values) {
            addCriterion("u_focus not in", values, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusBetween(Long value1, Long value2) {
            addCriterion("u_focus between", value1, value2, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUFocusNotBetween(Long value1, Long value2) {
            addCriterion("u_focus not between", value1, value2, "uFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusIsNull() {
            addCriterion("u_be_focus is null");
            return (Criteria) this;
        }

        public Criteria andUBeFocusIsNotNull() {
            addCriterion("u_be_focus is not null");
            return (Criteria) this;
        }

        public Criteria andUBeFocusEqualTo(Long value) {
            addCriterion("u_be_focus =", value, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusNotEqualTo(Long value) {
            addCriterion("u_be_focus <>", value, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusGreaterThan(Long value) {
            addCriterion("u_be_focus >", value, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusGreaterThanOrEqualTo(Long value) {
            addCriterion("u_be_focus >=", value, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusLessThan(Long value) {
            addCriterion("u_be_focus <", value, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusLessThanOrEqualTo(Long value) {
            addCriterion("u_be_focus <=", value, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusIn(List<Long> values) {
            addCriterion("u_be_focus in", values, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusNotIn(List<Long> values) {
            addCriterion("u_be_focus not in", values, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusBetween(Long value1, Long value2) {
            addCriterion("u_be_focus between", value1, value2, "uBeFocus");
            return (Criteria) this;
        }

        public Criteria andUBeFocusNotBetween(Long value1, Long value2) {
            addCriterion("u_be_focus not between", value1, value2, "uBeFocus");
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