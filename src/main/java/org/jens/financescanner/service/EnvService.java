package org.jens.financescanner.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EnvService {


    @Value("${gpt}")
    private String gpt4;

    public String getGpt4(){
        return gpt4;
    }

}
