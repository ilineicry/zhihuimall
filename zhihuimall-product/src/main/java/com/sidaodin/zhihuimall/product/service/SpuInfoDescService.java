package com.sidaodin.zhihuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sidaodin.common.utils.PageUtils;
import com.sidaodin.zhihuimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 13:37:41
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

