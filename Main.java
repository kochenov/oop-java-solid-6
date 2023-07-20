/**
 * Класс, представляющий основной запуск программы и связывание Model, View и Presenter.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр представления для ввода и вывода
        CalculatorInputView inputView = new ConsoleCalculatorView();
        CalculatorOutputView outputView = new ConsoleCalculatorView();

        // Создаем экземпляр модели данных
        CalculatorModel model = new CalculatorModel();

        // Создаем презентер, передавая ему экземпляры представления и модели данных
        CalculatorPresenter presenter = new CalculatorPresenterImpl(inputView, outputView, model);

        // Запускаем выполнение расчета
        presenter.calculate();
    }
}