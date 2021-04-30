package com.zk.edu.service.feign;

import com.zk.edu.utils.ResultMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ZK-BASE-SERVICE")
public interface BaseFeignClient {

    @PostMapping(value = "/base/sysUser/getSysUserInfo")
    ResultMessage getSysUserInfo(@RequestParam("userId") Integer userId);

}
