import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <类详细说明:log4j示例>
 *
 * @Author： HuangHai
 * @Version: 2017-03-09
 **/
public class Slf4jSample {
    public static void main(String[] args) {

        System.setProperty("tidParam","12341234124");
        Logger logger = LoggerFactory.getLogger(Slf4jSample.class);
        new HelloWorld().getWorldSound();
        final String message = "Hello logging!";
        logger.trace(message);
        logger.debug(message);
        logger.info(message);
        logger.warn(message);
        logger.error(message);
    }
}
