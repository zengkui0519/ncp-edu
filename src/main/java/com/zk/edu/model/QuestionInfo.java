package com.zk.edu.model;

import lombok.Data;

import java.util.Date;

/**
 * @description 题目表
 * @author ZengKui
 * @date 2021/04/30 13:46
 */
@Data
public class QuestionInfo {
    /**
     * 版本id
     */
    private Integer versionId;

    /**
     * 题目id，取第一次新增时的version_id（版本id变化，但业务id不变）
     */
    private Integer questionId;

    /**
     * 题目类型：1填空、2单选、3多选、4判断、5问答
     */
    private Integer type;

    /**
     * 难度：1低、2中、3高
     */
    private Integer difficulty;

    /**
     * 状态：1暂存、2发布、3无效
     */
    private Integer status;

    /**
     * 是否是最新版本：0否、1是
     */
    private Boolean isNew;

    /**
     * 选中次数
     */
    private Integer selectedCount;

    /**
     * 是否有试卷发布过此题目：0否、1是
     */
    private Boolean isPublished;

    /**
     * 答对次数
     */
    private Integer rightCount;

    /**
     * 答题总数
     */
    private Integer answerCount;

    /**
     * 正确率
     */
    private Double accuracy;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updateTime;

}