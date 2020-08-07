package com.example.feign.controller;


import com.example.feign.client.RegCenterClient;
import com.example.feign.dto.MonthlyWalletBill;
import com.example.feign.dto.ResultImpl;
import com.example.feign.dto.WalletBillRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/statement")
public class RegCenterController {
    private final RegCenterClient regCenterClient;

    public RegCenterController(RegCenterClient regCenterClient) {
        this.regCenterClient = regCenterClient;
    }

    @GetMapping("/bills")
    public ResultImpl<List<MonthlyWalletBill>> listWalletBill() {
        WalletBillRequest request = new WalletBillRequest();
        request.setMonth("201012");
        request.setCardNos(new String[]{"no1","car 2"});
        return regCenterClient.listWalletBill(request);
    }
}
