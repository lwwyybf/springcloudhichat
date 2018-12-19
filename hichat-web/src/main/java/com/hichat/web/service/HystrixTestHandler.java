package com.hichat.web.service;

import com.hichat.common.util.ReturnResult;

/**
 * @author: lww
 * @create: 2018-12-19
 */

public class HystrixTestHandler implements TestService {
    @Override
    public ReturnResult save(String ss) {
        return ReturnResult.build(200,"cuowu");
    }
}
