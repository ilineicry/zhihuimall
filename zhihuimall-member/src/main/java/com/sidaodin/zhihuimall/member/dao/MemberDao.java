package com.sidaodin.zhihuimall.member.dao;

import com.sidaodin.zhihuimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 16:01:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
