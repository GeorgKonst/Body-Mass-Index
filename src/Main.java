import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш вес в килограммах:");
        int clientWeight = in.nextInt();

        System.out.println("Введите Ваш рост в сантиметрах:");
        int clientHeight = in.nextInt();

        double bmi = service.calculate(clientWeight, clientHeight);

        if (bmi < 15.99) {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.2f", bmi);
            System.out.println();
            System.out.println("У Вас выраженный дифицит массы тела");
        } else if (bmi < 18.49) {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.2f", bmi);
            System.out.println();
            System.out.println("У Вас недостаточная масса тела");
        } else if (bmi < 24.99) {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.2f", bmi);
            System.out.println();
            System.out.println("У Вас нормальная масса тела");
        } else if (bmi < 29.99) {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.2f", bmi);
            System.out.println();
            System.out.println("У Вас избыточная масса тела");
        } else if (bmi < 34.99) {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.2f", bmi);
            System.out.println();
            System.out.println("У Вас ожирение первой степени");
        } else if (bmi < 39.99) {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.2f", bmi);
            System.out.println();
            System.out.println("У Вас ожирение второй степени");
        } else {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.2f", bmi);
            System.out.println();
            System.out.println("У Вас ожирение третей степени");
        }
    }
}
