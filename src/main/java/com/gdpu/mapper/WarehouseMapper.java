package com.gdpu.mapper;

import com.gdpu.bean.Warehouse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 *  
 *   
 */
public interface WarehouseMapper extends BaseMapper<Warehouse> {

    public Integer getMaximumId();
}
