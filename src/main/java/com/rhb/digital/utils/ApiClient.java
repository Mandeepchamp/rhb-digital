package com.rhb.digital.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiClient {

    public String getDataFromGoogle() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.google.com", String.class);
    }
}
