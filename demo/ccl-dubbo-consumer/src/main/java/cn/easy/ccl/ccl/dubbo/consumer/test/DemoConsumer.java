package cn.easy.ccl.ccl.dubbo.consumer.test;

import cn.easy.ccl.ccl.dubbo.provider.test.IDemoProvider;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
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

@Slf4j
@Component
public class DemoConsumer implements IDemoConsumer {

    @Reference(check = false)
    private IDemoProvider demoProvider;

    @Override
    public String getDemoName() {
        log.debug("DemoConsumer.getDemoName:{}", demoProvider.getDemoName());
        return demoProvider.getDemoName();
    }
}
