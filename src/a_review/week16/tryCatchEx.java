package a_review.week16;

public class tryCatchEx {

    public static void main(String[] args) {
        String s = "java";
        try {

            System.out.println(s.charAt(1));
           // throw new RuntimeException();

        }catch (StringIndexOutOfBoundsException e) {
            System.out.println(s.charAt(0));
        } catch (RuntimeException e) {
            System.out.println("Exception");
        }finally {
            System.out.println("Finally block");
        }



    }

}
