package org.cay.springcloud.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceGetStringError implements SchedualServiceGetString {
    @Override
    public String getStringFromClientOne() {
        return "getStringFromClientOne error!";
    }
}
