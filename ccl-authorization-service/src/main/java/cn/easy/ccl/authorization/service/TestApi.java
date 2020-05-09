package cn.easy.ccl.authorization.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestApi <br/
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/30 5:15 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@RestController
@RequestMapping("test")
public class TestApi {

    @PostMapping(value = "/query")
    public String query() {
        return "TestApi.query";
    }

}
