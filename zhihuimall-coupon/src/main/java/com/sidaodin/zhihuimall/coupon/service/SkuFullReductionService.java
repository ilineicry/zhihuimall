package com.sidaodin.zhihuimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sidaodin.common.utils.PageUtils;
import com.sidaodin.zhihuimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 15:28:37
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

