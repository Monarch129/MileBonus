public class Main {
    public static void main(String[] args) {

        BonusMileService service = new BonusMileService();
        int miles = service.calculate(10_000);
        System.out.println("Ваш бонус " + miles + " Миль");
    }
}