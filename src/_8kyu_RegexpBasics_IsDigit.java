public class _8kyu_RegexpBasics_IsDigit {
    public static void main(){
        System.out.println(isDigit("jdkjahfkjn"));
    }
    public static boolean isDigit(String s) {
        return s!=null && s.matches("[0-9]");
    }
}
