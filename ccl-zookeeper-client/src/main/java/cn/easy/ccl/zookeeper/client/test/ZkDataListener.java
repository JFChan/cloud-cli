package cn.easy.ccl.zookeeper.client.test;

import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.IZkDataListener;

/**
 * @ClassName: ZkDdataListener <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/22 3:12 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@Slf4j
public class ZkDataListener implements IZkDataListener {
    @Override
    public void handleDataChange(String path, Object data) throws Exception {
        log.debug("handleDataChange,path:{},data:{}", path, data);
    }

    @Override
    public void handleDataDeleted(String path) throws Exception {
        log.debug("handleDataDeleted,path:{}", path);
    }
}
