package com.zk.edu.model;

import lombok.Data;

/**
 * @description 题目选项表
 * @author ZengKui
 * @date 2021/04/30 13:46
 */
@Data
public class QuestionChoice {
    private Integer choiceId;

    /**
     * 题目版本id
     */
    private Integer versionId;

    /**
     * 选项名字
     */
    private String choiceKey;

    /**
     * 是否是正确答案 0否 1是
     */
    private Boolean isRight;

    /**
     * 得分率
     */
    private Double scoreRate;

    /**
     * 顺序
     */
    private Integer showOrder;

    /**
     * 选项值
     */
    private String choiceValue;

}