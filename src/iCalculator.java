public interface iCalculator {
    /**
     * Метод расчета суммы комплексных чисел
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат сложения
     */
    iCalculator sum(ComplexNumber complexNumber1,ComplexNumber complexNumber2);
    /**
     * Метод расчета произведения комплексных чисел
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат произведения
     */
    iCalculator multi(ComplexNumber complexNumber1,ComplexNumber complexNumber2);
    /**
     * Метод расчета деления комплексных чисел
     * @param complexNumber1 первое комплексное число
     * @param complexNumber2 второе комплексное число
     * @return комплексное число - результат деления
     */
    iCalculator div(ComplexNumber complexNumber1,ComplexNumber complexNumber2);
    /**
     * Метод вывода результата
     * @return результат
     */
    ComplexNumber getResult();
}
