public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double result = service.calculate(111, 1.89);

        System.out.println("Ваш ИМТ составляет " + result);

    }
}
