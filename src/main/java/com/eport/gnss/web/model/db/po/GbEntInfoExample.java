package com.eport.gnss.web.model.db.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GbEntInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GbEntInfoExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andEntNameShortIsNull() {
            addCriterion("ENT_NAME_SHORT is null");
            return (Criteria) this;
        }

        public Criteria andEntNameShortIsNotNull() {
            addCriterion("ENT_NAME_SHORT is not null");
            return (Criteria) this;
        }

        public Criteria andEntNameShortEqualTo(String value) {
            addCriterion("ENT_NAME_SHORT =", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortNotEqualTo(String value) {
            addCriterion("ENT_NAME_SHORT <>", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortGreaterThan(String value) {
            addCriterion("ENT_NAME_SHORT >", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_NAME_SHORT >=", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortLessThan(String value) {
            addCriterion("ENT_NAME_SHORT <", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortLessThanOrEqualTo(String value) {
            addCriterion("ENT_NAME_SHORT <=", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortLike(String value) {
            addCriterion("ENT_NAME_SHORT like", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortNotLike(String value) {
            addCriterion("ENT_NAME_SHORT not like", value, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortIn(List<String> values) {
            addCriterion("ENT_NAME_SHORT in", values, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortNotIn(List<String> values) {
            addCriterion("ENT_NAME_SHORT not in", values, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortBetween(String value1, String value2) {
            addCriterion("ENT_NAME_SHORT between", value1, value2, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntNameShortNotBetween(String value1, String value2) {
            addCriterion("ENT_NAME_SHORT not between", value1, value2, "entNameShort");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeIsNull() {
            addCriterion("ENT_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeIsNotNull() {
            addCriterion("ENT_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeEqualTo(String value) {
            addCriterion("ENT_TYPE_CODE =", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeNotEqualTo(String value) {
            addCriterion("ENT_TYPE_CODE <>", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeGreaterThan(String value) {
            addCriterion("ENT_TYPE_CODE >", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_TYPE_CODE >=", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeLessThan(String value) {
            addCriterion("ENT_TYPE_CODE <", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("ENT_TYPE_CODE <=", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeLike(String value) {
            addCriterion("ENT_TYPE_CODE like", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeNotLike(String value) {
            addCriterion("ENT_TYPE_CODE not like", value, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeIn(List<String> values) {
            addCriterion("ENT_TYPE_CODE in", values, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeNotIn(List<String> values) {
            addCriterion("ENT_TYPE_CODE not in", values, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeBetween(String value1, String value2) {
            addCriterion("ENT_TYPE_CODE between", value1, value2, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeCodeNotBetween(String value1, String value2) {
            addCriterion("ENT_TYPE_CODE not between", value1, value2, "entTypeCode");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameIsNull() {
            addCriterion("ENT_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameIsNotNull() {
            addCriterion("ENT_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameEqualTo(String value) {
            addCriterion("ENT_TYPE_NAME =", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameNotEqualTo(String value) {
            addCriterion("ENT_TYPE_NAME <>", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameGreaterThan(String value) {
            addCriterion("ENT_TYPE_NAME >", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_TYPE_NAME >=", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameLessThan(String value) {
            addCriterion("ENT_TYPE_NAME <", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameLessThanOrEqualTo(String value) {
            addCriterion("ENT_TYPE_NAME <=", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameLike(String value) {
            addCriterion("ENT_TYPE_NAME like", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameNotLike(String value) {
            addCriterion("ENT_TYPE_NAME not like", value, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameIn(List<String> values) {
            addCriterion("ENT_TYPE_NAME in", values, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameNotIn(List<String> values) {
            addCriterion("ENT_TYPE_NAME not in", values, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameBetween(String value1, String value2) {
            addCriterion("ENT_TYPE_NAME between", value1, value2, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntTypeNameNotBetween(String value1, String value2) {
            addCriterion("ENT_TYPE_NAME not between", value1, value2, "entTypeName");
            return (Criteria) this;
        }

        public Criteria andEntFileIsNull() {
            addCriterion("ENT_FILE is null");
            return (Criteria) this;
        }

        public Criteria andEntFileIsNotNull() {
            addCriterion("ENT_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andEntFileEqualTo(String value) {
            addCriterion("ENT_FILE =", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileNotEqualTo(String value) {
            addCriterion("ENT_FILE <>", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileGreaterThan(String value) {
            addCriterion("ENT_FILE >", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_FILE >=", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileLessThan(String value) {
            addCriterion("ENT_FILE <", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileLessThanOrEqualTo(String value) {
            addCriterion("ENT_FILE <=", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileLike(String value) {
            addCriterion("ENT_FILE like", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileNotLike(String value) {
            addCriterion("ENT_FILE not like", value, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileIn(List<String> values) {
            addCriterion("ENT_FILE in", values, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileNotIn(List<String> values) {
            addCriterion("ENT_FILE not in", values, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileBetween(String value1, String value2) {
            addCriterion("ENT_FILE between", value1, value2, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntFileNotBetween(String value1, String value2) {
            addCriterion("ENT_FILE not between", value1, value2, "entFile");
            return (Criteria) this;
        }

        public Criteria andEntImageIsNull() {
            addCriterion("ENT_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andEntImageIsNotNull() {
            addCriterion("ENT_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andEntImageEqualTo(String value) {
            addCriterion("ENT_IMAGE =", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageNotEqualTo(String value) {
            addCriterion("ENT_IMAGE <>", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageGreaterThan(String value) {
            addCriterion("ENT_IMAGE >", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_IMAGE >=", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageLessThan(String value) {
            addCriterion("ENT_IMAGE <", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageLessThanOrEqualTo(String value) {
            addCriterion("ENT_IMAGE <=", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageLike(String value) {
            addCriterion("ENT_IMAGE like", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageNotLike(String value) {
            addCriterion("ENT_IMAGE not like", value, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageIn(List<String> values) {
            addCriterion("ENT_IMAGE in", values, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageNotIn(List<String> values) {
            addCriterion("ENT_IMAGE not in", values, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageBetween(String value1, String value2) {
            addCriterion("ENT_IMAGE between", value1, value2, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntImageNotBetween(String value1, String value2) {
            addCriterion("ENT_IMAGE not between", value1, value2, "entImage");
            return (Criteria) this;
        }

        public Criteria andEntStateIsNull() {
            addCriterion("ENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andEntStateIsNotNull() {
            addCriterion("ENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntStateEqualTo(String value) {
            addCriterion("ENT_STATE =", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateNotEqualTo(String value) {
            addCriterion("ENT_STATE <>", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateGreaterThan(String value) {
            addCriterion("ENT_STATE >", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_STATE >=", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateLessThan(String value) {
            addCriterion("ENT_STATE <", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateLessThanOrEqualTo(String value) {
            addCriterion("ENT_STATE <=", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateLike(String value) {
            addCriterion("ENT_STATE like", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateNotLike(String value) {
            addCriterion("ENT_STATE not like", value, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateIn(List<String> values) {
            addCriterion("ENT_STATE in", values, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateNotIn(List<String> values) {
            addCriterion("ENT_STATE not in", values, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateBetween(String value1, String value2) {
            addCriterion("ENT_STATE between", value1, value2, "entState");
            return (Criteria) this;
        }

        public Criteria andEntStateNotBetween(String value1, String value2) {
            addCriterion("ENT_STATE not between", value1, value2, "entState");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionIsNull() {
            addCriterion("ENT_INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionIsNotNull() {
            addCriterion("ENT_INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionEqualTo(String value) {
            addCriterion("ENT_INTRODUCTION =", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionNotEqualTo(String value) {
            addCriterion("ENT_INTRODUCTION <>", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionGreaterThan(String value) {
            addCriterion("ENT_INTRODUCTION >", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_INTRODUCTION >=", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionLessThan(String value) {
            addCriterion("ENT_INTRODUCTION <", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionLessThanOrEqualTo(String value) {
            addCriterion("ENT_INTRODUCTION <=", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionLike(String value) {
            addCriterion("ENT_INTRODUCTION like", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionNotLike(String value) {
            addCriterion("ENT_INTRODUCTION not like", value, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionIn(List<String> values) {
            addCriterion("ENT_INTRODUCTION in", values, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionNotIn(List<String> values) {
            addCriterion("ENT_INTRODUCTION not in", values, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionBetween(String value1, String value2) {
            addCriterion("ENT_INTRODUCTION between", value1, value2, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andEntIntroductionNotBetween(String value1, String value2) {
            addCriterion("ENT_INTRODUCTION not between", value1, value2, "entIntroduction");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialIsNull() {
            addCriterion("LEADING_OFFICIAL is null");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialIsNotNull() {
            addCriterion("LEADING_OFFICIAL is not null");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialEqualTo(String value) {
            addCriterion("LEADING_OFFICIAL =", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialNotEqualTo(String value) {
            addCriterion("LEADING_OFFICIAL <>", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialGreaterThan(String value) {
            addCriterion("LEADING_OFFICIAL >", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialGreaterThanOrEqualTo(String value) {
            addCriterion("LEADING_OFFICIAL >=", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialLessThan(String value) {
            addCriterion("LEADING_OFFICIAL <", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialLessThanOrEqualTo(String value) {
            addCriterion("LEADING_OFFICIAL <=", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialLike(String value) {
            addCriterion("LEADING_OFFICIAL like", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialNotLike(String value) {
            addCriterion("LEADING_OFFICIAL not like", value, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialIn(List<String> values) {
            addCriterion("LEADING_OFFICIAL in", values, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialNotIn(List<String> values) {
            addCriterion("LEADING_OFFICIAL not in", values, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialBetween(String value1, String value2) {
            addCriterion("LEADING_OFFICIAL between", value1, value2, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingOfficialNotBetween(String value1, String value2) {
            addCriterion("LEADING_OFFICIAL not between", value1, value2, "leadingOfficial");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoIsNull() {
            addCriterion("LEADING_ID_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoIsNotNull() {
            addCriterion("LEADING_ID_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoEqualTo(String value) {
            addCriterion("LEADING_ID_CARD_NO =", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoNotEqualTo(String value) {
            addCriterion("LEADING_ID_CARD_NO <>", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoGreaterThan(String value) {
            addCriterion("LEADING_ID_CARD_NO >", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEADING_ID_CARD_NO >=", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoLessThan(String value) {
            addCriterion("LEADING_ID_CARD_NO <", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("LEADING_ID_CARD_NO <=", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoLike(String value) {
            addCriterion("LEADING_ID_CARD_NO like", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoNotLike(String value) {
            addCriterion("LEADING_ID_CARD_NO not like", value, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoIn(List<String> values) {
            addCriterion("LEADING_ID_CARD_NO in", values, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoNotIn(List<String> values) {
            addCriterion("LEADING_ID_CARD_NO not in", values, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoBetween(String value1, String value2) {
            addCriterion("LEADING_ID_CARD_NO between", value1, value2, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andLeadingIdCardNoNotBetween(String value1, String value2) {
            addCriterion("LEADING_ID_CARD_NO not between", value1, value2, "leadingIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoIsNull() {
            addCriterion("CONTACT_ID_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoIsNotNull() {
            addCriterion("CONTACT_ID_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoEqualTo(String value) {
            addCriterion("CONTACT_ID_CARD_NO =", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoNotEqualTo(String value) {
            addCriterion("CONTACT_ID_CARD_NO <>", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoGreaterThan(String value) {
            addCriterion("CONTACT_ID_CARD_NO >", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_ID_CARD_NO >=", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoLessThan(String value) {
            addCriterion("CONTACT_ID_CARD_NO <", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_ID_CARD_NO <=", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoLike(String value) {
            addCriterion("CONTACT_ID_CARD_NO like", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoNotLike(String value) {
            addCriterion("CONTACT_ID_CARD_NO not like", value, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoIn(List<String> values) {
            addCriterion("CONTACT_ID_CARD_NO in", values, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoNotIn(List<String> values) {
            addCriterion("CONTACT_ID_CARD_NO not in", values, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoBetween(String value1, String value2) {
            addCriterion("CONTACT_ID_CARD_NO between", value1, value2, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andContactIdCardNoNotBetween(String value1, String value2) {
            addCriterion("CONTACT_ID_CARD_NO not between", value1, value2, "contactIdCardNo");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
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

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
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

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalIsNull() {
            addCriterion("REGIST_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalIsNotNull() {
            addCriterion("REGIST_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalEqualTo(BigDecimal value) {
            addCriterion("REGIST_CAPITAL =", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalNotEqualTo(BigDecimal value) {
            addCriterion("REGIST_CAPITAL <>", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalGreaterThan(BigDecimal value) {
            addCriterion("REGIST_CAPITAL >", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGIST_CAPITAL >=", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalLessThan(BigDecimal value) {
            addCriterion("REGIST_CAPITAL <", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGIST_CAPITAL <=", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalIn(List<BigDecimal> values) {
            addCriterion("REGIST_CAPITAL in", values, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalNotIn(List<BigDecimal> values) {
            addCriterion("REGIST_CAPITAL not in", values, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGIST_CAPITAL between", value1, value2, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGIST_CAPITAL not between", value1, value2, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNull() {
            addCriterion("REGIST_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNotNull() {
            addCriterion("REGIST_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberEqualTo(String value) {
            addCriterion("REGIST_NUMBER =", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotEqualTo(String value) {
            addCriterion("REGIST_NUMBER <>", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThan(String value) {
            addCriterion("REGIST_NUMBER >", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThanOrEqualTo(String value) {
            addCriterion("REGIST_NUMBER >=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThan(String value) {
            addCriterion("REGIST_NUMBER <", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThanOrEqualTo(String value) {
            addCriterion("REGIST_NUMBER <=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLike(String value) {
            addCriterion("REGIST_NUMBER like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotLike(String value) {
            addCriterion("REGIST_NUMBER not like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIn(List<String> values) {
            addCriterion("REGIST_NUMBER in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotIn(List<String> values) {
            addCriterion("REGIST_NUMBER not in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberBetween(String value1, String value2) {
            addCriterion("REGIST_NUMBER between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotBetween(String value1, String value2) {
            addCriterion("REGIST_NUMBER not between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andBounsPointIsNull() {
            addCriterion("BOUNS_POINT is null");
            return (Criteria) this;
        }

        public Criteria andBounsPointIsNotNull() {
            addCriterion("BOUNS_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andBounsPointEqualTo(BigDecimal value) {
            addCriterion("BOUNS_POINT =", value, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointNotEqualTo(BigDecimal value) {
            addCriterion("BOUNS_POINT <>", value, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointGreaterThan(BigDecimal value) {
            addCriterion("BOUNS_POINT >", value, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOUNS_POINT >=", value, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointLessThan(BigDecimal value) {
            addCriterion("BOUNS_POINT <", value, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOUNS_POINT <=", value, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointIn(List<BigDecimal> values) {
            addCriterion("BOUNS_POINT in", values, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointNotIn(List<BigDecimal> values) {
            addCriterion("BOUNS_POINT not in", values, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOUNS_POINT between", value1, value2, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andBounsPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOUNS_POINT not between", value1, value2, "bounsPoint");
            return (Criteria) this;
        }

        public Criteria andRankLevelIsNull() {
            addCriterion("RANK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRankLevelIsNotNull() {
            addCriterion("RANK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRankLevelEqualTo(BigDecimal value) {
            addCriterion("RANK_LEVEL =", value, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelNotEqualTo(BigDecimal value) {
            addCriterion("RANK_LEVEL <>", value, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelGreaterThan(BigDecimal value) {
            addCriterion("RANK_LEVEL >", value, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RANK_LEVEL >=", value, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelLessThan(BigDecimal value) {
            addCriterion("RANK_LEVEL <", value, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RANK_LEVEL <=", value, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelIn(List<BigDecimal> values) {
            addCriterion("RANK_LEVEL in", values, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelNotIn(List<BigDecimal> values) {
            addCriterion("RANK_LEVEL not in", values, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RANK_LEVEL between", value1, value2, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andRankLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RANK_LEVEL not between", value1, value2, "rankLevel");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoIsNull() {
            addCriterion("THREE_IN_ONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoIsNotNull() {
            addCriterion("THREE_IN_ONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoEqualTo(String value) {
            addCriterion("THREE_IN_ONE_NO =", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoNotEqualTo(String value) {
            addCriterion("THREE_IN_ONE_NO <>", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoGreaterThan(String value) {
            addCriterion("THREE_IN_ONE_NO >", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoGreaterThanOrEqualTo(String value) {
            addCriterion("THREE_IN_ONE_NO >=", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoLessThan(String value) {
            addCriterion("THREE_IN_ONE_NO <", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoLessThanOrEqualTo(String value) {
            addCriterion("THREE_IN_ONE_NO <=", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoLike(String value) {
            addCriterion("THREE_IN_ONE_NO like", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoNotLike(String value) {
            addCriterion("THREE_IN_ONE_NO not like", value, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoIn(List<String> values) {
            addCriterion("THREE_IN_ONE_NO in", values, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoNotIn(List<String> values) {
            addCriterion("THREE_IN_ONE_NO not in", values, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoBetween(String value1, String value2) {
            addCriterion("THREE_IN_ONE_NO between", value1, value2, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andThreeInOneNoNotBetween(String value1, String value2) {
            addCriterion("THREE_IN_ONE_NO not between", value1, value2, "threeInOneNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNull() {
            addCriterion("TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNotNull() {
            addCriterion("TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNoEqualTo(String value) {
            addCriterion("TAX_NO =", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotEqualTo(String value) {
            addCriterion("TAX_NO <>", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThan(String value) {
            addCriterion("TAX_NO >", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_NO >=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThan(String value) {
            addCriterion("TAX_NO <", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThanOrEqualTo(String value) {
            addCriterion("TAX_NO <=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLike(String value) {
            addCriterion("TAX_NO like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotLike(String value) {
            addCriterion("TAX_NO not like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoIn(List<String> values) {
            addCriterion("TAX_NO in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotIn(List<String> values) {
            addCriterion("TAX_NO not in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoBetween(String value1, String value2) {
            addCriterion("TAX_NO between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotBetween(String value1, String value2) {
            addCriterion("TAX_NO not between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoIsNull() {
            addCriterion("REGIST_LIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoIsNotNull() {
            addCriterion("REGIST_LIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoEqualTo(String value) {
            addCriterion("REGIST_LIC_NO =", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoNotEqualTo(String value) {
            addCriterion("REGIST_LIC_NO <>", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoGreaterThan(String value) {
            addCriterion("REGIST_LIC_NO >", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoGreaterThanOrEqualTo(String value) {
            addCriterion("REGIST_LIC_NO >=", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoLessThan(String value) {
            addCriterion("REGIST_LIC_NO <", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoLessThanOrEqualTo(String value) {
            addCriterion("REGIST_LIC_NO <=", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoLike(String value) {
            addCriterion("REGIST_LIC_NO like", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoNotLike(String value) {
            addCriterion("REGIST_LIC_NO not like", value, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoIn(List<String> values) {
            addCriterion("REGIST_LIC_NO in", values, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoNotIn(List<String> values) {
            addCriterion("REGIST_LIC_NO not in", values, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoBetween(String value1, String value2) {
            addCriterion("REGIST_LIC_NO between", value1, value2, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andRegistLicNoNotBetween(String value1, String value2) {
            addCriterion("REGIST_LIC_NO not between", value1, value2, "registLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoIsNull() {
            addCriterion("TARNSPORT_LIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoIsNotNull() {
            addCriterion("TARNSPORT_LIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoEqualTo(String value) {
            addCriterion("TARNSPORT_LIC_NO =", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoNotEqualTo(String value) {
            addCriterion("TARNSPORT_LIC_NO <>", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoGreaterThan(String value) {
            addCriterion("TARNSPORT_LIC_NO >", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoGreaterThanOrEqualTo(String value) {
            addCriterion("TARNSPORT_LIC_NO >=", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoLessThan(String value) {
            addCriterion("TARNSPORT_LIC_NO <", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoLessThanOrEqualTo(String value) {
            addCriterion("TARNSPORT_LIC_NO <=", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoLike(String value) {
            addCriterion("TARNSPORT_LIC_NO like", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoNotLike(String value) {
            addCriterion("TARNSPORT_LIC_NO not like", value, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoIn(List<String> values) {
            addCriterion("TARNSPORT_LIC_NO in", values, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoNotIn(List<String> values) {
            addCriterion("TARNSPORT_LIC_NO not in", values, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoBetween(String value1, String value2) {
            addCriterion("TARNSPORT_LIC_NO between", value1, value2, "tarnsportLicNo");
            return (Criteria) this;
        }

        public Criteria andTarnsportLicNoNotBetween(String value1, String value2) {
            addCriterion("TARNSPORT_LIC_NO not between", value1, value2, "tarnsportLicNo");
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

        public Criteria andCustomsCodeIsNull() {
            addCriterion("CUSTOMS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeIsNotNull() {
            addCriterion("CUSTOMS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeEqualTo(String value) {
            addCriterion("CUSTOMS_CODE =", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotEqualTo(String value) {
            addCriterion("CUSTOMS_CODE <>", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeGreaterThan(String value) {
            addCriterion("CUSTOMS_CODE >", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMS_CODE >=", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeLessThan(String value) {
            addCriterion("CUSTOMS_CODE <", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMS_CODE <=", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeLike(String value) {
            addCriterion("CUSTOMS_CODE like", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotLike(String value) {
            addCriterion("CUSTOMS_CODE not like", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeIn(List<String> values) {
            addCriterion("CUSTOMS_CODE in", values, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotIn(List<String> values) {
            addCriterion("CUSTOMS_CODE not in", values, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMS_CODE between", value1, value2, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMS_CODE not between", value1, value2, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsNameIsNull() {
            addCriterion("CUSTOMS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomsNameIsNotNull() {
            addCriterion("CUSTOMS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsNameEqualTo(String value) {
            addCriterion("CUSTOMS_NAME =", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameNotEqualTo(String value) {
            addCriterion("CUSTOMS_NAME <>", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameGreaterThan(String value) {
            addCriterion("CUSTOMS_NAME >", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMS_NAME >=", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameLessThan(String value) {
            addCriterion("CUSTOMS_NAME <", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMS_NAME <=", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameLike(String value) {
            addCriterion("CUSTOMS_NAME like", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameNotLike(String value) {
            addCriterion("CUSTOMS_NAME not like", value, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameIn(List<String> values) {
            addCriterion("CUSTOMS_NAME in", values, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameNotIn(List<String> values) {
            addCriterion("CUSTOMS_NAME not in", values, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameBetween(String value1, String value2) {
            addCriterion("CUSTOMS_NAME between", value1, value2, "customsName");
            return (Criteria) this;
        }

        public Criteria andCustomsNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMS_NAME not between", value1, value2, "customsName");
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