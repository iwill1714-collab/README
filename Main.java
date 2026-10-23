
public class Main {
    public static void main(String[] args) {
        System.out.println("Grigorev Stanislav"); //Задание 1

        double result = accountBalance(500_000.12, 393_837.1);
        System.out.printf("%.2f", result); //Задание 2
    }
    public static double accountBalance(double revenues, double expenses) {
        double result = revenues - expenses;
        return result;
            }
}