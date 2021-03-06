package com.yzu.jxbookpay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.BestPayService;
import com.yzu.jxbookpay.pojo.PayInfo;

import java.math.BigDecimal;

public interface IPayService {

    /*
    创建/发起支付
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);


    String asyncNotify(String notifyData);

    PayInfo queryByOrderId(String orderId);
}
