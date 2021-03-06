package com.cheng.weixin.service.user.dao;

import com.cheng.weixin.common.core.dao.BaseDaoMapper;
import com.cheng.weixin.rpc.user.entity.DeliveryAddress;
import org.springframework.stereotype.Repository;

/**
 * Desc: 配送地址
 * Author: cheng
 * Date: 2016/7/7
 */
@Repository
public interface DeliveryAddressDaoMapper extends BaseDaoMapper<DeliveryAddress> {
    /**
     * 获取默认的配送地址
     * @return
     */
    //DeliveryAddress loadDefaultAddress( DeliveryAddress address);
}
