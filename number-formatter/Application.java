import java.text.NumberFormat;
import java.util.Locale;

class Application {

	public static void main(String[] args) {

		NumberFormat fmt = NumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));
		
	}
}
