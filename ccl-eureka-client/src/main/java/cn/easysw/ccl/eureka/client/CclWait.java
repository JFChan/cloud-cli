package cn.easysw.ccl.eureka.client;

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

    static volatile boolean quit = false;

    protected static void waitNow() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                CclWait.log.info("############## shutdown ##################");
                synchronized (CclEurekaClientApplication.class) {
                    CclEurekaClientApplication.quit = true;
                    CclEurekaClientApplication.class.notify();
                }
            }
        });

        synchronized (CclEurekaClientApplication.class) {
            while (!quit) {
                try {
                    CclEurekaClientApplication.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
