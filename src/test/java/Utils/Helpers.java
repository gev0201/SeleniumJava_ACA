package Utils;

import Test.LogClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.security.SecureRandom;

public class Helpers {

    public static final Logger logger = LogManager.getLogger(LogClass.class.getName());

    public String randomStr(int strLenght){
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(strLenght);
        for(int i = 0; i < strLenght; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public Logger loging(){
        return logger;

    }
}
