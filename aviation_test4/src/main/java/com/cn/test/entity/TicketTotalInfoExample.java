package com.cn.test.entity;

import java.util.ArrayList;
import java.util.List;

public class TicketTotalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketTotalInfoExample() {
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalpcIsNull() {
            addCriterion("totalpc is null");
            return (Criteria) this;
        }

        public Criteria andTotalpcIsNotNull() {
            addCriterion("totalpc is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpcEqualTo(Integer value) {
            addCriterion("totalpc =", value, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcNotEqualTo(Integer value) {
            addCriterion("totalpc <>", value, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcGreaterThan(Integer value) {
            addCriterion("totalpc >", value, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalpc >=", value, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcLessThan(Integer value) {
            addCriterion("totalpc <", value, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcLessThanOrEqualTo(Integer value) {
            addCriterion("totalpc <=", value, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcIn(List<Integer> values) {
            addCriterion("totalpc in", values, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcNotIn(List<Integer> values) {
            addCriterion("totalpc not in", values, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcBetween(Integer value1, Integer value2) {
            addCriterion("totalpc between", value1, value2, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalpcNotBetween(Integer value1, Integer value2) {
            addCriterion("totalpc not between", value1, value2, "totalpc");
            return (Criteria) this;
        }

        public Criteria andTotalmobileIsNull() {
            addCriterion("totalmobile is null");
            return (Criteria) this;
        }

        public Criteria andTotalmobileIsNotNull() {
            addCriterion("totalmobile is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmobileEqualTo(Integer value) {
            addCriterion("totalmobile =", value, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileNotEqualTo(Integer value) {
            addCriterion("totalmobile <>", value, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileGreaterThan(Integer value) {
            addCriterion("totalmobile >", value, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalmobile >=", value, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileLessThan(Integer value) {
            addCriterion("totalmobile <", value, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileLessThanOrEqualTo(Integer value) {
            addCriterion("totalmobile <=", value, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileIn(List<Integer> values) {
            addCriterion("totalmobile in", values, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileNotIn(List<Integer> values) {
            addCriterion("totalmobile not in", values, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileBetween(Integer value1, Integer value2) {
            addCriterion("totalmobile between", value1, value2, "totalmobile");
            return (Criteria) this;
        }

        public Criteria andTotalmobileNotBetween(Integer value1, Integer value2) {
            addCriterion("totalmobile not between", value1, value2, "totalmobile");
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