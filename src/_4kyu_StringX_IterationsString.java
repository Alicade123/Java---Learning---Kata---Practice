public class _4kyu_StringX_IterationsString {
public static void main(String[] args){

    String s3= "String";
    System.out.println(stringFunc(s3, 0));//String
    System.out.println(stringFunc(s3, 1));//gSntir
    System.out.println(stringFunc(s3, 2));//rgiStn
    System.out.println(stringFunc(s3, 3));//nrtgSi
}
    public static String stringFunc(String s, long x) {
        long times = 0L;
        String txt ;
        do {
            txt = transformOnce(s);
            times++;
        }while (!txt.equals(s));
        x = x%times;
        if(x==0) return s;
        for (long i = 0; i < x; i++) s = transformOnce(s);
        return s;
    }

    public static String transformOnce(String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < result.length(); i++) {
            String prefix = result.substring(0, i);
            String suffix = result.substring(i);
            result = new StringBuilder(prefix).append(new StringBuilder(suffix).reverse());
        }
        return result.toString();
    }
}
