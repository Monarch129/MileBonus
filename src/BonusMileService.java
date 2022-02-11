public class BonusMileService {
    public int calculate(int price) {
        int percent = 5;
        int miles = price * percent / 100;
        return miles;
    }
}