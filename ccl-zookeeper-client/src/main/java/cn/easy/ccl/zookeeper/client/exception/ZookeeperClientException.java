package cn.easy.ccl.zookeeper.client.exception;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: ZookeeperClientException <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/21 3:14 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@Slf4j
public class ZookeeperClientException extends RuntimeException {

    public ZookeeperClientException() {
        super();
    }

    public ZookeeperClientException(String errMsg) {
        super(errMsg);
    }


}
