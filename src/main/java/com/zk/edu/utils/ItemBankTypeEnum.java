package com.zk.edu.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 题目类型
 */
@Getter
@AllArgsConstructor
public enum ItemBankTypeEnum {
    FILL_BLANK_QUESTION(1, "填空题"),
    SINGLE_QUESTION(2, "单选题"),
    MULTIPLE_CHOICE_QUESTION(3, "多选题"),
    JUDGMENT_QUESTION(4, "判断题"),
    ESSAY_QUESTION(5, "问答题");

    private Integer id;
    private String name;

    public static ItemBankTypeEnum getTypeById(Integer id) {
        for (ItemBankTypeEnum type : ItemBankTypeEnum.values()) {
            if (type.getId().equals(id)) {
                return type;
            }
        }
        return null;
    }

    public static String getNameById(Integer id) {
        for (ItemBankTypeEnum type : ItemBankTypeEnum.values()) {
            if (type.getId().equals(id)) {
                return type.getName();
            }
        }
        return "";
    }
}
