package cn.easy.ccl.zookeeper.client.test;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

/**
 * @ClassName: ZkDataSubscribe <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/22 3:28 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
public class ZkDataSubscribe implements IZkSubscribe {

    private ZkClient zkClient;

    public ZkDataSubscribe(ZkClient zkClient) {
        this.zkClient = zkClient;
    }

    @Override
    public void subscribeDataChanges(String path, IZkDataListener zkDataListener) {
        zkClient.subscribeDataChanges(path, zkDataListener);
    }
}
