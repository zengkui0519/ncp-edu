package com.zk.edu.controller;

import com.zk.edu.model.QuestionInfo;
import com.zk.edu.service.QuestionInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Resource
    private QuestionInfoService questionInfoService;

    @PostMapping("/getQuestionInfo")
    public QuestionInfo getQuestionInfo(Integer questionId) {
        QuestionInfo result = questionInfoService.getQuestionInfo(questionId);
        return result;
    }

}
