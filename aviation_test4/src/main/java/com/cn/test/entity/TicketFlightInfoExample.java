package com.cn.test.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TicketFlightInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketFlightInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andFlightIsNull() {
            addCriterion("flight is null");
            return (Criteria) this;
        }

        public Criteria andFlightIsNotNull() {
            addCriterion("flight is not null");
            return (Criteria) this;
        }

        public Criteria andFlightEqualTo(Integer value) {
            addCriterion("flight =", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotEqualTo(Integer value) {
            addCriterion("flight <>", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThan(Integer value) {
            addCriterion("flight >", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightGreaterThanOrEqualTo(Integer value) {
            addCriterion("flight >=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThan(Integer value) {
            addCriterion("flight <", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightLessThanOrEqualTo(Integer value) {
            addCriterion("flight <=", value, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightIn(List<Integer> values) {
            addCriterion("flight in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotIn(List<Integer> values) {
            addCriterion("flight not in", values, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightBetween(Integer value1, Integer value2) {
            addCriterion("flight between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andFlightNotBetween(Integer value1, Integer value2) {
            addCriterion("flight not between", value1, value2, "flight");
            return (Criteria) this;
        }

        public Criteria andCutoffIsNull() {
            addCriterion("cutoff is null");
            return (Criteria) this;
        }

        public Criteria andCutoffIsNotNull() {
            addCriterion("cutoff is not null");
            return (Criteria) this;
        }

        public Criteria andCutoffEqualTo(Float value) {
            addCriterion("cutoff =", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffNotEqualTo(Float value) {
            addCriterion("cutoff <>", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffGreaterThan(Float value) {
            addCriterion("cutoff >", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffGreaterThanOrEqualTo(Float value) {
            addCriterion("cutoff >=", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffLessThan(Float value) {
            addCriterion("cutoff <", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffLessThanOrEqualTo(Float value) {
            addCriterion("cutoff <=", value, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffIn(List<Float> values) {
            addCriterion("cutoff in", values, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffNotIn(List<Float> values) {
            addCriterion("cutoff not in", values, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffBetween(Float value1, Float value2) {
            addCriterion("cutoff between", value1, value2, "cutoff");
            return (Criteria) this;
        }

        public Criteria andCutoffNotBetween(Float value1, Float value2) {
            addCriterion("cutoff not between", value1, value2, "cutoff");
            return (Criteria) this;
        }

        public Criteria andFirstclassIsNull() {
            addCriterion("firstclass is null");
            return (Criteria) this;
        }

        public Criteria andFirstclassIsNotNull() {
            addCriterion("firstclass is not null");
            return (Criteria) this;
        }

        public Criteria andFirstclassEqualTo(Integer value) {
            addCriterion("firstclass =", value, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassNotEqualTo(Integer value) {
            addCriterion("firstclass <>", value, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassGreaterThan(Integer value) {
            addCriterion("firstclass >", value, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstclass >=", value, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassLessThan(Integer value) {
            addCriterion("firstclass <", value, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassLessThanOrEqualTo(Integer value) {
            addCriterion("firstclass <=", value, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassIn(List<Integer> values) {
            addCriterion("firstclass in", values, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassNotIn(List<Integer> values) {
            addCriterion("firstclass not in", values, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassBetween(Integer value1, Integer value2) {
            addCriterion("firstclass between", value1, value2, "firstclass");
            return (Criteria) this;
        }

        public Criteria andFirstclassNotBetween(Integer value1, Integer value2) {
            addCriterion("firstclass not between", value1, value2, "firstclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassIsNull() {
            addCriterion("bussinessclass is null");
            return (Criteria) this;
        }

        public Criteria andBussinessclassIsNotNull() {
            addCriterion("bussinessclass is not null");
            return (Criteria) this;
        }

        public Criteria andBussinessclassEqualTo(Integer value) {
            addCriterion("bussinessclass =", value, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassNotEqualTo(Integer value) {
            addCriterion("bussinessclass <>", value, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassGreaterThan(Integer value) {
            addCriterion("bussinessclass >", value, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("bussinessclass >=", value, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassLessThan(Integer value) {
            addCriterion("bussinessclass <", value, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassLessThanOrEqualTo(Integer value) {
            addCriterion("bussinessclass <=", value, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassIn(List<Integer> values) {
            addCriterion("bussinessclass in", values, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassNotIn(List<Integer> values) {
            addCriterion("bussinessclass not in", values, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassBetween(Integer value1, Integer value2) {
            addCriterion("bussinessclass between", value1, value2, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andBussinessclassNotBetween(Integer value1, Integer value2) {
            addCriterion("bussinessclass not between", value1, value2, "bussinessclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassIsNull() {
            addCriterion("touristclass is null");
            return (Criteria) this;
        }

        public Criteria andTouristclassIsNotNull() {
            addCriterion("touristclass is not null");
            return (Criteria) this;
        }

        public Criteria andTouristclassEqualTo(Integer value) {
            addCriterion("touristclass =", value, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassNotEqualTo(Integer value) {
            addCriterion("touristclass <>", value, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassGreaterThan(Integer value) {
            addCriterion("touristclass >", value, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("touristclass >=", value, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassLessThan(Integer value) {
            addCriterion("touristclass <", value, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassLessThanOrEqualTo(Integer value) {
            addCriterion("touristclass <=", value, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassIn(List<Integer> values) {
            addCriterion("touristclass in", values, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassNotIn(List<Integer> values) {
            addCriterion("touristclass not in", values, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassBetween(Integer value1, Integer value2) {
            addCriterion("touristclass between", value1, value2, "touristclass");
            return (Criteria) this;
        }

        public Criteria andTouristclassNotBetween(Integer value1, Integer value2) {
            addCriterion("touristclass not between", value1, value2, "touristclass");
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