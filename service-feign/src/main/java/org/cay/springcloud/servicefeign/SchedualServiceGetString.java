package org.cay.springcloud.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-demo",fallback = SchedualServiceGetStringError.class)
public interface SchedualServiceGetString {

    @RequestMapping(value = "/getString", method = RequestMethod.GET)
    String getStringFromClientOne();

}
