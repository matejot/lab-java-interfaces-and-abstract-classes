import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(".7");
        BigDecimal b = new BigDecimal(".1");
        BigDecimal sum = a.add(b);
        BigDecimal displayVal = sum.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(displayVal);
    }
}
