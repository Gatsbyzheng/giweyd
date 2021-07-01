package ink.gatsby.giweyd.controller;

import ink.gatsby.giweyd.common.CommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("success")
    public CommonResponse<String> success() {
        return CommonResponse.success("sadasdas");
    }

    @GetMapping("fail")
    public CommonResponse fail() {
        return CommonResponse.fail();
    }
}
