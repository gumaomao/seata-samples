package com.seata.business.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "inventory-service")
@Component
public interface InventoryClient {

    @GetMapping("inventory/deduct")
    public void deduct(@RequestParam("commodityCode") String commodityCode , @RequestParam("count")  int count);
}