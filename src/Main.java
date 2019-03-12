import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        int a = Integer.parseInt("00000000000000000000000000000100", 2);
        System.out.println(a);
        System.out.println(2 >>> 1);

//        String s = String.format("Hello %s%s%s", "jerry-", "li", ",welcome!");
//        String s1 = String.format("Hello %2$s%3$s%1$s", "li-", "heng-", "jie");
//
//        System.out.println(s);
//        System.out.println(s1);
//
//        int n2 = 9999999;
//        System.out.printf("%(,d %n", n2);
//        String str = String.format("%07d", 78);
//        System.out.println(""+ str);
//
//        DecimalFormat format = new DecimalFormat("0.00");
//        String abc = "100.456";
//        String a = format.format(new BigDecimal(abc));
//        System.out.println(a);
    }

}
