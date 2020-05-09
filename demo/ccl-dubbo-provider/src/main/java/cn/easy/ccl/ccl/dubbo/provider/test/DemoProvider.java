package cn.easy.ccl.ccl.dubbo.provider.test;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoProvider <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/23 6:01 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@Service
@Component
public class DemoProvider implements IDemoProvider {

    @Override
    public String getDemoName() {
        return "DEMO";
    }
}
