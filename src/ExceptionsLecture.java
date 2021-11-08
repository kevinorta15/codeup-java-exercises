public class ExceptionsLecture {
    public static void main(String[] args) throws Exception{

//        System.out.println("Hello World");
////        throw new Exception("Something bad happened..");
//
//        try{
//            System.out.println("Can I divide by zero?");
//            int result =  1 / 0 ;
//            System.out.println("It worked!");
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }

        //An even deeper example:

        try {
            throw new Exception("Something went wrong! \n Error! \n Error!");
        } catch (NullPointerException e){
            e.printStackTrace();
            e.getMessage();
        } catch (RuntimeException e){
            System.out.println("Runtime fired...");
            e.printStackTrace();
            e.getMessage();
        } catch (Exception e){
            System.out.println("Generic fired..");
            e.printStackTrace();
            e.getMessage();
        }

    }
}
