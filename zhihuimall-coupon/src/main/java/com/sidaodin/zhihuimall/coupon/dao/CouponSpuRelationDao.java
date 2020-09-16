package com.sidaodin.zhihuimall.coupon.dao;

import com.sidaodin.zhihuimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 15:28:37
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
