package com.sidaodin.zhihuimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sidaodin.common.utils.PageUtils;
import com.sidaodin.zhihuimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 16:15:43
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

