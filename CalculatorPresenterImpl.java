/**
 * Реализация Presenter (презентера) в архитектуре MVP для выполнения математических операций.
 */
public class CalculatorPresenterImpl implements CalculatorPresenter {
    private CalculatorView view;

    public CalculatorPresenterImpl(CalculatorView view) {
        this.view = view;
    }

    @Override
    public void onCalculateButtonClicked() {
        double firstNumber = view.getFirstNumber();
        double secondNumber = view.getSecondNumber();
        char operation = view.getOperation();

        double result;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                view.showResult(Double.NaN);
                return;
        }

        view.showResult(result);
    }
}