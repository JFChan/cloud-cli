package cn.easy.ccl.zookeeper.client.test;

import org.I0Itec.zkclient.IZkDataListener;

/**
 * @ClassName: IZkSubscribe <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/22 3:30 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
public interface IZkSubscribe {

    void subscribeDataChanges(String path, IZkDataListener zkDataListener);
}
