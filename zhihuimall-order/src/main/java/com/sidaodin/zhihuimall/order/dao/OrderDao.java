package com.sidaodin.zhihuimall.order.dao;

import com.sidaodin.zhihuimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 16:15:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
