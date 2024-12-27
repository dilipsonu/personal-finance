package org.orangeleaf.personalfinance.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/")
@Slf4j
public class InternalControllerV1 {
	
	@GetMapping("ping")
	public String ping() {
		return "pong - " + new Date();
	}
	
	@GetMapping("epoch")
	public String epoch() {
		return "epoch - " + System.currentTimeMillis();
	}
}
