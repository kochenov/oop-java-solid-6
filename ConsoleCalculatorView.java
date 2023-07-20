import java.util.Scanner;

/**
 * Реализация View (представления) в архитектуре MVP для консольного ввода и вывода.
 * Рефакторинг 4: Разделение интерфейсов представления и модели данных.
 * Изменяем соответствующим образом реализацию ConsoleCalculatorView
 */
public class ConsoleCalculatorView implements CalculatorInputView, CalculatorOutputView {
    private Scanner scanner;

    public ConsoleCalculatorView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void showResult(double result) {
        System.out.println("Результат: " + result);
    }


    @Override
    public double getFirstNumber() {
        System.out.print("Введите первое число: ");
        return scanner.nextDouble();
    }

    @Override
    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        return scanner.nextDouble();
    }

    @Override
    public char getOperation() {
        System.out.print("Введите операцию (+, -, *, /): ");
        return scanner.next().charAt(0);
    }
}