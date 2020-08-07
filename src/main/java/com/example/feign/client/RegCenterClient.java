package com.example.feign.client;

import com.example.feign.config.Rap2FeignConfig;
import com.example.feign.dto.MonthlyWalletBill;
import com.example.feign.dto.ResultImpl;
import com.example.feign.dto.WalletBillRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 通过注册中心发现服务地址
 */
@FeignClient(name = "statement-svr",configuration = Rap2FeignConfig.class)
public interface RegCenterClient {

    @RequestMapping(value = "/month/wallet/bills",method = RequestMethod.GET)
    ResultImpl<List<MonthlyWalletBill>> listWalletBill(WalletBillRequest request) ;
}
