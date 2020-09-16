package com.sidaodin.zhihuimall.order.dao;

import com.sidaodin.zhihuimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 16:15:43
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
