public class Main {
    public static void main(String[] args) {
        // Объявляем переменную для хранения стоимости билета
        double ticketPrice = 20000.0;
        double milesPerRuble = 1.0 / 20.0;

        // Рассчитываем количество начисленных миль и округляем до ближайшего целого числа
        int miles = (int) Math.round(ticketPrice * milesPerRuble);

        // Выводим результат на экран
        System.out.println("За купленный билет начислено " + miles + " миль.");
    }
}