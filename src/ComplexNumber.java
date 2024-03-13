/**
 * Класс описывающий создание комплексного числа
 */
public class ComplexNumber {
double matArg; // Вещественная часть комплексного числа
double imaginaryArg; // Мнимая часть комплексного числа

    /**
     * Конструктор класса с параметрами
     * @param matArg Вещественная часть комплексного числа
     * @param imaginaryArg Мнимая часть комплексного числа
     */
    public ComplexNumber(double matArg, double imaginaryArg ) {
        this.matArg = matArg;
        this.imaginaryArg = imaginaryArg;
    }

    /**
     * Метод получения вещественной части комплексного числа
     * @return Вещественная часть комплексного числа
     */
    public double getMatArg() {
        return matArg;
    }

    /**
     * Метод получения мнимой части комплексного числа
     * @return Мнимая часть комплексного числа
     */
    public double getImaginaryArg() {
        return imaginaryArg;
    }
}
