package com.yangqi.recommendedsystem.model;

public class RecommendDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.id
     *
     * @mbg.generated Wed Mar 11 09:59:25 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recommend.recommend
     *
     * @mbg.generated Wed Mar 11 09:59:25 CST 2020
     */
    private String recommend;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.id
     *
     * @return the value of recommend.id
     *
     * @mbg.generated Wed Mar 11 09:59:25 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.id
     *
     * @param id the value for recommend.id
     *
     * @mbg.generated Wed Mar 11 09:59:25 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recommend.recommend
     *
     * @return the value of recommend.recommend
     *
     * @mbg.generated Wed Mar 11 09:59:25 CST 2020
     */
    public String getRecommend() {
        return recommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recommend.recommend
     *
     * @param recommend the value for recommend.recommend
     *
     * @mbg.generated Wed Mar 11 09:59:25 CST 2020
     */
    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }
}