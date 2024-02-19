package org.jens.financescanner.controller;

import org.jens.financescanner.service.Gpt4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class GptController {

    @Autowired
    private Gpt4Service gptService;

    @PostMapping("/gpt4")
    public String chatGPT(@RequestBody String prompt) {
        return gptService.chatGPT(prompt);
    }
}
