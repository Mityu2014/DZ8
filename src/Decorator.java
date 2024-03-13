/**
 * Класс описывающий расщирение функционала калькулятора дополнительным логгированием
 */
public class Decorator implements iCalculator{
    private CalculatorComplexNumber a; // переменная типа калькулятора
    private Logger b; // переменная расширяющая функционал калькулятора типа логгера

    /**
     * Конструктор класса с параметрами
     * @param a переменная типа калькулятора
     * @param b переменная расширяющая функционал калькулятора типа логгера
     */
    public Decorator(CalculatorComplexNumber a, Logger b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Метод расчета суммы комплексных чисел с расширенным логгированием
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат сложения
     */
    @Override
    public iCalculator sum(ComplexNumber complexNumber1,ComplexNumber complexNumber2) {
        b.log(String.format("Производится вызов метода sum с аргументами: Первый арг. - вещ. число: "+complexNumber1.getMatArg()+", мнимое число: "+complexNumber1.getImaginaryArg()+"i"
                +"; Второй арг. - вещ. число: "+complexNumber2.getMatArg()+", мнимое число: "+complexNumber2.getImaginaryArg())+"i");
        iCalculator result = a.sum(complexNumber1,complexNumber2);
        return result;
    }
    /**
     * Метод расчета произведения комплексных чисел с расширенным логгированием
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат произведения
     */
    @Override
    public iCalculator multi(ComplexNumber complexNumber1,ComplexNumber complexNumber2) {
        b.log(String.format("Производится вызов метода multi с аргументами: Первый арг. - вещ. число: "+complexNumber1.getMatArg()+", мнимое число: "+complexNumber1.getImaginaryArg()+"i"
                +"; Второй арг. - вещ. число: "+complexNumber2.getMatArg()+", мнимое число: "+complexNumber2.getImaginaryArg())+"i");
        iCalculator result = a.multi(complexNumber1,complexNumber2);
        return result;
    }
    /**
     * Метод расчета деления комплексных чисел с расширенным логгированием
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат деления
     */
    @Override
    public iCalculator div(ComplexNumber complexNumber1,ComplexNumber complexNumber2) {
        b.log(String.format("Производится вызов метода div с аргументами: Первый арг. - вещ. число: "+complexNumber1.getMatArg()+", мнимое число: "+complexNumber1.getImaginaryArg()+"i"
                +"; Второй арг. - вещ. число: "+complexNumber2.getMatArg()+", мнимое число: "+complexNumber2.getImaginaryArg())+"i");
        iCalculator result = a.div(complexNumber1,complexNumber2);
        return result;
    }
    /**
     * Метод вывода результата с расширенным логгированием
     * @return результат
     */
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = a.getResult();
        b.log(String.format("Вещественная часть: "+ result.getMatArg()+", мнимая часть: " + result.getImaginaryArg())+"i");
        return result;
    }

}
