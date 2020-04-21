package cn.easy.ccl.zookeeper.client.impl;

import cn.easy.ccl.zookeeper.client.IZookeeperClient;
import cn.easy.ccl.zookeeper.client.exception.ZookeeperClientException;
import cn.easy.ccl.zookeeper.client.exception.ZookeeperClientExceptionConstant;

/**
 * @ClassName: AbsZookeeperClient <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/21 2:13 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
public abstract class AbstractZookeeperClient implements IZookeeperClient {

    /**
     * 路径不为空
     *
     * @param path
     * @throws ZookeeperClientException
     */
    protected void pathNotBeNull(String path) throws ZookeeperClientException {
        if (path == null) {
            throw new ZookeeperClientException(ZookeeperClientExceptionConstant.PATH_CAN_NOT_BE_NULL);
        }
    }
}
