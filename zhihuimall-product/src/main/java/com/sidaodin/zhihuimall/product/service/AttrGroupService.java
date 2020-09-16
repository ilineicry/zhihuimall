package com.sidaodin.zhihuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sidaodin.common.utils.PageUtils;
import com.sidaodin.zhihuimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 13:37:41
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

