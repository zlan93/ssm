package com.eport.gnss.web.model.db.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GbVehicleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GbVehicleInfoExample() {
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

        public Criteria andVehicleNoIsNull() {
            addCriterion("VEHICLE_NO is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNotNull() {
            addCriterion("VEHICLE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoEqualTo(String value) {
            addCriterion("VEHICLE_NO =", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotEqualTo(String value) {
            addCriterion("VEHICLE_NO <>", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThan(String value) {
            addCriterion("VEHICLE_NO >", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NO >=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThan(String value) {
            addCriterion("VEHICLE_NO <", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_NO <=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLike(String value) {
            addCriterion("VEHICLE_NO like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotLike(String value) {
            addCriterion("VEHICLE_NO not like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIn(List<String> values) {
            addCriterion("VEHICLE_NO in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotIn(List<String> values) {
            addCriterion("VEHICLE_NO not in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoBetween(String value1, String value2) {
            addCriterion("VEHICLE_NO between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_NO not between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoIsNull() {
            addCriterion("T_VEHICLE_NO is null");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoIsNotNull() {
            addCriterion("T_VEHICLE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoEqualTo(String value) {
            addCriterion("T_VEHICLE_NO =", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoNotEqualTo(String value) {
            addCriterion("T_VEHICLE_NO <>", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoGreaterThan(String value) {
            addCriterion("T_VEHICLE_NO >", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("T_VEHICLE_NO >=", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoLessThan(String value) {
            addCriterion("T_VEHICLE_NO <", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("T_VEHICLE_NO <=", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoLike(String value) {
            addCriterion("T_VEHICLE_NO like", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoNotLike(String value) {
            addCriterion("T_VEHICLE_NO not like", value, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoIn(List<String> values) {
            addCriterion("T_VEHICLE_NO in", values, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoNotIn(List<String> values) {
            addCriterion("T_VEHICLE_NO not in", values, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoBetween(String value1, String value2) {
            addCriterion("T_VEHICLE_NO between", value1, value2, "tVehicleNo");
            return (Criteria) this;
        }

        public Criteria andTVehicleNoNotBetween(String value1, String value2) {
            addCriterion("T_VEHICLE_NO not between", value1, value2, "tVehicleNo");
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

        public Criteria andCustomizeNoIsNull() {
            addCriterion("CUSTOMIZE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoIsNotNull() {
            addCriterion("CUSTOMIZE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoEqualTo(String value) {
            addCriterion("CUSTOMIZE_NO =", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoNotEqualTo(String value) {
            addCriterion("CUSTOMIZE_NO <>", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoGreaterThan(String value) {
            addCriterion("CUSTOMIZE_NO >", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMIZE_NO >=", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoLessThan(String value) {
            addCriterion("CUSTOMIZE_NO <", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMIZE_NO <=", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoLike(String value) {
            addCriterion("CUSTOMIZE_NO like", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoNotLike(String value) {
            addCriterion("CUSTOMIZE_NO not like", value, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoIn(List<String> values) {
            addCriterion("CUSTOMIZE_NO in", values, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoNotIn(List<String> values) {
            addCriterion("CUSTOMIZE_NO not in", values, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoBetween(String value1, String value2) {
            addCriterion("CUSTOMIZE_NO between", value1, value2, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andCustomizeNoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMIZE_NO not between", value1, value2, "customizeNo");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIsNull() {
            addCriterion("VEHICLE_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIsNotNull() {
            addCriterion("VEHICLE_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE =", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE <>", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeGreaterThan(String value) {
            addCriterion("VEHICLE_TYPE_CODE >", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE >=", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLessThan(String value) {
            addCriterion("VEHICLE_TYPE_CODE <", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_CODE <=", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeLike(String value) {
            addCriterion("VEHICLE_TYPE_CODE like", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotLike(String value) {
            addCriterion("VEHICLE_TYPE_CODE not like", value, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeIn(List<String> values) {
            addCriterion("VEHICLE_TYPE_CODE in", values, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotIn(List<String> values) {
            addCriterion("VEHICLE_TYPE_CODE not in", values, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE_CODE between", value1, value2, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeCodeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE_CODE not between", value1, value2, "vehicleTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameIsNull() {
            addCriterion("VEHICLE_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameIsNotNull() {
            addCriterion("VEHICLE_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_NAME =", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameNotEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_NAME <>", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameGreaterThan(String value) {
            addCriterion("VEHICLE_TYPE_NAME >", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_NAME >=", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameLessThan(String value) {
            addCriterion("VEHICLE_TYPE_NAME <", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE_NAME <=", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameLike(String value) {
            addCriterion("VEHICLE_TYPE_NAME like", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameNotLike(String value) {
            addCriterion("VEHICLE_TYPE_NAME not like", value, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameIn(List<String> values) {
            addCriterion("VEHICLE_TYPE_NAME in", values, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameNotIn(List<String> values) {
            addCriterion("VEHICLE_TYPE_NAME not in", values, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE_NAME between", value1, value2, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNameNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE_NAME not between", value1, value2, "vehicleTypeName");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdIsNull() {
            addCriterion("VEHICLE_PWD is null");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdIsNotNull() {
            addCriterion("VEHICLE_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdEqualTo(String value) {
            addCriterion("VEHICLE_PWD =", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdNotEqualTo(String value) {
            addCriterion("VEHICLE_PWD <>", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdGreaterThan(String value) {
            addCriterion("VEHICLE_PWD >", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_PWD >=", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdLessThan(String value) {
            addCriterion("VEHICLE_PWD <", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_PWD <=", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdLike(String value) {
            addCriterion("VEHICLE_PWD like", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdNotLike(String value) {
            addCriterion("VEHICLE_PWD not like", value, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdIn(List<String> values) {
            addCriterion("VEHICLE_PWD in", values, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdNotIn(List<String> values) {
            addCriterion("VEHICLE_PWD not in", values, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdBetween(String value1, String value2) {
            addCriterion("VEHICLE_PWD between", value1, value2, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehiclePwdNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_PWD not between", value1, value2, "vehiclePwd");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandIsNull() {
            addCriterion("VEHICLE_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandIsNotNull() {
            addCriterion("VEHICLE_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandEqualTo(String value) {
            addCriterion("VEHICLE_BRAND =", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandNotEqualTo(String value) {
            addCriterion("VEHICLE_BRAND <>", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandGreaterThan(String value) {
            addCriterion("VEHICLE_BRAND >", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_BRAND >=", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandLessThan(String value) {
            addCriterion("VEHICLE_BRAND <", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_BRAND <=", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandLike(String value) {
            addCriterion("VEHICLE_BRAND like", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandNotLike(String value) {
            addCriterion("VEHICLE_BRAND not like", value, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandIn(List<String> values) {
            addCriterion("VEHICLE_BRAND in", values, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandNotIn(List<String> values) {
            addCriterion("VEHICLE_BRAND not in", values, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandBetween(String value1, String value2) {
            addCriterion("VEHICLE_BRAND between", value1, value2, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_BRAND not between", value1, value2, "vehicleBrand");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIsNull() {
            addCriterion("VEHICLE_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIsNotNull() {
            addCriterion("VEHICLE_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelEqualTo(String value) {
            addCriterion("VEHICLE_MODEL =", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNotEqualTo(String value) {
            addCriterion("VEHICLE_MODEL <>", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelGreaterThan(String value) {
            addCriterion("VEHICLE_MODEL >", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_MODEL >=", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelLessThan(String value) {
            addCriterion("VEHICLE_MODEL <", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_MODEL <=", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelLike(String value) {
            addCriterion("VEHICLE_MODEL like", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNotLike(String value) {
            addCriterion("VEHICLE_MODEL not like", value, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIn(List<String> values) {
            addCriterion("VEHICLE_MODEL in", values, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNotIn(List<String> values) {
            addCriterion("VEHICLE_MODEL not in", values, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelBetween(String value1, String value2) {
            addCriterion("VEHICLE_MODEL between", value1, value2, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleModelNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_MODEL not between", value1, value2, "vehicleModel");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNull() {
            addCriterion("VEHICLE_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNotNull() {
            addCriterion("VEHICLE_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorEqualTo(String value) {
            addCriterion("VEHICLE_COLOR =", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotEqualTo(String value) {
            addCriterion("VEHICLE_COLOR <>", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThan(String value) {
            addCriterion("VEHICLE_COLOR >", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_COLOR >=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThan(String value) {
            addCriterion("VEHICLE_COLOR <", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_COLOR <=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLike(String value) {
            addCriterion("VEHICLE_COLOR like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotLike(String value) {
            addCriterion("VEHICLE_COLOR not like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIn(List<String> values) {
            addCriterion("VEHICLE_COLOR in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotIn(List<String> values) {
            addCriterion("VEHICLE_COLOR not in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorBetween(String value1, String value2) {
            addCriterion("VEHICLE_COLOR between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_COLOR not between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleImageIsNull() {
            addCriterion("VEHICLE_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleImageIsNotNull() {
            addCriterion("VEHICLE_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleImageEqualTo(String value) {
            addCriterion("VEHICLE_IMAGE =", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageNotEqualTo(String value) {
            addCriterion("VEHICLE_IMAGE <>", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageGreaterThan(String value) {
            addCriterion("VEHICLE_IMAGE >", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_IMAGE >=", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageLessThan(String value) {
            addCriterion("VEHICLE_IMAGE <", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_IMAGE <=", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageLike(String value) {
            addCriterion("VEHICLE_IMAGE like", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageNotLike(String value) {
            addCriterion("VEHICLE_IMAGE not like", value, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageIn(List<String> values) {
            addCriterion("VEHICLE_IMAGE in", values, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageNotIn(List<String> values) {
            addCriterion("VEHICLE_IMAGE not in", values, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageBetween(String value1, String value2) {
            addCriterion("VEHICLE_IMAGE between", value1, value2, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andVehicleImageNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_IMAGE not between", value1, value2, "vehicleImage");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("DRIVER =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("DRIVER <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("DRIVER >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVER >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("DRIVER <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("DRIVER <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("DRIVER like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("DRIVER not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("DRIVER in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("DRIVER not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("DRIVER between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("DRIVER not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIsNull() {
            addCriterion("DRIVER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIsNotNull() {
            addCriterion("DRIVER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andDriverMobileEqualTo(String value) {
            addCriterion("DRIVER_MOBILE =", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotEqualTo(String value) {
            addCriterion("DRIVER_MOBILE <>", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileGreaterThan(String value) {
            addCriterion("DRIVER_MOBILE >", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVER_MOBILE >=", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLessThan(String value) {
            addCriterion("DRIVER_MOBILE <", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLessThanOrEqualTo(String value) {
            addCriterion("DRIVER_MOBILE <=", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileLike(String value) {
            addCriterion("DRIVER_MOBILE like", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotLike(String value) {
            addCriterion("DRIVER_MOBILE not like", value, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileIn(List<String> values) {
            addCriterion("DRIVER_MOBILE in", values, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotIn(List<String> values) {
            addCriterion("DRIVER_MOBILE not in", values, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileBetween(String value1, String value2) {
            addCriterion("DRIVER_MOBILE between", value1, value2, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andDriverMobileNotBetween(String value1, String value2) {
            addCriterion("DRIVER_MOBILE not between", value1, value2, "driverMobile");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNull() {
            addCriterion("PLATE_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNotNull() {
            addCriterion("PLATE_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andPlateColorEqualTo(String value) {
            addCriterion("PLATE_COLOR =", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotEqualTo(String value) {
            addCriterion("PLATE_COLOR <>", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThan(String value) {
            addCriterion("PLATE_COLOR >", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThanOrEqualTo(String value) {
            addCriterion("PLATE_COLOR >=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThan(String value) {
            addCriterion("PLATE_COLOR <", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThanOrEqualTo(String value) {
            addCriterion("PLATE_COLOR <=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLike(String value) {
            addCriterion("PLATE_COLOR like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotLike(String value) {
            addCriterion("PLATE_COLOR not like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorIn(List<String> values) {
            addCriterion("PLATE_COLOR in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotIn(List<String> values) {
            addCriterion("PLATE_COLOR not in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorBetween(String value1, String value2) {
            addCriterion("PLATE_COLOR between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotBetween(String value1, String value2) {
            addCriterion("PLATE_COLOR not between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseIsNull() {
            addCriterion("IS_ON_SUPERVISE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseIsNotNull() {
            addCriterion("IS_ON_SUPERVISE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseEqualTo(String value) {
            addCriterion("IS_ON_SUPERVISE =", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseNotEqualTo(String value) {
            addCriterion("IS_ON_SUPERVISE <>", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseGreaterThan(String value) {
            addCriterion("IS_ON_SUPERVISE >", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ON_SUPERVISE >=", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseLessThan(String value) {
            addCriterion("IS_ON_SUPERVISE <", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseLessThanOrEqualTo(String value) {
            addCriterion("IS_ON_SUPERVISE <=", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseLike(String value) {
            addCriterion("IS_ON_SUPERVISE like", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseNotLike(String value) {
            addCriterion("IS_ON_SUPERVISE not like", value, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseIn(List<String> values) {
            addCriterion("IS_ON_SUPERVISE in", values, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseNotIn(List<String> values) {
            addCriterion("IS_ON_SUPERVISE not in", values, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseBetween(String value1, String value2) {
            addCriterion("IS_ON_SUPERVISE between", value1, value2, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsOnSuperviseNotBetween(String value1, String value2) {
            addCriterion("IS_ON_SUPERVISE not between", value1, value2, "isOnSupervise");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNull() {
            addCriterion("IS_BLACK is null");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNotNull() {
            addCriterion("IS_BLACK is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlackEqualTo(String value) {
            addCriterion("IS_BLACK =", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotEqualTo(String value) {
            addCriterion("IS_BLACK <>", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThan(String value) {
            addCriterion("IS_BLACK >", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BLACK >=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThan(String value) {
            addCriterion("IS_BLACK <", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThanOrEqualTo(String value) {
            addCriterion("IS_BLACK <=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLike(String value) {
            addCriterion("IS_BLACK like", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotLike(String value) {
            addCriterion("IS_BLACK not like", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackIn(List<String> values) {
            addCriterion("IS_BLACK in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotIn(List<String> values) {
            addCriterion("IS_BLACK not in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackBetween(String value1, String value2) {
            addCriterion("IS_BLACK between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotBetween(String value1, String value2) {
            addCriterion("IS_BLACK not between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andSimIdIsNull() {
            addCriterion("SIM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSimIdIsNotNull() {
            addCriterion("SIM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSimIdEqualTo(String value) {
            addCriterion("SIM_ID =", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotEqualTo(String value) {
            addCriterion("SIM_ID <>", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdGreaterThan(String value) {
            addCriterion("SIM_ID >", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdGreaterThanOrEqualTo(String value) {
            addCriterion("SIM_ID >=", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLessThan(String value) {
            addCriterion("SIM_ID <", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLessThanOrEqualTo(String value) {
            addCriterion("SIM_ID <=", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLike(String value) {
            addCriterion("SIM_ID like", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotLike(String value) {
            addCriterion("SIM_ID not like", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdIn(List<String> values) {
            addCriterion("SIM_ID in", values, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotIn(List<String> values) {
            addCriterion("SIM_ID not in", values, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdBetween(String value1, String value2) {
            addCriterion("SIM_ID between", value1, value2, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotBetween(String value1, String value2) {
            addCriterion("SIM_ID not between", value1, value2, "simId");
            return (Criteria) this;
        }

        public Criteria andSimNoIsNull() {
            addCriterion("SIM_NO is null");
            return (Criteria) this;
        }

        public Criteria andSimNoIsNotNull() {
            addCriterion("SIM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSimNoEqualTo(String value) {
            addCriterion("SIM_NO =", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoNotEqualTo(String value) {
            addCriterion("SIM_NO <>", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoGreaterThan(String value) {
            addCriterion("SIM_NO >", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoGreaterThanOrEqualTo(String value) {
            addCriterion("SIM_NO >=", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoLessThan(String value) {
            addCriterion("SIM_NO <", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoLessThanOrEqualTo(String value) {
            addCriterion("SIM_NO <=", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoLike(String value) {
            addCriterion("SIM_NO like", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoNotLike(String value) {
            addCriterion("SIM_NO not like", value, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoIn(List<String> values) {
            addCriterion("SIM_NO in", values, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoNotIn(List<String> values) {
            addCriterion("SIM_NO not in", values, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoBetween(String value1, String value2) {
            addCriterion("SIM_NO between", value1, value2, "simNo");
            return (Criteria) this;
        }

        public Criteria andSimNoNotBetween(String value1, String value2) {
            addCriterion("SIM_NO not between", value1, value2, "simNo");
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

        public Criteria andDeviceModelIsNull() {
            addCriterion("DEVICE_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNotNull() {
            addCriterion("DEVICE_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelEqualTo(String value) {
            addCriterion("DEVICE_MODEL =", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotEqualTo(String value) {
            addCriterion("DEVICE_MODEL <>", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThan(String value) {
            addCriterion("DEVICE_MODEL >", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_MODEL >=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThan(String value) {
            addCriterion("DEVICE_MODEL <", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_MODEL <=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLike(String value) {
            addCriterion("DEVICE_MODEL like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotLike(String value) {
            addCriterion("DEVICE_MODEL not like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIn(List<String> values) {
            addCriterion("DEVICE_MODEL in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotIn(List<String> values) {
            addCriterion("DEVICE_MODEL not in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelBetween(String value1, String value2) {
            addCriterion("DEVICE_MODEL between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotBetween(String value1, String value2) {
            addCriterion("DEVICE_MODEL not between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoIsNull() {
            addCriterion("DEVICE_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoIsNotNull() {
            addCriterion("DEVICE_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoEqualTo(String value) {
            addCriterion("DEVICE_SERIAL_NO =", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoNotEqualTo(String value) {
            addCriterion("DEVICE_SERIAL_NO <>", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoGreaterThan(String value) {
            addCriterion("DEVICE_SERIAL_NO >", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_SERIAL_NO >=", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoLessThan(String value) {
            addCriterion("DEVICE_SERIAL_NO <", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_SERIAL_NO <=", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoLike(String value) {
            addCriterion("DEVICE_SERIAL_NO like", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoNotLike(String value) {
            addCriterion("DEVICE_SERIAL_NO not like", value, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoIn(List<String> values) {
            addCriterion("DEVICE_SERIAL_NO in", values, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoNotIn(List<String> values) {
            addCriterion("DEVICE_SERIAL_NO not in", values, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoBetween(String value1, String value2) {
            addCriterion("DEVICE_SERIAL_NO between", value1, value2, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNoNotBetween(String value1, String value2) {
            addCriterion("DEVICE_SERIAL_NO not between", value1, value2, "deviceSerialNo");
            return (Criteria) this;
        }

        public Criteria andIsCaIsNull() {
            addCriterion("IS_CA is null");
            return (Criteria) this;
        }

        public Criteria andIsCaIsNotNull() {
            addCriterion("IS_CA is not null");
            return (Criteria) this;
        }

        public Criteria andIsCaEqualTo(String value) {
            addCriterion("IS_CA =", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotEqualTo(String value) {
            addCriterion("IS_CA <>", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaGreaterThan(String value) {
            addCriterion("IS_CA >", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CA >=", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLessThan(String value) {
            addCriterion("IS_CA <", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLessThanOrEqualTo(String value) {
            addCriterion("IS_CA <=", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaLike(String value) {
            addCriterion("IS_CA like", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotLike(String value) {
            addCriterion("IS_CA not like", value, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaIn(List<String> values) {
            addCriterion("IS_CA in", values, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotIn(List<String> values) {
            addCriterion("IS_CA not in", values, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaBetween(String value1, String value2) {
            addCriterion("IS_CA between", value1, value2, "isCa");
            return (Criteria) this;
        }

        public Criteria andIsCaNotBetween(String value1, String value2) {
            addCriterion("IS_CA not between", value1, value2, "isCa");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNull() {
            addCriterion("CA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNotNull() {
            addCriterion("CA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaIdEqualTo(String value) {
            addCriterion("CA_ID =", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotEqualTo(String value) {
            addCriterion("CA_ID <>", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThan(String value) {
            addCriterion("CA_ID >", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThanOrEqualTo(String value) {
            addCriterion("CA_ID >=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThan(String value) {
            addCriterion("CA_ID <", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThanOrEqualTo(String value) {
            addCriterion("CA_ID <=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLike(String value) {
            addCriterion("CA_ID like", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotLike(String value) {
            addCriterion("CA_ID not like", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdIn(List<String> values) {
            addCriterion("CA_ID in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotIn(List<String> values) {
            addCriterion("CA_ID not in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdBetween(String value1, String value2) {
            addCriterion("CA_ID between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotBetween(String value1, String value2) {
            addCriterion("CA_ID not between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoIsNull() {
            addCriterion("CA_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoIsNotNull() {
            addCriterion("CA_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoEqualTo(String value) {
            addCriterion("CA_SERIAL_NO =", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoNotEqualTo(String value) {
            addCriterion("CA_SERIAL_NO <>", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoGreaterThan(String value) {
            addCriterion("CA_SERIAL_NO >", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("CA_SERIAL_NO >=", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoLessThan(String value) {
            addCriterion("CA_SERIAL_NO <", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoLessThanOrEqualTo(String value) {
            addCriterion("CA_SERIAL_NO <=", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoLike(String value) {
            addCriterion("CA_SERIAL_NO like", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoNotLike(String value) {
            addCriterion("CA_SERIAL_NO not like", value, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoIn(List<String> values) {
            addCriterion("CA_SERIAL_NO in", values, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoNotIn(List<String> values) {
            addCriterion("CA_SERIAL_NO not in", values, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoBetween(String value1, String value2) {
            addCriterion("CA_SERIAL_NO between", value1, value2, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaSerialNoNotBetween(String value1, String value2) {
            addCriterion("CA_SERIAL_NO not between", value1, value2, "caSerialNo");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyIsNull() {
            addCriterion("CA_PUBLIC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyIsNotNull() {
            addCriterion("CA_PUBLIC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyEqualTo(String value) {
            addCriterion("CA_PUBLIC_KEY =", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyNotEqualTo(String value) {
            addCriterion("CA_PUBLIC_KEY <>", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyGreaterThan(String value) {
            addCriterion("CA_PUBLIC_KEY >", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("CA_PUBLIC_KEY >=", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyLessThan(String value) {
            addCriterion("CA_PUBLIC_KEY <", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("CA_PUBLIC_KEY <=", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyLike(String value) {
            addCriterion("CA_PUBLIC_KEY like", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyNotLike(String value) {
            addCriterion("CA_PUBLIC_KEY not like", value, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyIn(List<String> values) {
            addCriterion("CA_PUBLIC_KEY in", values, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyNotIn(List<String> values) {
            addCriterion("CA_PUBLIC_KEY not in", values, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyBetween(String value1, String value2) {
            addCriterion("CA_PUBLIC_KEY between", value1, value2, "caPublicKey");
            return (Criteria) this;
        }

        public Criteria andCaPublicKeyNotBetween(String value1, String value2) {
            addCriterion("CA_PUBLIC_KEY not between", value1, value2, "caPublicKey");
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