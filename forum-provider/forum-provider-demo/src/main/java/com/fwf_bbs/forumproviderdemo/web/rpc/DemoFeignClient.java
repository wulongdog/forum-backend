package com.fwf_bbs.forumproviderdemo.web.rpc;

import com.fwf_bbs.forumcommon.api.CommonResult;
import com.fwf_bbs.forumproviderdemo.service.NoteService;
import com.fwf_bbs.forumproviderdemoapi.service.DemoFeignApi;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className DemoFeignClient
 * @description 微服务调用接口
 * @auther wulongdog
 * @date 2022/10/7  22:22
 */
@RestController

public class DemoFeignClient implements DemoFeignApi {

    @Resource
    private NoteService noteService;

    @Override
    public CommonResult<String> getDemo() {
        return CommonResult.success("调用测试");
    }

    @Override
    public CommonResult<Object> getNote() {
        return CommonResult.success(noteService.getById(6));
    }
}
