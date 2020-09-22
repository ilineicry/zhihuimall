package com.sidaodin.zhihuimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sidaodin.common.utils.PageUtils;
import com.sidaodin.zhihuimall.product.entity.AttrEntity;
import com.sidaodin.zhihuimall.product.vo.AttrGroupRelationVo;
import com.sidaodin.zhihuimall.product.vo.AttrRespVo;
import com.sidaodin.zhihuimall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author leilei
 * @email leileiagi@gmail.com
 * @date 2020-09-15 13:37:41
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

}
