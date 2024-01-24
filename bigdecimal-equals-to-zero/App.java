import java.math.BigDecimal;

class App {

    public static void main(String[] args) {

        BigDecimal zero = new BigDecimal(0.0d);
        BigDecimal myBd = new BigDecimal(0);

        System.out.println(zero);
        System.out.println(myBd);
        System.out.println(zero.equals(myBd));
    }

}