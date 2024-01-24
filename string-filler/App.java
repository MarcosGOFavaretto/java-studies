public class App {

    public static void main(String[] args) {

        String numeroOriginal = "200";
        String numeroFormatado = String.format("%03d", Integer.parseInt(numeroOriginal));
        System.out.println(numeroFormatado);
    }

}