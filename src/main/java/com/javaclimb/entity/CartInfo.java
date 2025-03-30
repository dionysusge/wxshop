package com.javaclimb.entity;

/**
 * Database Table Remarks:
 *   购物车信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cart_info
 */
public class CartInfo {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   所属商品
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.goods_id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * Database Column Remarks:
     *   购买数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.purchase_count
     *
     * @mbg.generated
     */
    private Integer purchaseCount;

    /**
     * Database Column Remarks:
     *   所属用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   用户等级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.access_level
     *
     * @mbg.generated
     */
    private Integer accessLevel;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.id
     *
     * @return the value of cart_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.id
     *
     * @param id the value for cart_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.goods_id
     *
     * @return the value of cart_info.goods_id
     *
     * @mbg.generated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.goods_id
     *
     * @param goodsId the value for cart_info.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.purchase_count
     *
     * @return the value of cart_info.purchase_count
     *
     * @mbg.generated
     */
    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.purchase_count
     *
     * @param purchaseCount the value for cart_info.purchase_count
     *
     * @mbg.generated
     */
    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.user_id
     *
     * @return the value of cart_info.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.user_id
     *
     * @param userId the value for cart_info.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.access_level
     *
     * @return the value of cart_info.access_level
     *
     * @mbg.generated
     */
    public Integer getAccessLevel() {
        return accessLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.access_level
     *
     * @param accessLevel the value for cart_info.access_level
     *
     * @mbg.generated
     */
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.create_time
     *
     * @return the value of cart_info.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.create_time
     *
     * @param createTime the value for cart_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}