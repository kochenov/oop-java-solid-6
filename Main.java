/**
 * Класс, представляющий основной запуск программы и связывание Model, View и Presenter.
 */
public class Main {
    public static void main(String[] args) {
        CalculatorView view = new ConsoleCalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenterImpl(view);

        presenter.onCalculateButtonClicked();
    }
}