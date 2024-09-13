public class Main {
    public static void main(String[] args) {

        int initialBalance = 600;
        int addend = 1500;

        int bonus = 0;
        int finalBalance;
        if (addend > 1000) {
            bonus = addend / 100;
            finalBalance = initialBalance + addend + bonus;
        } else {
            bonus = 0;
            finalBalance = initialBalance + addend;
        }
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонусы: " + bonus);
    }
}