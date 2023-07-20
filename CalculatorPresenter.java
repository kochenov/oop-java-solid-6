/**
 * Интерфейс, представляющий Presenter (презентер) в архитектуре MVP.
 */
public interface CalculatorPresenter {
    /**
     * Обработка события нажатия на кнопку вычисления.
     * Рефакторинг 1: Переименование метода onCalculateButtonClicked в презентере.
     */
    void calculate();
}