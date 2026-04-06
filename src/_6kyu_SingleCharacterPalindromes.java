public class _6kyu_SingleCharacterPalindromes {
    public static void main(){
        System.out.println(solve("abba")); //, "OK");
        System.out.println(solve("abbaa")); //, "remove one");
        System.out.println(solve("abbaab")); //, "not possible");
        System.out.println(solve("madmam")); //, "remove one");
        System.out.println(solve("raydarm")); //, "not possible");
        System.out.println(solve("hannah")); //, "OK");
    }
    public static String solve(String s){
     if(s.equals(new StringBuilder(s).reverse()+"")) return "OK";
     else{
         for (int i = 0; i<s.length(); i++){
             String a = new StringBuilder(s).deleteCharAt(i).toString();
             if(a.equals(new StringBuilder(a).reverse()+""))  return "remove one";

         }
     }
     return "not possible";
    }
}
