package com.cn.test.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TicketFlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketFlightExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andFlightnoIsNull() {
            addCriterion("flightno is null");
            return (Criteria) this;
        }

        public Criteria andFlightnoIsNotNull() {
            addCriterion("flightno is not null");
            return (Criteria) this;
        }

        public Criteria andFlightnoEqualTo(String value) {
            addCriterion("flightno =", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotEqualTo(String value) {
            addCriterion("flightno <>", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThan(String value) {
            addCriterion("flightno >", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThanOrEqualTo(String value) {
            addCriterion("flightno >=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThan(String value) {
            addCriterion("flightno <", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThanOrEqualTo(String value) {
            addCriterion("flightno <=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLike(String value) {
            addCriterion("flightno like", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotLike(String value) {
            addCriterion("flightno not like", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoIn(List<String> values) {
            addCriterion("flightno in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotIn(List<String> values) {
            addCriterion("flightno not in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoBetween(String value1, String value2) {
            addCriterion("flightno between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotBetween(String value1, String value2) {
            addCriterion("flightno not between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyIsNull() {
            addCriterion("flightcompony is null");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyIsNotNull() {
            addCriterion("flightcompony is not null");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyEqualTo(Integer value) {
            addCriterion("flightcompony =", value, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyNotEqualTo(Integer value) {
            addCriterion("flightcompony <>", value, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyGreaterThan(Integer value) {
            addCriterion("flightcompony >", value, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyGreaterThanOrEqualTo(Integer value) {
            addCriterion("flightcompony >=", value, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyLessThan(Integer value) {
            addCriterion("flightcompony <", value, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyLessThanOrEqualTo(Integer value) {
            addCriterion("flightcompony <=", value, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyIn(List<Integer> values) {
            addCriterion("flightcompony in", values, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyNotIn(List<Integer> values) {
            addCriterion("flightcompony not in", values, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyBetween(Integer value1, Integer value2) {
            addCriterion("flightcompony between", value1, value2, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andFlightcomponyNotBetween(Integer value1, Integer value2) {
            addCriterion("flightcompony not between", value1, value2, "flightcompony");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCTime("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCTime("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCTime("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCTime("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCTime("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCTime("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andPlaneIsNull() {
            addCriterion("plane is null");
            return (Criteria) this;
        }

        public Criteria andPlaneIsNotNull() {
            addCriterion("plane is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneEqualTo(Integer value) {
            addCriterion("plane =", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneNotEqualTo(Integer value) {
            addCriterion("plane <>", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneGreaterThan(Integer value) {
            addCriterion("plane >", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneGreaterThanOrEqualTo(Integer value) {
            addCriterion("plane >=", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneLessThan(Integer value) {
            addCriterion("plane <", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneLessThanOrEqualTo(Integer value) {
            addCriterion("plane <=", value, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneIn(List<Integer> values) {
            addCriterion("plane in", values, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneNotIn(List<Integer> values) {
            addCriterion("plane not in", values, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneBetween(Integer value1, Integer value2) {
            addCriterion("plane between", value1, value2, "plane");
            return (Criteria) this;
        }

        public Criteria andPlaneNotBetween(Integer value1, Integer value2) {
            addCriterion("plane not between", value1, value2, "plane");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCapabilityIsNull() {
            addCriterion("capability is null");
            return (Criteria) this;
        }

        public Criteria andCapabilityIsNotNull() {
            addCriterion("capability is not null");
            return (Criteria) this;
        }

        public Criteria andCapabilityEqualTo(Integer value) {
            addCriterion("capability =", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityNotEqualTo(Integer value) {
            addCriterion("capability <>", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityGreaterThan(Integer value) {
            addCriterion("capability >", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capability >=", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityLessThan(Integer value) {
            addCriterion("capability <", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityLessThanOrEqualTo(Integer value) {
            addCriterion("capability <=", value, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityIn(List<Integer> values) {
            addCriterion("capability in", values, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityNotIn(List<Integer> values) {
            addCriterion("capability not in", values, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityBetween(Integer value1, Integer value2) {
            addCriterion("capability between", value1, value2, "capability");
            return (Criteria) this;
        }

        public Criteria andCapabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("capability not between", value1, value2, "capability");
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

        public Criteria andBusinessclassIsNull() {
            addCriterion("businessclass is null");
            return (Criteria) this;
        }

        public Criteria andBusinessclassIsNotNull() {
            addCriterion("businessclass is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessclassEqualTo(Integer value) {
            addCriterion("businessclass =", value, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassNotEqualTo(Integer value) {
            addCriterion("businessclass <>", value, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassGreaterThan(Integer value) {
            addCriterion("businessclass >", value, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessclass >=", value, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassLessThan(Integer value) {
            addCriterion("businessclass <", value, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassLessThanOrEqualTo(Integer value) {
            addCriterion("businessclass <=", value, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassIn(List<Integer> values) {
            addCriterion("businessclass in", values, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassNotIn(List<Integer> values) {
            addCriterion("businessclass not in", values, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassBetween(Integer value1, Integer value2) {
            addCriterion("businessclass between", value1, value2, "businessclass");
            return (Criteria) this;
        }

        public Criteria andBusinessclassNotBetween(Integer value1, Integer value2) {
            addCriterion("businessclass not between", value1, value2, "businessclass");
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

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate not between", value1, value2, "enddate");
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