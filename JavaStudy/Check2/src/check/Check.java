package check;
import constants.Constants;

public class Check {
    private static String firstName="金井";
    private static String lastName="修司";
    public static void main(String[] args) {
        System.out.println( printName( firstName, lastName));
         Pet k =new Pet (Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
         k.introduce();

         RobotPet s =new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
         s.introduce();

    }
    public static String printName(String firstName,String lastName) {
       return firstName + lastName;
    }
}



