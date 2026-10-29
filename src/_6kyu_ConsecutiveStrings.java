import java.util.ArrayList;

public class _6kyu_ConsecutiveStrings {
    public static void main(){
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));// "abigailtheta"
        System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));// "oocccffuucccjjjkkkjyyyeehh"
        System.out.println(longestConsec(new String[] {}, 3));// ""
        System.out.println(longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));// "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck"
        System.out.println(longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));// "wlwsasphmxxowiaxujylentrklctozmymu"
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));// ""
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));// "ixoyx3452zzzzzzzzzzzz"
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15));// ""
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0));// ""
    }

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if (k <= 0 || k > n || n == 0) return "";
        else {
            ArrayList<String> results = new ArrayList<>();
            for (int i = 0; i <= strarr.length - k; i++) {
                int x = 0;
                StringBuilder str = new StringBuilder();
                while (x < k) {
                    str.append(strarr[i + x]);
                    x++;
                }
                results.add(str.toString());
            }

            String longest = "";
            for (String element : results) {
                if (element.length() > longest.length()) longest = element;
            }
            return longest;
        }
    }
}

