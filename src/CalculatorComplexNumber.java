/**
 * Класс описывающий основные методы калькулятора комплексных чисел
 */
public class CalculatorComplexNumber implements iCalculator {
    ComplexNumber primaryArg; // комплексное число возвращаемое в результате расчета методов

    /**
     * Метод расчета суммы комплексных чисел
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат сложения
     */
       @Override
    public iCalculator sum(ComplexNumber complexNumber1,ComplexNumber complexNumber2) {
           double matArg = complexNumber1.getMatArg() + complexNumber2.getMatArg();
           double imaginaryArg = complexNumber1.getImaginaryArg()+complexNumber2.getImaginaryArg();
           primaryArg = new ComplexNumber(matArg,imaginaryArg);
        return this;
    }

    /**
     * Метод расчета произведения комплексных чисел
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат произведения
     */
    @Override
    public iCalculator multi(ComplexNumber complexNumber1,ComplexNumber complexNumber2) {
        double matArg = complexNumber1.getMatArg() * complexNumber2.getMatArg() - complexNumber1.getImaginaryArg()* complexNumber2.getImaginaryArg();
        double imaginaryArg = complexNumber1.getImaginaryArg() * complexNumber2.getMatArg() + complexNumber1.getMatArg()* complexNumber2.getImaginaryArg();
        primaryArg = new ComplexNumber(matArg,imaginaryArg);
        return this;
    }

    /**
     * Метод расчета деления комплексных чисел
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат деления
     */
    @Override
    public iCalculator div(ComplexNumber complexNumber1,ComplexNumber complexNumber2) {
        double matArg = (complexNumber1.getMatArg() * complexNumber2.getMatArg() + complexNumber1.getImaginaryArg() * complexNumber2.getImaginaryArg())/
                (complexNumber2.getMatArg()*complexNumber2.getMatArg()+ complexNumber2.getImaginaryArg()*complexNumber2.getImaginaryArg());
        double imaginaryArg = (complexNumber1.getImaginaryArg() * complexNumber2.getMatArg() - complexNumber1.getMatArg()* complexNumber2.getImaginaryArg())/
                (complexNumber2.getMatArg()*complexNumber2.getMatArg()+ complexNumber2.getImaginaryArg()*complexNumber2.getImaginaryArg());
        primaryArg = new ComplexNumber(matArg,imaginaryArg);
        return this;
    }

    /**
     * Метод вывода результата
     * @return результат
     */
    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}