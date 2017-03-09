import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <类详细说明:log4j示例>
 *
 * @Author： HuangHai
 * @Version: 2017-03-09
 **/
public class Slf4jSample {
   private static  Logger logger = LoggerFactory.getLogger(Slf4jSample.class);

    public static void main(String[] args) {
        final String message = "Hello logging!";
        String fileName = "./logs/"+ 4123421+"_logging.log";
        new Slf4jSample().updateFichierLogNames(fileName);
        new HelloWorld().getWorldSound();
        logger.trace(message);
        logger.debug(message);
        logger.info(message);
        logger.warn(message);
        logger.error(message);
    }

    public  void updateFichierLogNames(String fileName) {
        Properties props = new Properties();
        try {
            InputStream configStream = getClass().getResourceAsStream( "/log4j.properties");
            props.load(configStream);
            configStream.close();
        } catch (IOException e) {
            System.out.println("Error: Cannot laod configuration file");
        }

        props.setProperty("log4j.appender.file.File", fileName);

        LogManager.resetConfiguration();
        PropertyConfigurator.configure(props);

    }
}
