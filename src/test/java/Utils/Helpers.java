package Utils;

import org.apache.logging.log4j.LogManager;

import java.security.SecureRandom;
import java.util.logging.Logger;

public class Helpers {

    public String randomStr(int strLenght){
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(strLenght);
        for(int i = 0; i < strLenght; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

}
