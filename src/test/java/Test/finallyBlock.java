package Test;

class TestFinallyBlock {
    public static void main(String args[]){
        try {
            checkFileCapacity();
        } catch (ArithmeticException e){
            System.out.println("Please upload a vile less than 2 mb");
        }

    }

    public static void checkFileCapacity(){
        if (1+1 == 2){
            throw new ArithmeticException("Chi karox patahel");
        }
    }
//        try{
////below code do not throw any exception
//            int data=25/0;
//            System.out.println(data);
//        }
////catch won't be executed
//        catch(Exception e){
//            System.out.println(e);
//        }
////executed regardless of exception occurred or not
//        finally {
//            throw new ArithmeticException("Person is not eligible to vote");
//        }
//
//    }
}
