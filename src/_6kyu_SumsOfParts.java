import java.util.Arrays;

public class _6kyu_SumsOfParts {
    public static void main(){
        System.out.println(Arrays.toString(sumParts(new int[]{})));// new int[] {0});
        System.out.println(Arrays.toString(sumParts(new int[]{0, 1, 3, 6, 10})));//  new int[] {20, 20, 19, 16, 10, 0});
        System.out.println(Arrays.toString(sumParts(new int[]{1, 2, 3, 4, 5, 6})));//  new int[] {21, 20, 18, 15, 11, 6, 0});
        System.out.println(Arrays.toString(sumParts(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358})));//  new int[] {10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0});

    }
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int currentSum = 0;
        for (int i = ls.length - 1; i >= 0; i--) {
            currentSum += ls[i];
            result[i] = currentSum;
        }
        return result;
    }
}
