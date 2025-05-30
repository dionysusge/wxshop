package com.javaclimb.entity;

/**
 * Database Table Remarks:
 *   商品评价表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table comment_info
 */
public class CommentInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   所属商品
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.goods_id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * Database Column Remarks:
     *   评价人id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   评价人等级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.access_level
     *
     * @mbg.generated
     */
    private Integer accessLevel;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     * Database Column Remarks:
     *   评价内容
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.id
     *
     * @return the value of comment_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.id
     *
     * @param id the value for comment_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.goods_id
     *
     * @return the value of comment_info.goods_id
     *
     * @mbg.generated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.goods_id
     *
     * @param goodsId the value for comment_info.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.user_id
     *
     * @return the value of comment_info.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.user_id
     *
     * @param userId the value for comment_info.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.access_level
     *
     * @return the value of comment_info.access_level
     *
     * @mbg.generated
     */
    public Integer getAccessLevel() {
        return accessLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.access_level
     *
     * @param accessLevel the value for comment_info.access_level
     *
     * @mbg.generated
     */
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.create_time
     *
     * @return the value of comment_info.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.create_time
     *
     * @param createTime the value for comment_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.content
     *
     * @return the value of comment_info.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.content
     *
     * @param content the value for comment_info.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}