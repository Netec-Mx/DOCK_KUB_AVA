package com.ms.email.msemial.controller;

import com.ms.email.msemial.dto.jms.JmsEmailDetails;
import com.ms.email.msemial.service.IEmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class EmailController {

    private final IEmailService iEmailService;


    public EmailController(IEmailService iEmailService) {
        this.iEmailService = iEmailService;
    }

    @PostMapping
    public ResponseEntity<?> send(@RequestBody JmsEmailDetails emailDetails){
        this.iEmailService.sendSimpleMail(emailDetails);
        return ResponseEntity.ok().build();
    }
}
