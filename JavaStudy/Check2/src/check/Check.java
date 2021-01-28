package check;
import constants.Constants;

public class Check {
    private static String firstName="金井";
    private static String lastName="修司";
    public static void main(String[] args) {

         fulname();
         Pet k =new Pet (Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
         k.introduce();
         RobotPet s =new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
         s.introduce();
    }
    public static void fulname() {
        System.out.println( "printNameメソッド  →"+firstName + lastName);
    }
}



