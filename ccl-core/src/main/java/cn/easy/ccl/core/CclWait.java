package cn.easy.ccl.core;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: CclWait <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2020/4/20 9:59 下午<br/>
 * @author: jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@Slf4j
public class CclWait {

    public static volatile boolean quit = false;

    public static void waitNow() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                CclWait.log.info("############## shutdown ##################");
                synchronized (CclWait.class) {
                    CclWait.quit = true;
                    CclWait.class.notify();
                }
            }
        });

        synchronized (CclWait.class) {
            while (!quit) {
                try {
                    CclWait.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
