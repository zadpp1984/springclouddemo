package org.cay.springcloud.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetStringController {
    @Autowired
    SchedualServiceGetString schedualServiceGetString;

    @GetMapping(value = "/getStringFromFeign")
    public String getString() {
        return schedualServiceGetString.getStringFromClientOne();
    }
}
