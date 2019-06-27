package org.cay.springcloud.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetStringService {
    @Autowired
    RestTemplate restTemplate;

    public String getStringService() {
        return restTemplate.getForObject("http://service-demo/getString", String.class);
    }
}
