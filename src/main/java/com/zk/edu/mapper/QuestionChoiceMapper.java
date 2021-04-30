package com.zk.edu.mapper;

import com.zk.edu.model.QuestionChoice;

public interface QuestionChoiceMapper {

    int deleteByPrimaryKey(Integer choiceId);

    int insert(QuestionChoice record);

    QuestionChoice selectByPrimaryKey(Integer choiceId);

}