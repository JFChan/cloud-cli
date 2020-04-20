package cn.easysw.ccl.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/20 9:29 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String test(){
        return "test back";
    }
}
