package cn.tedu.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurakaServer {
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return "coco";
	}
}
