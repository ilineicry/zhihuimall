package com.sidaodin.zhihuimall.order.dao;

import com.sidaodin.zhihuimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 16:15:43
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
