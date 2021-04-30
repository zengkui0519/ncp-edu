package com.zk.edu.service;

import com.zk.edu.model.SysUser;

public interface BaseFeignService {

    SysUser getSysUserInfo(Integer userId);

}
