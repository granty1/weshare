package com.weshare.pojo;

import java.util.ArrayList;
import java.util.List;

public class WsUserDescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsUserDescExample() {
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

        public Criteria andUBithIsNull() {
            addCriterion("u_bith is null");
            return (Criteria) this;
        }

        public Criteria andUBithIsNotNull() {
            addCriterion("u_bith is not null");
            return (Criteria) this;
        }

        public Criteria andUBithEqualTo(String value) {
            addCriterion("u_bith =", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithNotEqualTo(String value) {
            addCriterion("u_bith <>", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithGreaterThan(String value) {
            addCriterion("u_bith >", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithGreaterThanOrEqualTo(String value) {
            addCriterion("u_bith >=", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithLessThan(String value) {
            addCriterion("u_bith <", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithLessThanOrEqualTo(String value) {
            addCriterion("u_bith <=", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithLike(String value) {
            addCriterion("u_bith like", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithNotLike(String value) {
            addCriterion("u_bith not like", value, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithIn(List<String> values) {
            addCriterion("u_bith in", values, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithNotIn(List<String> values) {
            addCriterion("u_bith not in", values, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithBetween(String value1, String value2) {
            addCriterion("u_bith between", value1, value2, "uBith");
            return (Criteria) this;
        }

        public Criteria andUBithNotBetween(String value1, String value2) {
            addCriterion("u_bith not between", value1, value2, "uBith");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNull() {
            addCriterion("u_address is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNotNull() {
            addCriterion("u_address is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressEqualTo(String value) {
            addCriterion("u_address =", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotEqualTo(String value) {
            addCriterion("u_address <>", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThan(String value) {
            addCriterion("u_address >", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThanOrEqualTo(String value) {
            addCriterion("u_address >=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThan(String value) {
            addCriterion("u_address <", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThanOrEqualTo(String value) {
            addCriterion("u_address <=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLike(String value) {
            addCriterion("u_address like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotLike(String value) {
            addCriterion("u_address not like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressIn(List<String> values) {
            addCriterion("u_address in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotIn(List<String> values) {
            addCriterion("u_address not in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressBetween(String value1, String value2) {
            addCriterion("u_address between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotBetween(String value1, String value2) {
            addCriterion("u_address not between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUQqnumIsNull() {
            addCriterion("u_qqnum is null");
            return (Criteria) this;
        }

        public Criteria andUQqnumIsNotNull() {
            addCriterion("u_qqnum is not null");
            return (Criteria) this;
        }

        public Criteria andUQqnumEqualTo(Long value) {
            addCriterion("u_qqnum =", value, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumNotEqualTo(Long value) {
            addCriterion("u_qqnum <>", value, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumGreaterThan(Long value) {
            addCriterion("u_qqnum >", value, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumGreaterThanOrEqualTo(Long value) {
            addCriterion("u_qqnum >=", value, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumLessThan(Long value) {
            addCriterion("u_qqnum <", value, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumLessThanOrEqualTo(Long value) {
            addCriterion("u_qqnum <=", value, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumIn(List<Long> values) {
            addCriterion("u_qqnum in", values, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumNotIn(List<Long> values) {
            addCriterion("u_qqnum not in", values, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumBetween(Long value1, Long value2) {
            addCriterion("u_qqnum between", value1, value2, "uQqnum");
            return (Criteria) this;
        }

        public Criteria andUQqnumNotBetween(Long value1, Long value2) {
            addCriterion("u_qqnum not between", value1, value2, "uQqnum");
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