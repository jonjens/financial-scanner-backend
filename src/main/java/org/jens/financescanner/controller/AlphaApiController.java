package org.jens.financescanner.controller;

import org.jens.financescanner.service.ForexService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/forex")
public class AlphaApiController {

    @Autowired
    private ForexService forexService;

    @GetMapping("/data")
    public String getForexData() throws IOException {
        return forexService.getForexData();
    }

}
