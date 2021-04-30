package com.zk.edu.mapper;

import com.zk.edu.model.QuestionInfo;

public interface QuestionInfoMapper {
    int deleteByPrimaryKey(Integer versionId);

    int insert(QuestionInfo record);

    QuestionInfo selectByPrimaryKey(Integer versionId);

    int updateByPrimaryKey(QuestionInfo record);
}