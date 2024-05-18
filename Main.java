import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
//        BigDecimal a = new BigDecimal(".7");
//        BigDecimal b = new BigDecimal(".1");
//        BigDecimal sum = a.add(b);
//        BigDecimal displayVal = sum.setScale(2, RoundingMode.HALF_EVEN);
//        System.out.println(displayVal);

        BigDecimal bun = new BigDecimal(7456.2533676523465);
        BigDecimal hundreth = bun.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(hundreth);

        BigDecimal num = new BigDecimal(24356.34958756);
        BigDecimal reverseTenth = num.setScale(1, RoundingMode.HALF_EVEN).negate();
        System.out.println(reverseTenth);


    }


}
