package com.forum.forum.model;

import java.io.Serializable;

public class Notification implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NOTIFICATION.NOTIFICATION_ID
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    private Long notificationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NOTIFICATION.MESSAGE
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NOTIFICATION.GMT_CREATE
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    private Long gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NOTIFICATION.IS_READ
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    private Boolean isRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NOTIFICATION.REDIRECT_URI
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    private String redirectUri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NOTIFICATION.SENDER_ID
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    private Long senderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NOTIFICATION.RECEIVER_ID
     *
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    private Long receiverId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NOTIFICATION.NOTIFICATION_ID
     *
     * @return the value of NOTIFICATION.NOTIFICATION_ID
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public Long getNotificationId() {
        return notificationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NOTIFICATION.NOTIFICATION_ID
     *
     * @param notificationId the value for NOTIFICATION.NOTIFICATION_ID
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NOTIFICATION.MESSAGE
     *
     * @return the value of NOTIFICATION.MESSAGE
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NOTIFICATION.MESSAGE
     *
     * @param message the value for NOTIFICATION.MESSAGE
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NOTIFICATION.GMT_CREATE
     *
     * @return the value of NOTIFICATION.GMT_CREATE
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NOTIFICATION.GMT_CREATE
     *
     * @param gmtCreate the value for NOTIFICATION.GMT_CREATE
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NOTIFICATION.IS_READ
     *
     * @return the value of NOTIFICATION.IS_READ
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public Boolean getIsRead() {
        return isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NOTIFICATION.IS_READ
     *
     * @param isRead the value for NOTIFICATION.IS_READ
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NOTIFICATION.REDIRECT_URI
     *
     * @return the value of NOTIFICATION.REDIRECT_URI
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NOTIFICATION.REDIRECT_URI
     *
     * @param redirectUri the value for NOTIFICATION.REDIRECT_URI
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri == null ? null : redirectUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NOTIFICATION.SENDER_ID
     *
     * @return the value of NOTIFICATION.SENDER_ID
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NOTIFICATION.SENDER_ID
     *
     * @param senderId the value for NOTIFICATION.SENDER_ID
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NOTIFICATION.RECEIVER_ID
     *
     * @return the value of NOTIFICATION.RECEIVER_ID
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NOTIFICATION.RECEIVER_ID
     *
     * @param receiverId the value for NOTIFICATION.RECEIVER_ID
     * @mbg.generated Sun Jun 28 23:01:09 EDT 2020
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }
}
