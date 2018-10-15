import org.apache.log4j.*;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

public class Test {

    // Инициализация логера
    private static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) throws Exception {
        Hobby person1 = new Hobby (false, 5, 3.5);
        Hobby person2 = new Hobby (59, 15.9, '4',
                3459, 0.60f);
        Hobby person3 = new Hobby();
        Hobby person4 = new Hobby(true, 84, 32.6,
                (byte) 27, '5', 863,
                (short) 53, 0.75f);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        BasicConfigurator.configure();

        log.info("Это информационное сообщение!");
        log.error("Это сообщение ошибки");
        log.debug("Debug");
    }
}
