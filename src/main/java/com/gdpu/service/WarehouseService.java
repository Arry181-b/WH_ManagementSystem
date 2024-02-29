package com.gdpu.service;

import com.gdpu.bean.Warehouse;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.annotation.Resource;

/**
 * <p>
 *  服务类
 * </p>
 *
 *  
 *   
 */
public interface WarehouseService extends IService<Warehouse> {

    Integer getMaximumId();
}
