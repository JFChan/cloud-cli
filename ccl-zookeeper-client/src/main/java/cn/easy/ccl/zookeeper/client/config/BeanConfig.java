package cn.easy.ccl.zookeeper.client.config;

import org.I0Itec.zkclient.ZkClient;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: BeanConfig <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/21 6:19 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@Configurable
public class BeanConfig {

    /**
     * zk注册地址,多个IP地址用逗号分割
     * org.apache.zookeeper.client.ConnectStringParser
     */
    @Value("${zookeeper.ip}")
    private String ip;
    @Value("${zookeeper.session.timeout}")
    private int sessionTimeOut;
    @Value("$${zookeeper.connection.timeout}")
    private int connectionTimeOut;

    @Bean
    ZkClient zkClient() {
        return new ZkClient(ip, sessionTimeOut, connectionTimeOut);
    }
}
