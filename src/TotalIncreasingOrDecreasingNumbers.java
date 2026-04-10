import java.math.BigInteger;
import java.util.Arrays;

public class TotalIncreasingOrDecreasingNumbers {
   public static void main(String[] args) {
        System.out.println(totalIncDec(0));//1
        System.out.println(totalIncDec(1));//10
        System.out.println(totalIncDec(2));//100
        System.out.println(totalIncDec(3));//475
        System.out.println(totalIncDec(4));//1675
        System.out.println(totalIncDec(5));//4954
    }
    public static BigInteger totalIncDec(int x){
        BigInteger returnValue = BigInteger.valueOf(0);
        if(x == 0) return BigInteger.valueOf(1);
        else if(x == 1) return BigInteger.valueOf(10);
        else if(x == 2) return BigInteger.valueOf(100);
        else if(x >= 3) {
             returnValue= BigInteger.valueOf(100);
            for(int i=101;i<(int)Math.pow(10,x);i++){
                returnValue = returnValue.add(validity(i));
                }
            return returnValue;
            }
        return returnValue;
    }
        public static BigInteger validity(int Value){
            boolean creasingType = false;
            int num = Value;
            String [] nums = String.valueOf(Value).split("");
             creasingType =   Arrays.stream(nums).allMatch(e->e.equals(nums[0]));

          if(creasingType||check(num)) return BigInteger.valueOf(1);
             else return BigInteger.valueOf(0);

        }
        public static boolean check(int number){
            String [] nums = String.valueOf(number).split("");
                boolean valid;
                int previsous =Integer.parseInt(nums[0]);
                int next ;
                valid = true;
                for(int j=1; j<nums.length; j++){
                    next = Integer.parseInt(nums[j]);
                    if(previsous<=next) previsous = next;
                    else {
                        valid = false;
                        break;
                    }
                }
                if(!valid){
                    valid = true;
                    for(int j=1; j<nums.length; j++){
                        next = Integer.parseInt(nums[j]);
                        if(previsous>=next) previsous = next;
                        else {
                            valid = false;
                            break;
                        }
                    }
                }
            return valid;
            }

}
