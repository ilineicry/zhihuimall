package com.sidaodin.zhihuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sidaodin.common.utils.PageUtils;
import com.sidaodin.zhihuimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 13:37:41
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

