package org.cay.springcloud.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetStringServiceController {
    @Autowired
    GetStringService getStringService;

    @GetMapping(value = "/getStringService")
    @HystrixCommand(fallbackMethod = "getStringServiceError")
    public String getStringService() {
        return getStringService.getStringService();
    }

    public String getStringServiceError() {
        return "getStringService error!";
    }

}
