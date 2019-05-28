package com.weshare.pojo;

import java.util.ArrayList;
import java.util.List;

public class WsFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsFileExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Long value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Long value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Long value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Long value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Long value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Long value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Long> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Long> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Long value1, Long value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Long value1, Long value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
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

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFTitleIsNull() {
            addCriterion("f_title is null");
            return (Criteria) this;
        }

        public Criteria andFTitleIsNotNull() {
            addCriterion("f_title is not null");
            return (Criteria) this;
        }

        public Criteria andFTitleEqualTo(String value) {
            addCriterion("f_title =", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotEqualTo(String value) {
            addCriterion("f_title <>", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleGreaterThan(String value) {
            addCriterion("f_title >", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleGreaterThanOrEqualTo(String value) {
            addCriterion("f_title >=", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleLessThan(String value) {
            addCriterion("f_title <", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleLessThanOrEqualTo(String value) {
            addCriterion("f_title <=", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleLike(String value) {
            addCriterion("f_title like", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotLike(String value) {
            addCriterion("f_title not like", value, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleIn(List<String> values) {
            addCriterion("f_title in", values, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotIn(List<String> values) {
            addCriterion("f_title not in", values, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleBetween(String value1, String value2) {
            addCriterion("f_title between", value1, value2, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFTitleNotBetween(String value1, String value2) {
            addCriterion("f_title not between", value1, value2, "fTitle");
            return (Criteria) this;
        }

        public Criteria andFSizeIsNull() {
            addCriterion("f_size is null");
            return (Criteria) this;
        }

        public Criteria andFSizeIsNotNull() {
            addCriterion("f_size is not null");
            return (Criteria) this;
        }

        public Criteria andFSizeEqualTo(Double value) {
            addCriterion("f_size =", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotEqualTo(Double value) {
            addCriterion("f_size <>", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeGreaterThan(Double value) {
            addCriterion("f_size >", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("f_size >=", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeLessThan(Double value) {
            addCriterion("f_size <", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeLessThanOrEqualTo(Double value) {
            addCriterion("f_size <=", value, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeIn(List<Double> values) {
            addCriterion("f_size in", values, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotIn(List<Double> values) {
            addCriterion("f_size not in", values, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeBetween(Double value1, Double value2) {
            addCriterion("f_size between", value1, value2, "fSize");
            return (Criteria) this;
        }

        public Criteria andFSizeNotBetween(Double value1, Double value2) {
            addCriterion("f_size not between", value1, value2, "fSize");
            return (Criteria) this;
        }

        public Criteria andFDescIsNull() {
            addCriterion("f_desc is null");
            return (Criteria) this;
        }

        public Criteria andFDescIsNotNull() {
            addCriterion("f_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFDescEqualTo(String value) {
            addCriterion("f_desc =", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotEqualTo(String value) {
            addCriterion("f_desc <>", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThan(String value) {
            addCriterion("f_desc >", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThanOrEqualTo(String value) {
            addCriterion("f_desc >=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThan(String value) {
            addCriterion("f_desc <", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThanOrEqualTo(String value) {
            addCriterion("f_desc <=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLike(String value) {
            addCriterion("f_desc like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotLike(String value) {
            addCriterion("f_desc not like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescIn(List<String> values) {
            addCriterion("f_desc in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotIn(List<String> values) {
            addCriterion("f_desc not in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescBetween(String value1, String value2) {
            addCriterion("f_desc between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotBetween(String value1, String value2) {
            addCriterion("f_desc not between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFIntegralIsNull() {
            addCriterion("f_integral is null");
            return (Criteria) this;
        }

        public Criteria andFIntegralIsNotNull() {
            addCriterion("f_integral is not null");
            return (Criteria) this;
        }

        public Criteria andFIntegralEqualTo(Integer value) {
            addCriterion("f_integral =", value, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralNotEqualTo(Integer value) {
            addCriterion("f_integral <>", value, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralGreaterThan(Integer value) {
            addCriterion("f_integral >", value, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_integral >=", value, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralLessThan(Integer value) {
            addCriterion("f_integral <", value, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("f_integral <=", value, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralIn(List<Integer> values) {
            addCriterion("f_integral in", values, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralNotIn(List<Integer> values) {
            addCriterion("f_integral not in", values, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralBetween(Integer value1, Integer value2) {
            addCriterion("f_integral between", value1, value2, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("f_integral not between", value1, value2, "fIntegral");
            return (Criteria) this;
        }

        public Criteria andFCreatIsNull() {
            addCriterion("f_creat is null");
            return (Criteria) this;
        }

        public Criteria andFCreatIsNotNull() {
            addCriterion("f_creat is not null");
            return (Criteria) this;
        }

        public Criteria andFCreatEqualTo(String value) {
            addCriterion("f_creat =", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatNotEqualTo(String value) {
            addCriterion("f_creat <>", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatGreaterThan(String value) {
            addCriterion("f_creat >", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatGreaterThanOrEqualTo(String value) {
            addCriterion("f_creat >=", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatLessThan(String value) {
            addCriterion("f_creat <", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatLessThanOrEqualTo(String value) {
            addCriterion("f_creat <=", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatLike(String value) {
            addCriterion("f_creat like", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatNotLike(String value) {
            addCriterion("f_creat not like", value, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatIn(List<String> values) {
            addCriterion("f_creat in", values, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatNotIn(List<String> values) {
            addCriterion("f_creat not in", values, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatBetween(String value1, String value2) {
            addCriterion("f_creat between", value1, value2, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFCreatNotBetween(String value1, String value2) {
            addCriterion("f_creat not between", value1, value2, "fCreat");
            return (Criteria) this;
        }

        public Criteria andFKindIsNull() {
            addCriterion("f_kind is null");
            return (Criteria) this;
        }

        public Criteria andFKindIsNotNull() {
            addCriterion("f_kind is not null");
            return (Criteria) this;
        }

        public Criteria andFKindEqualTo(String value) {
            addCriterion("f_kind =", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindNotEqualTo(String value) {
            addCriterion("f_kind <>", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindGreaterThan(String value) {
            addCriterion("f_kind >", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindGreaterThanOrEqualTo(String value) {
            addCriterion("f_kind >=", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindLessThan(String value) {
            addCriterion("f_kind <", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindLessThanOrEqualTo(String value) {
            addCriterion("f_kind <=", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindLike(String value) {
            addCriterion("f_kind like", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindNotLike(String value) {
            addCriterion("f_kind not like", value, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindIn(List<String> values) {
            addCriterion("f_kind in", values, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindNotIn(List<String> values) {
            addCriterion("f_kind not in", values, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindBetween(String value1, String value2) {
            addCriterion("f_kind between", value1, value2, "fKind");
            return (Criteria) this;
        }

        public Criteria andFKindNotBetween(String value1, String value2) {
            addCriterion("f_kind not between", value1, value2, "fKind");
            return (Criteria) this;
        }

        public Criteria andFPathIsNull() {
            addCriterion("f_path is null");
            return (Criteria) this;
        }

        public Criteria andFPathIsNotNull() {
            addCriterion("f_path is not null");
            return (Criteria) this;
        }

        public Criteria andFPathEqualTo(String value) {
            addCriterion("f_path =", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotEqualTo(String value) {
            addCriterion("f_path <>", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathGreaterThan(String value) {
            addCriterion("f_path >", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathGreaterThanOrEqualTo(String value) {
            addCriterion("f_path >=", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathLessThan(String value) {
            addCriterion("f_path <", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathLessThanOrEqualTo(String value) {
            addCriterion("f_path <=", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathLike(String value) {
            addCriterion("f_path like", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotLike(String value) {
            addCriterion("f_path not like", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathIn(List<String> values) {
            addCriterion("f_path in", values, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotIn(List<String> values) {
            addCriterion("f_path not in", values, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathBetween(String value1, String value2) {
            addCriterion("f_path between", value1, value2, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotBetween(String value1, String value2) {
            addCriterion("f_path not between", value1, value2, "fPath");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNull() {
            addCriterion("f_status is null");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNotNull() {
            addCriterion("f_status is not null");
            return (Criteria) this;
        }

        public Criteria andFStatusEqualTo(Integer value) {
            addCriterion("f_status =", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotEqualTo(Integer value) {
            addCriterion("f_status <>", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThan(Integer value) {
            addCriterion("f_status >", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_status >=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThan(Integer value) {
            addCriterion("f_status <", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThanOrEqualTo(Integer value) {
            addCriterion("f_status <=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusIn(List<Integer> values) {
            addCriterion("f_status in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotIn(List<Integer> values) {
            addCriterion("f_status not in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusBetween(Integer value1, Integer value2) {
            addCriterion("f_status between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("f_status not between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFDownnumIsNull() {
            addCriterion("f_downnum is null");
            return (Criteria) this;
        }

        public Criteria andFDownnumIsNotNull() {
            addCriterion("f_downnum is not null");
            return (Criteria) this;
        }

        public Criteria andFDownnumEqualTo(Long value) {
            addCriterion("f_downnum =", value, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumNotEqualTo(Long value) {
            addCriterion("f_downnum <>", value, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumGreaterThan(Long value) {
            addCriterion("f_downnum >", value, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumGreaterThanOrEqualTo(Long value) {
            addCriterion("f_downnum >=", value, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumLessThan(Long value) {
            addCriterion("f_downnum <", value, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumLessThanOrEqualTo(Long value) {
            addCriterion("f_downnum <=", value, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumIn(List<Long> values) {
            addCriterion("f_downnum in", values, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumNotIn(List<Long> values) {
            addCriterion("f_downnum not in", values, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumBetween(Long value1, Long value2) {
            addCriterion("f_downnum between", value1, value2, "fDownnum");
            return (Criteria) this;
        }

        public Criteria andFDownnumNotBetween(Long value1, Long value2) {
            addCriterion("f_downnum not between", value1, value2, "fDownnum");
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