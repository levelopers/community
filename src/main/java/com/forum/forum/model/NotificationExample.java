package com.forum.forum.model;

import java.util.ArrayList;
import java.util.List;

public class NotificationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public NotificationExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andNotificationIdIsNull() {
            addCriterion("NOTIFICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIsNotNull() {
            addCriterion("NOTIFICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationIdEqualTo(Long value) {
            addCriterion("NOTIFICATION_ID =", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotEqualTo(Long value) {
            addCriterion("NOTIFICATION_ID <>", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThan(Long value) {
            addCriterion("NOTIFICATION_ID >", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NOTIFICATION_ID >=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThan(Long value) {
            addCriterion("NOTIFICATION_ID <", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdLessThanOrEqualTo(Long value) {
            addCriterion("NOTIFICATION_ID <=", value, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdIn(List<Long> values) {
            addCriterion("NOTIFICATION_ID in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotIn(List<Long> values) {
            addCriterion("NOTIFICATION_ID not in", values, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdBetween(Long value1, Long value2) {
            addCriterion("NOTIFICATION_ID between", value1, value2, "notificationId");
            return (Criteria) this;
        }

        public Criteria andNotificationIdNotBetween(Long value1, Long value2) {
            addCriterion("NOTIFICATION_ID not between", value1, value2, "notificationId");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Long value) {
            addCriterion("GMT_CREATE =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Long value) {
            addCriterion("GMT_CREATE <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Long value) {
            addCriterion("GMT_CREATE >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("GMT_CREATE >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Long value) {
            addCriterion("GMT_CREATE <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Long value) {
            addCriterion("GMT_CREATE <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Long> values) {
            addCriterion("GMT_CREATE in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Long> values) {
            addCriterion("GMT_CREATE not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Long value1, Long value2) {
            addCriterion("GMT_CREATE between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Long value1, Long value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("IS_READ is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("IS_READ is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Boolean value) {
            addCriterion("IS_READ =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Boolean value) {
            addCriterion("IS_READ <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Boolean value) {
            addCriterion("IS_READ >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_READ >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Boolean value) {
            addCriterion("IS_READ <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_READ <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Boolean> values) {
            addCriterion("IS_READ in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Boolean> values) {
            addCriterion("IS_READ not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_READ between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_READ not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andRedirectUriIsNull() {
            addCriterion("REDIRECT_URI is null");
            return (Criteria) this;
        }

        public Criteria andRedirectUriIsNotNull() {
            addCriterion("REDIRECT_URI is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectUriEqualTo(String value) {
            addCriterion("REDIRECT_URI =", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriNotEqualTo(String value) {
            addCriterion("REDIRECT_URI <>", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriGreaterThan(String value) {
            addCriterion("REDIRECT_URI >", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriGreaterThanOrEqualTo(String value) {
            addCriterion("REDIRECT_URI >=", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriLessThan(String value) {
            addCriterion("REDIRECT_URI <", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriLessThanOrEqualTo(String value) {
            addCriterion("REDIRECT_URI <=", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriLike(String value) {
            addCriterion("REDIRECT_URI like", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriNotLike(String value) {
            addCriterion("REDIRECT_URI not like", value, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriIn(List<String> values) {
            addCriterion("REDIRECT_URI in", values, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriNotIn(List<String> values) {
            addCriterion("REDIRECT_URI not in", values, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriBetween(String value1, String value2) {
            addCriterion("REDIRECT_URI between", value1, value2, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andRedirectUriNotBetween(String value1, String value2) {
            addCriterion("REDIRECT_URI not between", value1, value2, "redirectUri");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("SENDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("SENDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Long value) {
            addCriterion("SENDER_ID =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Long value) {
            addCriterion("SENDER_ID <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Long value) {
            addCriterion("SENDER_ID >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SENDER_ID >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Long value) {
            addCriterion("SENDER_ID <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Long value) {
            addCriterion("SENDER_ID <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Long> values) {
            addCriterion("SENDER_ID in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Long> values) {
            addCriterion("SENDER_ID not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Long value1, Long value2) {
            addCriterion("SENDER_ID between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Long value1, Long value2) {
            addCriterion("SENDER_ID not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("RECEIVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("RECEIVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Long value) {
            addCriterion("RECEIVER_ID =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Long value) {
            addCriterion("RECEIVER_ID <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Long value) {
            addCriterion("RECEIVER_ID >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECEIVER_ID >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Long value) {
            addCriterion("RECEIVER_ID <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Long value) {
            addCriterion("RECEIVER_ID <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Long> values) {
            addCriterion("RECEIVER_ID in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Long> values) {
            addCriterion("RECEIVER_ID not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Long value1, Long value2) {
            addCriterion("RECEIVER_ID between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Long value1, Long value2) {
            addCriterion("RECEIVER_ID not between", value1, value2, "receiverId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NOTIFICATION
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 28 23:01:09 EDT 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
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