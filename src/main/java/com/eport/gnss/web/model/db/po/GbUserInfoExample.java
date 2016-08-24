package com.eport.gnss.web.model.db.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GbUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GbUserInfoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNull() {
            addCriterion("MODIFIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNotNull() {
            addCriterion("MODIFIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifierIdEqualTo(Integer value) {
            addCriterion("MODIFIER_ID =", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotEqualTo(Integer value) {
            addCriterion("MODIFIER_ID <>", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThan(Integer value) {
            addCriterion("MODIFIER_ID >", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MODIFIER_ID >=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThan(Integer value) {
            addCriterion("MODIFIER_ID <", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThanOrEqualTo(Integer value) {
            addCriterion("MODIFIER_ID <=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdIn(List<Integer> values) {
            addCriterion("MODIFIER_ID in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotIn(List<Integer> values) {
            addCriterion("MODIFIER_ID not in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdBetween(Integer value1, Integer value2) {
            addCriterion("MODIFIER_ID between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MODIFIER_ID not between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("USER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("USER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("USER_STATE =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("USER_STATE <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("USER_STATE >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATE >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("USER_STATE <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("USER_STATE <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("USER_STATE like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("USER_STATE not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("USER_STATE in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("USER_STATE not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("USER_STATE between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("USER_STATE not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("NICK_NAME =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("NICK_NAME <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("NICK_NAME >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("NICK_NAME >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("NICK_NAME <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("NICK_NAME <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("NICK_NAME like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("NICK_NAME not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("NICK_NAME in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("NICK_NAME not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("NICK_NAME between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("NICK_NAME not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andEntIdIsNull() {
            addCriterion("ENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntIdIsNotNull() {
            addCriterion("ENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntIdEqualTo(String value) {
            addCriterion("ENT_ID =", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotEqualTo(String value) {
            addCriterion("ENT_ID <>", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThan(String value) {
            addCriterion("ENT_ID >", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_ID >=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThan(String value) {
            addCriterion("ENT_ID <", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThanOrEqualTo(String value) {
            addCriterion("ENT_ID <=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLike(String value) {
            addCriterion("ENT_ID like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotLike(String value) {
            addCriterion("ENT_ID not like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdIn(List<String> values) {
            addCriterion("ENT_ID in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotIn(List<String> values) {
            addCriterion("ENT_ID not in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdBetween(String value1, String value2) {
            addCriterion("ENT_ID between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotBetween(String value1, String value2) {
            addCriterion("ENT_ID not between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNull() {
            addCriterion("ENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNotNull() {
            addCriterion("ENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntNameEqualTo(String value) {
            addCriterion("ENT_NAME =", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotEqualTo(String value) {
            addCriterion("ENT_NAME <>", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThan(String value) {
            addCriterion("ENT_NAME >", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_NAME >=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThan(String value) {
            addCriterion("ENT_NAME <", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThanOrEqualTo(String value) {
            addCriterion("ENT_NAME <=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLike(String value) {
            addCriterion("ENT_NAME like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotLike(String value) {
            addCriterion("ENT_NAME not like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameIn(List<String> values) {
            addCriterion("ENT_NAME in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotIn(List<String> values) {
            addCriterion("ENT_NAME not in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameBetween(String value1, String value2) {
            addCriterion("ENT_NAME between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotBetween(String value1, String value2) {
            addCriterion("ENT_NAME not between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLoginStateIsNull() {
            addCriterion("LOGIN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLoginStateIsNotNull() {
            addCriterion("LOGIN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStateEqualTo(String value) {
            addCriterion("LOGIN_STATE =", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotEqualTo(String value) {
            addCriterion("LOGIN_STATE <>", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateGreaterThan(String value) {
            addCriterion("LOGIN_STATE >", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_STATE >=", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateLessThan(String value) {
            addCriterion("LOGIN_STATE <", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_STATE <=", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateLike(String value) {
            addCriterion("LOGIN_STATE like", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotLike(String value) {
            addCriterion("LOGIN_STATE not like", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateIn(List<String> values) {
            addCriterion("LOGIN_STATE in", values, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotIn(List<String> values) {
            addCriterion("LOGIN_STATE not in", values, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateBetween(String value1, String value2) {
            addCriterion("LOGIN_STATE between", value1, value2, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotBetween(String value1, String value2) {
            addCriterion("LOGIN_STATE not between", value1, value2, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceIsNull() {
            addCriterion("LOGIN_DEVICE is null");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceIsNotNull() {
            addCriterion("LOGIN_DEVICE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceEqualTo(String value) {
            addCriterion("LOGIN_DEVICE =", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceNotEqualTo(String value) {
            addCriterion("LOGIN_DEVICE <>", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceGreaterThan(String value) {
            addCriterion("LOGIN_DEVICE >", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_DEVICE >=", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceLessThan(String value) {
            addCriterion("LOGIN_DEVICE <", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_DEVICE <=", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceLike(String value) {
            addCriterion("LOGIN_DEVICE like", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceNotLike(String value) {
            addCriterion("LOGIN_DEVICE not like", value, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceIn(List<String> values) {
            addCriterion("LOGIN_DEVICE in", values, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceNotIn(List<String> values) {
            addCriterion("LOGIN_DEVICE not in", values, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceBetween(String value1, String value2) {
            addCriterion("LOGIN_DEVICE between", value1, value2, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLoginDeviceNotBetween(String value1, String value2) {
            addCriterion("LOGIN_DEVICE not between", value1, value2, "loginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeIsNull() {
            addCriterion("USER_ROLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeIsNotNull() {
            addCriterion("USER_ROLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE =", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE <>", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeGreaterThan(String value) {
            addCriterion("USER_ROLE_TYPE >", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE >=", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeLessThan(String value) {
            addCriterion("USER_ROLE_TYPE <", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_ROLE_TYPE <=", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeLike(String value) {
            addCriterion("USER_ROLE_TYPE like", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotLike(String value) {
            addCriterion("USER_ROLE_TYPE not like", value, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeIn(List<String> values) {
            addCriterion("USER_ROLE_TYPE in", values, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotIn(List<String> values) {
            addCriterion("USER_ROLE_TYPE not in", values, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeBetween(String value1, String value2) {
            addCriterion("USER_ROLE_TYPE between", value1, value2, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andUserRoleTypeNotBetween(String value1, String value2) {
            addCriterion("USER_ROLE_TYPE not between", value1, value2, "userRoleType");
            return (Criteria) this;
        }

        public Criteria andSafeTokenIsNull() {
            addCriterion("SAFE_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andSafeTokenIsNotNull() {
            addCriterion("SAFE_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andSafeTokenEqualTo(String value) {
            addCriterion("SAFE_TOKEN =", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenNotEqualTo(String value) {
            addCriterion("SAFE_TOKEN <>", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenGreaterThan(String value) {
            addCriterion("SAFE_TOKEN >", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenGreaterThanOrEqualTo(String value) {
            addCriterion("SAFE_TOKEN >=", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenLessThan(String value) {
            addCriterion("SAFE_TOKEN <", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenLessThanOrEqualTo(String value) {
            addCriterion("SAFE_TOKEN <=", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenLike(String value) {
            addCriterion("SAFE_TOKEN like", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenNotLike(String value) {
            addCriterion("SAFE_TOKEN not like", value, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenIn(List<String> values) {
            addCriterion("SAFE_TOKEN in", values, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenNotIn(List<String> values) {
            addCriterion("SAFE_TOKEN not in", values, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenBetween(String value1, String value2) {
            addCriterion("SAFE_TOKEN between", value1, value2, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeTokenNotBetween(String value1, String value2) {
            addCriterion("SAFE_TOKEN not between", value1, value2, "safeToken");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionIsNull() {
            addCriterion("SAFE_QUESTION is null");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionIsNotNull() {
            addCriterion("SAFE_QUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionEqualTo(String value) {
            addCriterion("SAFE_QUESTION =", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotEqualTo(String value) {
            addCriterion("SAFE_QUESTION <>", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionGreaterThan(String value) {
            addCriterion("SAFE_QUESTION >", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("SAFE_QUESTION >=", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionLessThan(String value) {
            addCriterion("SAFE_QUESTION <", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionLessThanOrEqualTo(String value) {
            addCriterion("SAFE_QUESTION <=", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionLike(String value) {
            addCriterion("SAFE_QUESTION like", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotLike(String value) {
            addCriterion("SAFE_QUESTION not like", value, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionIn(List<String> values) {
            addCriterion("SAFE_QUESTION in", values, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotIn(List<String> values) {
            addCriterion("SAFE_QUESTION not in", values, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionBetween(String value1, String value2) {
            addCriterion("SAFE_QUESTION between", value1, value2, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeQuestionNotBetween(String value1, String value2) {
            addCriterion("SAFE_QUESTION not between", value1, value2, "safeQuestion");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerIsNull() {
            addCriterion("SAFE_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerIsNotNull() {
            addCriterion("SAFE_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerEqualTo(String value) {
            addCriterion("SAFE_ANSWER =", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotEqualTo(String value) {
            addCriterion("SAFE_ANSWER <>", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerGreaterThan(String value) {
            addCriterion("SAFE_ANSWER >", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("SAFE_ANSWER >=", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerLessThan(String value) {
            addCriterion("SAFE_ANSWER <", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerLessThanOrEqualTo(String value) {
            addCriterion("SAFE_ANSWER <=", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerLike(String value) {
            addCriterion("SAFE_ANSWER like", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotLike(String value) {
            addCriterion("SAFE_ANSWER not like", value, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerIn(List<String> values) {
            addCriterion("SAFE_ANSWER in", values, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotIn(List<String> values) {
            addCriterion("SAFE_ANSWER not in", values, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerBetween(String value1, String value2) {
            addCriterion("SAFE_ANSWER between", value1, value2, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeAnswerNotBetween(String value1, String value2) {
            addCriterion("SAFE_ANSWER not between", value1, value2, "safeAnswer");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeIsNull() {
            addCriterion("SAFE_TOKEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeIsNotNull() {
            addCriterion("SAFE_TOKEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeEqualTo(Date value) {
            addCriterion("SAFE_TOKEN_TIME =", value, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeNotEqualTo(Date value) {
            addCriterion("SAFE_TOKEN_TIME <>", value, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeGreaterThan(Date value) {
            addCriterion("SAFE_TOKEN_TIME >", value, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SAFE_TOKEN_TIME >=", value, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeLessThan(Date value) {
            addCriterion("SAFE_TOKEN_TIME <", value, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeLessThanOrEqualTo(Date value) {
            addCriterion("SAFE_TOKEN_TIME <=", value, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeIn(List<Date> values) {
            addCriterion("SAFE_TOKEN_TIME in", values, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeNotIn(List<Date> values) {
            addCriterion("SAFE_TOKEN_TIME not in", values, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeBetween(Date value1, Date value2) {
            addCriterion("SAFE_TOKEN_TIME between", value1, value2, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andSafeTokenTimeNotBetween(Date value1, Date value2) {
            addCriterion("SAFE_TOKEN_TIME not between", value1, value2, "safeTokenTime");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("ID_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("ID_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("ID_CARD_NO =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("ID_CARD_NO <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("ID_CARD_NO >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NO >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("ID_CARD_NO <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD_NO <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("ID_CARD_NO like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("ID_CARD_NO not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("ID_CARD_NO in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("ID_CARD_NO not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("ID_CARD_NO between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("ID_CARD_NO not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andAppPushIdIsNull() {
            addCriterion("APP_PUSH_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppPushIdIsNotNull() {
            addCriterion("APP_PUSH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppPushIdEqualTo(String value) {
            addCriterion("APP_PUSH_ID =", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdNotEqualTo(String value) {
            addCriterion("APP_PUSH_ID <>", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdGreaterThan(String value) {
            addCriterion("APP_PUSH_ID >", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdGreaterThanOrEqualTo(String value) {
            addCriterion("APP_PUSH_ID >=", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdLessThan(String value) {
            addCriterion("APP_PUSH_ID <", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdLessThanOrEqualTo(String value) {
            addCriterion("APP_PUSH_ID <=", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdLike(String value) {
            addCriterion("APP_PUSH_ID like", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdNotLike(String value) {
            addCriterion("APP_PUSH_ID not like", value, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdIn(List<String> values) {
            addCriterion("APP_PUSH_ID in", values, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdNotIn(List<String> values) {
            addCriterion("APP_PUSH_ID not in", values, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdBetween(String value1, String value2) {
            addCriterion("APP_PUSH_ID between", value1, value2, "appPushId");
            return (Criteria) this;
        }

        public Criteria andAppPushIdNotBetween(String value1, String value2) {
            addCriterion("APP_PUSH_ID not between", value1, value2, "appPushId");
            return (Criteria) this;
        }

        public Criteria andLoginModeIsNull() {
            addCriterion("LOGIN_MODE is null");
            return (Criteria) this;
        }

        public Criteria andLoginModeIsNotNull() {
            addCriterion("LOGIN_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginModeEqualTo(String value) {
            addCriterion("LOGIN_MODE =", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotEqualTo(String value) {
            addCriterion("LOGIN_MODE <>", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeGreaterThan(String value) {
            addCriterion("LOGIN_MODE >", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_MODE >=", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeLessThan(String value) {
            addCriterion("LOGIN_MODE <", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_MODE <=", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeLike(String value) {
            addCriterion("LOGIN_MODE like", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotLike(String value) {
            addCriterion("LOGIN_MODE not like", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeIn(List<String> values) {
            addCriterion("LOGIN_MODE in", values, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotIn(List<String> values) {
            addCriterion("LOGIN_MODE not in", values, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeBetween(String value1, String value2) {
            addCriterion("LOGIN_MODE between", value1, value2, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotBetween(String value1, String value2) {
            addCriterion("LOGIN_MODE not between", value1, value2, "loginMode");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNull() {
            addCriterion("REAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNotNull() {
            addCriterion("REAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRealStatusEqualTo(String value) {
            addCriterion("REAL_STATUS =", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotEqualTo(String value) {
            addCriterion("REAL_STATUS <>", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThan(String value) {
            addCriterion("REAL_STATUS >", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_STATUS >=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThan(String value) {
            addCriterion("REAL_STATUS <", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThanOrEqualTo(String value) {
            addCriterion("REAL_STATUS <=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLike(String value) {
            addCriterion("REAL_STATUS like", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotLike(String value) {
            addCriterion("REAL_STATUS not like", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusIn(List<String> values) {
            addCriterion("REAL_STATUS in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotIn(List<String> values) {
            addCriterion("REAL_STATUS not in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusBetween(String value1, String value2) {
            addCriterion("REAL_STATUS between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotBetween(String value1, String value2) {
            addCriterion("REAL_STATUS not between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andCasCardIsNull() {
            addCriterion("CAS_CARD is null");
            return (Criteria) this;
        }

        public Criteria andCasCardIsNotNull() {
            addCriterion("CAS_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andCasCardEqualTo(String value) {
            addCriterion("CAS_CARD =", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardNotEqualTo(String value) {
            addCriterion("CAS_CARD <>", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardGreaterThan(String value) {
            addCriterion("CAS_CARD >", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardGreaterThanOrEqualTo(String value) {
            addCriterion("CAS_CARD >=", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardLessThan(String value) {
            addCriterion("CAS_CARD <", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardLessThanOrEqualTo(String value) {
            addCriterion("CAS_CARD <=", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardLike(String value) {
            addCriterion("CAS_CARD like", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardNotLike(String value) {
            addCriterion("CAS_CARD not like", value, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardIn(List<String> values) {
            addCriterion("CAS_CARD in", values, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardNotIn(List<String> values) {
            addCriterion("CAS_CARD not in", values, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardBetween(String value1, String value2) {
            addCriterion("CAS_CARD between", value1, value2, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasCardNotBetween(String value1, String value2) {
            addCriterion("CAS_CARD not between", value1, value2, "casCard");
            return (Criteria) this;
        }

        public Criteria andCasTokenIsNull() {
            addCriterion("CAS_TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andCasTokenIsNotNull() {
            addCriterion("CAS_TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andCasTokenEqualTo(String value) {
            addCriterion("CAS_TOKEN =", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenNotEqualTo(String value) {
            addCriterion("CAS_TOKEN <>", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenGreaterThan(String value) {
            addCriterion("CAS_TOKEN >", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenGreaterThanOrEqualTo(String value) {
            addCriterion("CAS_TOKEN >=", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenLessThan(String value) {
            addCriterion("CAS_TOKEN <", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenLessThanOrEqualTo(String value) {
            addCriterion("CAS_TOKEN <=", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenLike(String value) {
            addCriterion("CAS_TOKEN like", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenNotLike(String value) {
            addCriterion("CAS_TOKEN not like", value, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenIn(List<String> values) {
            addCriterion("CAS_TOKEN in", values, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenNotIn(List<String> values) {
            addCriterion("CAS_TOKEN not in", values, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenBetween(String value1, String value2) {
            addCriterion("CAS_TOKEN between", value1, value2, "casToken");
            return (Criteria) this;
        }

        public Criteria andCasTokenNotBetween(String value1, String value2) {
            addCriterion("CAS_TOKEN not between", value1, value2, "casToken");
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