package cn.easy.ccl.zookeeper.client;

import cn.easy.ccl.zookeeper.client.enums.ENodeMode;

/**
 * @ClassName: IZookeeperClient <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/21 3:02 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
public interface IZookeeperClient {
    /**
     * node是否存在
     *
     * @param path 路径
     * @return
     */
    boolean existNode(String path);


    /**
     * 创建节点
     *
     * @param path 路径
     * @param mode 节点模式
     * @param data 数据
     * @param <T>
     * @return
     */
    <T> String createNode(String path, ENodeMode mode, T data);


    /**
     * 删除节点
     *
     * @param path
     * @return
     */
    boolean deleteNode(String path);


    /**
     * 获取节点下的数据
     *
     * @param path 路径
     * @param <T>
     * @return
     */
    <T> T getData(String path);


}
