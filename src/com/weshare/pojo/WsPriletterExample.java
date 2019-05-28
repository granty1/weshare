package com.weshare.pojo;

import java.util.ArrayList;
import java.util.List;

public class WsPriletterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsPriletterExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Long value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Long value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Long value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Long value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Long value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Long> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Long> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Long value1, Long value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Long value1, Long value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPAddreIsNull() {
            addCriterion("p_addre is null");
            return (Criteria) this;
        }

        public Criteria andPAddreIsNotNull() {
            addCriterion("p_addre is not null");
            return (Criteria) this;
        }

        public Criteria andPAddreEqualTo(Long value) {
            addCriterion("p_addre =", value, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreNotEqualTo(Long value) {
            addCriterion("p_addre <>", value, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreGreaterThan(Long value) {
            addCriterion("p_addre >", value, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreGreaterThanOrEqualTo(Long value) {
            addCriterion("p_addre >=", value, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreLessThan(Long value) {
            addCriterion("p_addre <", value, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreLessThanOrEqualTo(Long value) {
            addCriterion("p_addre <=", value, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreIn(List<Long> values) {
            addCriterion("p_addre in", values, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreNotIn(List<Long> values) {
            addCriterion("p_addre not in", values, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreBetween(Long value1, Long value2) {
            addCriterion("p_addre between", value1, value2, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPAddreNotBetween(Long value1, Long value2) {
            addCriterion("p_addre not between", value1, value2, "pAddre");
            return (Criteria) this;
        }

        public Criteria andPReciIsNull() {
            addCriterion("p_reci is null");
            return (Criteria) this;
        }

        public Criteria andPReciIsNotNull() {
            addCriterion("p_reci is not null");
            return (Criteria) this;
        }

        public Criteria andPReciEqualTo(Long value) {
            addCriterion("p_reci =", value, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciNotEqualTo(Long value) {
            addCriterion("p_reci <>", value, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciGreaterThan(Long value) {
            addCriterion("p_reci >", value, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciGreaterThanOrEqualTo(Long value) {
            addCriterion("p_reci >=", value, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciLessThan(Long value) {
            addCriterion("p_reci <", value, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciLessThanOrEqualTo(Long value) {
            addCriterion("p_reci <=", value, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciIn(List<Long> values) {
            addCriterion("p_reci in", values, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciNotIn(List<Long> values) {
            addCriterion("p_reci not in", values, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciBetween(Long value1, Long value2) {
            addCriterion("p_reci between", value1, value2, "pReci");
            return (Criteria) this;
        }

        public Criteria andPReciNotBetween(Long value1, Long value2) {
            addCriterion("p_reci not between", value1, value2, "pReci");
            return (Criteria) this;
        }

        public Criteria andPTitleIsNull() {
            addCriterion("p_title is null");
            return (Criteria) this;
        }

        public Criteria andPTitleIsNotNull() {
            addCriterion("p_title is not null");
            return (Criteria) this;
        }

        public Criteria andPTitleEqualTo(String value) {
            addCriterion("p_title =", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotEqualTo(String value) {
            addCriterion("p_title <>", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThan(String value) {
            addCriterion("p_title >", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThanOrEqualTo(String value) {
            addCriterion("p_title >=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThan(String value) {
            addCriterion("p_title <", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThanOrEqualTo(String value) {
            addCriterion("p_title <=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLike(String value) {
            addCriterion("p_title like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotLike(String value) {
            addCriterion("p_title not like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleIn(List<String> values) {
            addCriterion("p_title in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotIn(List<String> values) {
            addCriterion("p_title not in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleBetween(String value1, String value2) {
            addCriterion("p_title between", value1, value2, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotBetween(String value1, String value2) {
            addCriterion("p_title not between", value1, value2, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTextIsNull() {
            addCriterion("p_text is null");
            return (Criteria) this;
        }

        public Criteria andPTextIsNotNull() {
            addCriterion("p_text is not null");
            return (Criteria) this;
        }

        public Criteria andPTextEqualTo(String value) {
            addCriterion("p_text =", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextNotEqualTo(String value) {
            addCriterion("p_text <>", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextGreaterThan(String value) {
            addCriterion("p_text >", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextGreaterThanOrEqualTo(String value) {
            addCriterion("p_text >=", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextLessThan(String value) {
            addCriterion("p_text <", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextLessThanOrEqualTo(String value) {
            addCriterion("p_text <=", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextLike(String value) {
            addCriterion("p_text like", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextNotLike(String value) {
            addCriterion("p_text not like", value, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextIn(List<String> values) {
            addCriterion("p_text in", values, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextNotIn(List<String> values) {
            addCriterion("p_text not in", values, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextBetween(String value1, String value2) {
            addCriterion("p_text between", value1, value2, "pText");
            return (Criteria) this;
        }

        public Criteria andPTextNotBetween(String value1, String value2) {
            addCriterion("p_text not between", value1, value2, "pText");
            return (Criteria) this;
        }

        public Criteria andPCreatIsNull() {
            addCriterion("p_creat is null");
            return (Criteria) this;
        }

        public Criteria andPCreatIsNotNull() {
            addCriterion("p_creat is not null");
            return (Criteria) this;
        }

        public Criteria andPCreatEqualTo(String value) {
            addCriterion("p_creat =", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatNotEqualTo(String value) {
            addCriterion("p_creat <>", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatGreaterThan(String value) {
            addCriterion("p_creat >", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatGreaterThanOrEqualTo(String value) {
            addCriterion("p_creat >=", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatLessThan(String value) {
            addCriterion("p_creat <", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatLessThanOrEqualTo(String value) {
            addCriterion("p_creat <=", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatLike(String value) {
            addCriterion("p_creat like", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatNotLike(String value) {
            addCriterion("p_creat not like", value, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatIn(List<String> values) {
            addCriterion("p_creat in", values, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatNotIn(List<String> values) {
            addCriterion("p_creat not in", values, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatBetween(String value1, String value2) {
            addCriterion("p_creat between", value1, value2, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPCreatNotBetween(String value1, String value2) {
            addCriterion("p_creat not between", value1, value2, "pCreat");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNull() {
            addCriterion("p_status is null");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNotNull() {
            addCriterion("p_status is not null");
            return (Criteria) this;
        }

        public Criteria andPStatusEqualTo(String value) {
            addCriterion("p_status =", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotEqualTo(String value) {
            addCriterion("p_status <>", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThan(String value) {
            addCriterion("p_status >", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThanOrEqualTo(String value) {
            addCriterion("p_status >=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThan(String value) {
            addCriterion("p_status <", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThanOrEqualTo(String value) {
            addCriterion("p_status <=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLike(String value) {
            addCriterion("p_status like", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotLike(String value) {
            addCriterion("p_status not like", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusIn(List<String> values) {
            addCriterion("p_status in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotIn(List<String> values) {
            addCriterion("p_status not in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusBetween(String value1, String value2) {
            addCriterion("p_status between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotBetween(String value1, String value2) {
            addCriterion("p_status not between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("p_type is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("p_type is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(String value) {
            addCriterion("p_type =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(String value) {
            addCriterion("p_type <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(String value) {
            addCriterion("p_type >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(String value) {
            addCriterion("p_type >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(String value) {
            addCriterion("p_type <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(String value) {
            addCriterion("p_type <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLike(String value) {
            addCriterion("p_type like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotLike(String value) {
            addCriterion("p_type not like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<String> values) {
            addCriterion("p_type in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<String> values) {
            addCriterion("p_type not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(String value1, String value2) {
            addCriterion("p_type between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(String value1, String value2) {
            addCriterion("p_type not between", value1, value2, "pType");
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