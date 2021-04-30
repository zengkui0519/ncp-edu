package com.zk.edu.service.impl;

import com.zk.edu.model.SysUser;
import com.zk.edu.service.BaseFeignService;
import com.zk.edu.service.feign.BaseFeignClient;
import com.zk.edu.utils.ResultMessage;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class BaseFeignServiceImpl implements BaseFeignService {

    @Resource
    private BaseFeignClient baseFeignClient;

    @Override
    public SysUser getSysUserInfo(Integer userId) {
        ResultMessage resultMessage = baseFeignClient.getSysUserInfo(userId);
        if (null == resultMessage || null == resultMessage.getData()) {
            return null;
        }

        Map userMap = (HashMap<String, Object>) resultMessage.getData();
        SysUser sysUser = new SysUser();
        BeanMap beanMap = BeanMap.create(sysUser);
        beanMap.putAll(userMap);
        return sysUser;
    }

}
