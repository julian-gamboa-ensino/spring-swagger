package com.factory.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.factory.demo.models.ResponseTransfer;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@RestController
@RequestMapping("janeiro")
public class JaneiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaneiroApplication.class, args);
	}


    @PostMapping(value="/document", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseTransfer postResponseController() {
        return new ResponseTransfer("madrugada 2.7.0");
     }

}
