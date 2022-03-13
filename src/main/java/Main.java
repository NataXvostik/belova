import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       Browsers browser = Browsers.CHROME;

        switch (browser) {
            case CHROME:
                System.out.println("Использую хром");
                break;
            case OPERA:
                System.out.println("Использую оперу");
                break;
            case SAFARI:
                System.out.println("Использую сафари");
                break;
            case IE:
                System.out.println("Использую IE");
                break;
            default:
                System.out.println("Неизвестный браузер");
                break;
        }
    }
}

