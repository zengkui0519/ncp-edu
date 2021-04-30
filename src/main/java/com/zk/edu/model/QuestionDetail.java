package com.zk.edu.model;

import lombok.Data;

/**
 * @description 题目详情表（存储大字段）
 * @author ZengKui
 * @date 2021/04/30 13:46
 */
@Data
public class QuestionDetail {

    private Integer detailId;

    /**
     * 题目版本id
     */
    private Integer versionId;

    /**
     * 题目内容（题干）
     */
    private String content;

    /**
     * 题目分析
     */
    private String analysis;

    /**
     * 标准答案(问答题专用)
     */
    private String answer;

    /**
     * 附件id
     */
    private String fileIds;

}