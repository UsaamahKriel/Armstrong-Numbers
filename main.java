import java.lang.Math;
public class main{
   public static boolean Arm(int a){
         String number = String.valueOf(a); //code from https://stackoverflow.com/a/3389281
         char[] digits = number.toCharArray();
         int arm = 0;
         for (int i = 0; i < digits.length; i++){
            arm += Math.pow(Character.getNumericValue(digits[i]),3);
         }
         if (arm == a){
            return true;
         }else{
            return false;
         }
      }
   public static void main(String[] args){
      System.out.println(Arm(370));
   }
}
