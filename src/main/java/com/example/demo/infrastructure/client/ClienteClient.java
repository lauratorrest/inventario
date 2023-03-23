package com.example.demo.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "client-1", url = "localhost:8084/CLT/search")
public interface ClienteClient {
  @RequestMapping(method = RequestMethod.GET)
  ClienteResponse getCLiente(@RequestParam String id);
}
