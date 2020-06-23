package com.cn.test.entity;

import java.util.ArrayList;
import java.util.List;

public class TicketFlightPayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketFlightPayInfoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNull() {
            addCriterion("payername is null");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNotNull() {
            addCriterion("payername is not null");
            return (Criteria) this;
        }

        public Criteria andPayernameEqualTo(String value) {
            addCriterion("payername =", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotEqualTo(String value) {
            addCriterion("payername <>", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThan(String value) {
            addCriterion("payername >", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThanOrEqualTo(String value) {
            addCriterion("payername >=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThan(String value) {
            addCriterion("payername <", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThanOrEqualTo(String value) {
            addCriterion("payername <=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLike(String value) {
            addCriterion("payername like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotLike(String value) {
            addCriterion("payername not like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameIn(List<String> values) {
            addCriterion("payername in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotIn(List<String> values) {
            addCriterion("payername not in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameBetween(String value1, String value2) {
            addCriterion("payername between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotBetween(String value1, String value2) {
            addCriterion("payername not between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayerphoneIsNull() {
            addCriterion("payerphone is null");
            return (Criteria) this;
        }

        public Criteria andPayerphoneIsNotNull() {
            addCriterion("payerphone is not null");
            return (Criteria) this;
        }

        public Criteria andPayerphoneEqualTo(String value) {
            addCriterion("payerphone =", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneNotEqualTo(String value) {
            addCriterion("payerphone <>", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneGreaterThan(String value) {
            addCriterion("payerphone >", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("payerphone >=", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneLessThan(String value) {
            addCriterion("payerphone <", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneLessThanOrEqualTo(String value) {
            addCriterion("payerphone <=", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneLike(String value) {
            addCriterion("payerphone like", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneNotLike(String value) {
            addCriterion("payerphone not like", value, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneIn(List<String> values) {
            addCriterion("payerphone in", values, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneNotIn(List<String> values) {
            addCriterion("payerphone not in", values, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneBetween(String value1, String value2) {
            addCriterion("payerphone between", value1, value2, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayerphoneNotBetween(String value1, String value2) {
            addCriterion("payerphone not between", value1, value2, "payerphone");
            return (Criteria) this;
        }

        public Criteria andPayeremailIsNull() {
            addCriterion("payeremail is null");
            return (Criteria) this;
        }

        public Criteria andPayeremailIsNotNull() {
            addCriterion("payeremail is not null");
            return (Criteria) this;
        }

        public Criteria andPayeremailEqualTo(String value) {
            addCriterion("payeremail =", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailNotEqualTo(String value) {
            addCriterion("payeremail <>", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailGreaterThan(String value) {
            addCriterion("payeremail >", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailGreaterThanOrEqualTo(String value) {
            addCriterion("payeremail >=", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailLessThan(String value) {
            addCriterion("payeremail <", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailLessThanOrEqualTo(String value) {
            addCriterion("payeremail <=", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailLike(String value) {
            addCriterion("payeremail like", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailNotLike(String value) {
            addCriterion("payeremail not like", value, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailIn(List<String> values) {
            addCriterion("payeremail in", values, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailNotIn(List<String> values) {
            addCriterion("payeremail not in", values, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailBetween(String value1, String value2) {
            addCriterion("payeremail between", value1, value2, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeremailNotBetween(String value1, String value2) {
            addCriterion("payeremail not between", value1, value2, "payeremail");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNull() {
            addCriterion("payeraddress is null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIsNotNull() {
            addCriterion("payeraddress is not null");
            return (Criteria) this;
        }

        public Criteria andPayeraddressEqualTo(String value) {
            addCriterion("payeraddress =", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotEqualTo(String value) {
            addCriterion("payeraddress <>", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThan(String value) {
            addCriterion("payeraddress >", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("payeraddress >=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThan(String value) {
            addCriterion("payeraddress <", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLessThanOrEqualTo(String value) {
            addCriterion("payeraddress <=", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressLike(String value) {
            addCriterion("payeraddress like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotLike(String value) {
            addCriterion("payeraddress not like", value, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressIn(List<String> values) {
            addCriterion("payeraddress in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotIn(List<String> values) {
            addCriterion("payeraddress not in", values, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressBetween(String value1, String value2) {
            addCriterion("payeraddress between", value1, value2, "payeraddress");
            return (Criteria) this;
        }

        public Criteria andPayeraddressNotBetween(String value1, String value2) {
            addCriterion("payeraddress not between", value1, value2, "payeraddress");
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