import java.util.Scanner;

/**
 * Класс описывающий взаимодействия с пользователем через консоль
 */
public class ViewCalculator {
    private iCalculator calculator;

    /**
     * Конструктор класса с параметрами
     * @param calculator калькулятор
     */
    public ViewCalculator(iCalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Метод запуска калькулятора
     */
    public void run() {
        while (true) {
            double matArg = promptInt("Введите вещественную часть первого аргумента: "); // Вещественная часть первого комплексного числа
            double imaginaryArg = promptInt("Введите мнимую часть первого аргумента: ");  // Мнимая часть первого комплексного числа
            ComplexNumber complexNumber1 = new ComplexNumber(matArg,imaginaryArg);

            while (true) {
                String cmd = prompt("Введите команду (+, *, /) : ");// принимаемое значение математической операции от пользователя
                if (cmd.equals("*")) {
                    calculator.multi(complexNumber1, prompComplNum());
                    calculator.getResult();
                    break;
                }
                if (cmd.equals("+")) {
                    calculator.sum(complexNumber1, prompComplNum());
                    calculator.getResult();
                    break;
                }
                if (cmd.equals("/")) {
                    ComplexNumber complexNumber2 = prompComplNum();
                    if (complexNumber2.getImaginaryArg()==0 && complexNumber2.getMatArg() ==0){ // проверка знаменателя
                        System.out.println("Знаменатель не может быть равен 0!");
                        break;
                    }
                    calculator.div(complexNumber1, complexNumber2);
                    calculator.getResult();
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (y/n)?"); // принимаемое значение от пользователя для выхода/перезапуска калькулятора
            if (cmd.equals("y")) {
                continue;
            }
            break;
        }
    }

    /**
     * Метод принимающий команды от пользователя
     * @param message информационное сообщение
     * @return принимаемая команда
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Метод принимающий числовые значения от пользователя
     * @param message информационное сообщение
     * @return принимаемое число
     */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

    /**
     * Метод принимающий комплексное число от пользователя
     * @return комплексное число
     */
    private ComplexNumber prompComplNum(){
        int matArg = promptInt("Введите вещественную часть второго аргумента: ");
        int imaginaryArg = promptInt("Введите мнимую часть второго аргумента: ");
        return new ComplexNumber(matArg,imaginaryArg);
    }
}
