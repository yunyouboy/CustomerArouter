package com.xiangxue.common.order.net;

import com.xiangxue.arouter_api.Call;

import java.io.IOException;

/**
 * 订单模块对外暴露接口，其他模块可以获取返回业务数据
 */
public interface OrderAddress extends Call {

    OrderBean getOrderBean(String key, String ip) throws IOException;
}
