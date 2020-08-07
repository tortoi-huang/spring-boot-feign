package com.example.feign.client;

import com.example.feign.config.Rap2FeignConfig;
import com.example.feign.dto.MonthlyWalletBill;
import com.example.feign.dto.ResultImpl;
import com.example.feign.dto.WalletBillRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 调用外部url，不走注册中心
 */
@FeignClient(name = "rap2-service",url = "http://192.168.0.104:8080/app/mock/7",configuration = Rap2FeignConfig.class)
public interface FixUrlClient {

    @RequestMapping(value = "/month/wallet/bills",method = RequestMethod.GET)
    ResultImpl<List<MonthlyWalletBill>> listWalletBill(WalletBillRequest request) ;

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    String testGet(WalletBillRequest testParam);
    @RequestMapping(value = "/test1",method = RequestMethod.POST)
    String testPost(WalletBillRequest testParam);
}
