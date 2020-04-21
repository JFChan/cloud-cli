package cn.easy.ccl.zookeeper.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: ENodeMode <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/21 3:24 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@AllArgsConstructor
@Getter
public enum ENodeMode {

    /**
     * 临时节点
     */
    EPHEMERAL(1),
    /**
     * 临时有序节点
     */
    EPHEMERAL_SEQUENTIAL(2),
    /**
     * 永久节点
     */
    PERSISTENT(3),
    /**
     * 永久有序节点
     */
    PERSISTENT_SEQUENTIAL(4);

    public int mode;
}
