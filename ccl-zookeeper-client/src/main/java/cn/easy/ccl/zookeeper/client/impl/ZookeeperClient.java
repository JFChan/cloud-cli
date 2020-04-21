package cn.easy.ccl.zookeeper.client.impl;

import cn.easy.ccl.zookeeper.client.enums.ENodeMode;
import cn.easy.ccl.zookeeper.client.exception.ZookeeperClientException;
import cn.easy.ccl.zookeeper.client.exception.ZookeeperClientExceptionConstant;
import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @ClassName: ZookeeperClient <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/21 3:11 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@Slf4j
public class ZookeeperClient extends AbstractZookeeperClient {

    private ZkClient zkClient;

    public ZookeeperClient(ZkClient zkClient) {
        this.zkClient = zkClient;
    }

    @Override
    public boolean existNode(String path) {
        super.pathNotBeNull(path);
        return zkClient.exists(path.trim());
    }

    @Override
    public <T> String createNode(String path, ENodeMode mode, T data) {
        super.pathNotBeNull(path);
        switch (mode) {
            case EPHEMERAL:
                zkClient.createEphemeral(path, data);
                return path;
            case EPHEMERAL_SEQUENTIAL:
                zkClient.createEphemeralSequential(path, data);
                return path;
            case PERSISTENT:
                zkClient.createPersistent(path, data);
                return path;
            case PERSISTENT_SEQUENTIAL:
                zkClient.createPersistentSequential(path, data);
                return path;
            default:
                throw new ZookeeperClientException(ZookeeperClientExceptionConstant.NOTE_MODE_CAN_NOT_BE_NULL);
        }
    }

    @Override
    public boolean deleteNode(String path) {
        try {
            super.pathNotBeNull(path);
            List<String> childrens = zkClient.getChildren(path.trim());
            if (!CollectionUtils.isEmpty(childrens)) {
                for (String children : childrens) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(path.trim());
                    stringBuffer.append("/");
                    stringBuffer.append(children);
                    zkClient.delete(stringBuffer.toString());
                }
            }
            boolean delete = zkClient.delete(path.trim());
            return delete;
        } catch (Exception e) {
            log.error("删除节点错误,路径:{}", path);
            log.error("删除节点错误:", e);
            return false;
        }
    }

    @Override
    public <T> T getData(String path) {
        super.pathNotBeNull(path);
        return zkClient.readData(path.trim());
    }
}
