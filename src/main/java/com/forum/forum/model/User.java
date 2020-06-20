package com.forum.forum.model;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.ID
     *
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.USERNAME
     *
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.GMT_CREATE
     *
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    private Long gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.GMT_MODIFIED
     *
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    private Long gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.AVATAR_URL
     *
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    private String avatarUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_USER.PASSWORD
     *
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.ID
     *
     * @return the value of T_USER.ID
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.ID
     *
     * @param id the value for T_USER.ID
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.USERNAME
     *
     * @return the value of T_USER.USERNAME
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.USERNAME
     *
     * @param username the value for T_USER.USERNAME
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.GMT_CREATE
     *
     * @return the value of T_USER.GMT_CREATE
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.GMT_CREATE
     *
     * @param gmtCreate the value for T_USER.GMT_CREATE
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.GMT_MODIFIED
     *
     * @return the value of T_USER.GMT_MODIFIED
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.GMT_MODIFIED
     *
     * @param gmtModified the value for T_USER.GMT_MODIFIED
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.AVATAR_URL
     *
     * @return the value of T_USER.AVATAR_URL
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.AVATAR_URL
     *
     * @param avatarUrl the value for T_USER.AVATAR_URL
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_USER.PASSWORD
     *
     * @return the value of T_USER.PASSWORD
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_USER.PASSWORD
     *
     * @param password the value for T_USER.PASSWORD
     * @mbg.generated Sat Jun 13 19:51:57 EDT 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
