package com.weshare.pojo;

import java.util.ArrayList;
import java.util.List;

public class WsUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUIntegralIsNull() {
            addCriterion("u_integral is null");
            return (Criteria) this;
        }

        public Criteria andUIntegralIsNotNull() {
            addCriterion("u_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUIntegralEqualTo(Integer value) {
            addCriterion("u_integral =", value, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralNotEqualTo(Integer value) {
            addCriterion("u_integral <>", value, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralGreaterThan(Integer value) {
            addCriterion("u_integral >", value, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_integral >=", value, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralLessThan(Integer value) {
            addCriterion("u_integral <", value, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("u_integral <=", value, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralIn(List<Integer> values) {
            addCriterion("u_integral in", values, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralNotIn(List<Integer> values) {
            addCriterion("u_integral not in", values, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralBetween(Integer value1, Integer value2) {
            addCriterion("u_integral between", value1, value2, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("u_integral not between", value1, value2, "uIntegral");
            return (Criteria) this;
        }

        public Criteria andUOccuIsNull() {
            addCriterion("u_occu is null");
            return (Criteria) this;
        }

        public Criteria andUOccuIsNotNull() {
            addCriterion("u_occu is not null");
            return (Criteria) this;
        }

        public Criteria andUOccuEqualTo(String value) {
            addCriterion("u_occu =", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuNotEqualTo(String value) {
            addCriterion("u_occu <>", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuGreaterThan(String value) {
            addCriterion("u_occu >", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuGreaterThanOrEqualTo(String value) {
            addCriterion("u_occu >=", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuLessThan(String value) {
            addCriterion("u_occu <", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuLessThanOrEqualTo(String value) {
            addCriterion("u_occu <=", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuLike(String value) {
            addCriterion("u_occu like", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuNotLike(String value) {
            addCriterion("u_occu not like", value, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuIn(List<String> values) {
            addCriterion("u_occu in", values, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuNotIn(List<String> values) {
            addCriterion("u_occu not in", values, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuBetween(String value1, String value2) {
            addCriterion("u_occu between", value1, value2, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUOccuNotBetween(String value1, String value2) {
            addCriterion("u_occu not between", value1, value2, "uOccu");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("u_sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("u_sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUUpdateIsNull() {
            addCriterion("u_update is null");
            return (Criteria) this;
        }

        public Criteria andUUpdateIsNotNull() {
            addCriterion("u_update is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdateEqualTo(String value) {
            addCriterion("u_update =", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateNotEqualTo(String value) {
            addCriterion("u_update <>", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateGreaterThan(String value) {
            addCriterion("u_update >", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("u_update >=", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateLessThan(String value) {
            addCriterion("u_update <", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateLessThanOrEqualTo(String value) {
            addCriterion("u_update <=", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateLike(String value) {
            addCriterion("u_update like", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateNotLike(String value) {
            addCriterion("u_update not like", value, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateIn(List<String> values) {
            addCriterion("u_update in", values, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateNotIn(List<String> values) {
            addCriterion("u_update not in", values, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateBetween(String value1, String value2) {
            addCriterion("u_update between", value1, value2, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUUpdateNotBetween(String value1, String value2) {
            addCriterion("u_update not between", value1, value2, "uUpdate");
            return (Criteria) this;
        }

        public Criteria andUCreatIsNull() {
            addCriterion("u_creat is null");
            return (Criteria) this;
        }

        public Criteria andUCreatIsNotNull() {
            addCriterion("u_creat is not null");
            return (Criteria) this;
        }

        public Criteria andUCreatEqualTo(String value) {
            addCriterion("u_creat =", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatNotEqualTo(String value) {
            addCriterion("u_creat <>", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatGreaterThan(String value) {
            addCriterion("u_creat >", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatGreaterThanOrEqualTo(String value) {
            addCriterion("u_creat >=", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatLessThan(String value) {
            addCriterion("u_creat <", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatLessThanOrEqualTo(String value) {
            addCriterion("u_creat <=", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatLike(String value) {
            addCriterion("u_creat like", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatNotLike(String value) {
            addCriterion("u_creat not like", value, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatIn(List<String> values) {
            addCriterion("u_creat in", values, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatNotIn(List<String> values) {
            addCriterion("u_creat not in", values, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatBetween(String value1, String value2) {
            addCriterion("u_creat between", value1, value2, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUCreatNotBetween(String value1, String value2) {
            addCriterion("u_creat not between", value1, value2, "uCreat");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNull() {
            addCriterion("u_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNotNull() {
            addCriterion("u_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUNicknameEqualTo(String value) {
            addCriterion("u_nickname =", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotEqualTo(String value) {
            addCriterion("u_nickname <>", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThan(String value) {
            addCriterion("u_nickname >", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("u_nickname >=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThan(String value) {
            addCriterion("u_nickname <", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThanOrEqualTo(String value) {
            addCriterion("u_nickname <=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLike(String value) {
            addCriterion("u_nickname like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotLike(String value) {
            addCriterion("u_nickname not like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameIn(List<String> values) {
            addCriterion("u_nickname in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotIn(List<String> values) {
            addCriterion("u_nickname not in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameBetween(String value1, String value2) {
            addCriterion("u_nickname between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotBetween(String value1, String value2) {
            addCriterion("u_nickname not between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUSignatureIsNull() {
            addCriterion("u_signature is null");
            return (Criteria) this;
        }

        public Criteria andUSignatureIsNotNull() {
            addCriterion("u_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUSignatureEqualTo(String value) {
            addCriterion("u_signature =", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotEqualTo(String value) {
            addCriterion("u_signature <>", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureGreaterThan(String value) {
            addCriterion("u_signature >", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("u_signature >=", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureLessThan(String value) {
            addCriterion("u_signature <", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureLessThanOrEqualTo(String value) {
            addCriterion("u_signature <=", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureLike(String value) {
            addCriterion("u_signature like", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotLike(String value) {
            addCriterion("u_signature not like", value, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureIn(List<String> values) {
            addCriterion("u_signature in", values, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotIn(List<String> values) {
            addCriterion("u_signature not in", values, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureBetween(String value1, String value2) {
            addCriterion("u_signature between", value1, value2, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUSignatureNotBetween(String value1, String value2) {
            addCriterion("u_signature not between", value1, value2, "uSignature");
            return (Criteria) this;
        }

        public Criteria andUHeadIsNull() {
            addCriterion("u_head is null");
            return (Criteria) this;
        }

        public Criteria andUHeadIsNotNull() {
            addCriterion("u_head is not null");
            return (Criteria) this;
        }

        public Criteria andUHeadEqualTo(String value) {
            addCriterion("u_head =", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadNotEqualTo(String value) {
            addCriterion("u_head <>", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadGreaterThan(String value) {
            addCriterion("u_head >", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadGreaterThanOrEqualTo(String value) {
            addCriterion("u_head >=", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadLessThan(String value) {
            addCriterion("u_head <", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadLessThanOrEqualTo(String value) {
            addCriterion("u_head <=", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadLike(String value) {
            addCriterion("u_head like", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadNotLike(String value) {
            addCriterion("u_head not like", value, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadIn(List<String> values) {
            addCriterion("u_head in", values, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadNotIn(List<String> values) {
            addCriterion("u_head not in", values, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadBetween(String value1, String value2) {
            addCriterion("u_head between", value1, value2, "uHead");
            return (Criteria) this;
        }

        public Criteria andUHeadNotBetween(String value1, String value2) {
            addCriterion("u_head not between", value1, value2, "uHead");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNull() {
            addCriterion("u_status is null");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNotNull() {
            addCriterion("u_status is not null");
            return (Criteria) this;
        }

        public Criteria andUStatusEqualTo(Integer value) {
            addCriterion("u_status =", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotEqualTo(Integer value) {
            addCriterion("u_status <>", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThan(Integer value) {
            addCriterion("u_status >", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_status >=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThan(Integer value) {
            addCriterion("u_status <", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThanOrEqualTo(Integer value) {
            addCriterion("u_status <=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusIn(List<Integer> values) {
            addCriterion("u_status in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotIn(List<Integer> values) {
            addCriterion("u_status not in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusBetween(Integer value1, Integer value2) {
            addCriterion("u_status between", value1, value2, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("u_status not between", value1, value2, "uStatus");
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