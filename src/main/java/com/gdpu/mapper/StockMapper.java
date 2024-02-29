package com.gdpu.mapper;

import com.gdpu.bean.Stock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 *  
 *   
 */
public interface StockMapper extends BaseMapper<Stock> {

    void updateByIds(Stock stock);


}
