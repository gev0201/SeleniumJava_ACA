package Test;

import org.apache.commons.lang3.ObjectUtils;

public class TryCatchExample1 {

        public static void main(String[] args) {
            int a = 50;
            Integer b = 0;
            String bb = null;
            try {
                int data=a/b; //may throw exception
                System.out.println(data);
                System.out.println("Urish Code");
            } catch (ArithmeticException exception){
                System.out.println("Please input valid parameters");
                try {
                    System.out.println(b/a);
                } catch (Exception e){
                    System.out.println("amaaan");
                }

            } catch (NullPointerException ex){
                System.out.println("NULL pointer");
            };

            try {
                int data1 = 1+1;
                System.out.println(data1);
            } catch (ArithmeticException exception){};


            System.out.println("rest of the code");

        }

    }
