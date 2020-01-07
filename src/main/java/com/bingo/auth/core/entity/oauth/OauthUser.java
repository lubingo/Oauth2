package com.bingo.auth.core.entity.oauth;

public class OauthUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_user.active_code
     *
     * @mbggenerated
     */
    private String activeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_user.active_status
     *
     * @mbggenerated
     */
    private Integer activeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauth_user.roles
     *
     * @mbggenerated
     */
    private String roles;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_user.id
     *
     * @return the value of oauth_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_user.id
     *
     * @param id the value for oauth_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_user.user_name
     *
     * @return the value of oauth_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_user.user_name
     *
     * @param userName the value for oauth_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_user.password
     *
     * @return the value of oauth_user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_user.password
     *
     * @param password the value for oauth_user.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_user.email
     *
     * @return the value of oauth_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_user.email
     *
     * @param email the value for oauth_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_user.active_code
     *
     * @return the value of oauth_user.active_code
     *
     * @mbggenerated
     */
    public String getActiveCode() {
        return activeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_user.active_code
     *
     * @param activeCode the value for oauth_user.active_code
     *
     * @mbggenerated
     */
    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode == null ? null : activeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_user.active_status
     *
     * @return the value of oauth_user.active_status
     *
     * @mbggenerated
     */
    public Integer getActiveStatus() {
        return activeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_user.active_status
     *
     * @param activeStatus the value for oauth_user.active_status
     *
     * @mbggenerated
     */
    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauth_user.roles
     *
     * @return the value of oauth_user.roles
     *
     * @mbggenerated
     */
    public String getRoles() {
        return roles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauth_user.roles
     *
     * @param roles the value for oauth_user.roles
     *
     * @mbggenerated
     */
    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }
}