import java.util.List;
import java.util.ArrayList;

public class _6kyu_ReverseFizzBuzz {
    static void main() {
        System.out.println(reverseFizzBuzz("1 2 Fizz 4 Buzz"));//List.of(1, 2, 3, 4, 5)
        System.out.println(reverseFizzBuzz("Fizz 688 689 FizzBuzz")); //List.of(687, 688, 689, 690)
        System.out.println(reverseFizzBuzz("Fizz Buzz")); //List.of(9, 10)
    }


    public static List<Integer> reverseFizzBuzz(String string) {
        int x = 1;
        String[] s = string.split(" ");
        while (true) {
            List<Integer> result = new ArrayList<>();
            boolean match = true;
            for (int i = x; i < x + s.length; i++) {
                String curr;

                if (i % 3 == 0 && i % 5 == 0) curr = "FizzBuzz";
                else if (i % 3 == 0) curr = "Fizz";
                else if (i % 5 == 0) curr = "Buzz";
                else curr = String.valueOf(i);

                result.add(i);
                if (!curr.equals(s[i - x])) {
                    match = false;
                    break;
                }
            }
            if (match) return result;
            x++;
        }
    }
}
