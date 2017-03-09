import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <类详细说明>
 *
 * @Author： HuangHai
 * @Version: 2017-03-09
 **/
public class HelloWorld {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public  void getWorldSound() {
        logger.info("hello world");
        String tidParam = System.getProperty("tidParam");
        System.out.println("tidParam is :"+tidParam);
    }
}
