package com.wch.springcloud.controller;

import com.wch.springcloud.entities.CommonResult;
import com.wch.springcloud.entities.Payment;
import com.wch.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        return paymentFeignService.getPaymentById(id);

    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){

        return paymentFeignService.paymentFeignTimeout();
    }

}
