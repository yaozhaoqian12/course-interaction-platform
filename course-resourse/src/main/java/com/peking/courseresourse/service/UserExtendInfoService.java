package com.peking.courseresourse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import utils.PageUtils;
import com.peking.courseresourse.entity.UserExtendInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author yy
 * @email 3110311633@qq.com
 * @date 2023-03-14 20:52:08
 */
public interface UserExtendInfoService extends IService<UserExtendInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

