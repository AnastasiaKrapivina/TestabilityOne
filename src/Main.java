public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; // Стоимость билета
        int miles = service.calculate(price);
        System.out.println("количество миль = " + miles);
    }
}