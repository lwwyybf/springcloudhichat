package com.hichat.web.service;

import com.hichat.common.util.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hichat-provide",fallback = HystrixTestHandler.class)
public interface TestService {

    @RequestMapping(value = "/sss/ttt",method = RequestMethod.GET)
    ReturnResult save(@RequestParam String ss);

}
