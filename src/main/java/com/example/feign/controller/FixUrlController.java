package com.example.feign.controller;

import com.example.feign.client.FixUrlClient;
import com.example.feign.dto.MonthlyWalletBill;
import com.example.feign.dto.ResultImpl;
import com.example.feign.dto.WalletBillRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("testController")
@RequestMapping("/test")
public class FixUrlController {
    private final FixUrlClient fixUrlClient;

    public FixUrlController(FixUrlClient fixUrlClient) {
        this.fixUrlClient = fixUrlClient;
    }

    @GetMapping("/walletbill")
    public ResultImpl<List<MonthlyWalletBill>> listWalletBill() {
        WalletBillRequest request = new WalletBillRequest();
        return fixUrlClient.listWalletBill(request);
    }

    @GetMapping("/testget")
    public String testGet() {
        WalletBillRequest request = new WalletBillRequest();
        return fixUrlClient.testGet(request);
    }

    @GetMapping("/testpost")
    public String testPost() {
        WalletBillRequest request = new WalletBillRequest();
        return fixUrlClient.testPost(request);
    }

    @GetMapping("/hello")
    public WalletBillRequest test() {
        WalletBillRequest request = new WalletBillRequest();
        request.setCardNos(new String[]{"CardNo1","CardNo2"});
        request.setMonth("202008");
        return request;
    }
}
