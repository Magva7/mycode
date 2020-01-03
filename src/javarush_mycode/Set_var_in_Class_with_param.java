package javarush_mycode;

public class Set_var_in_Class_with_param { /*Как обычно это мое имя вместо имени Cat*/
    /**Задаем в классе значение переменной через парометр, который передаем в методе,
     * т.е. в методе передаем параметр, число и это число и будет новым значением переменной, нужно
     * это, чтобы увеличивать значение переменной через метод
     * Условия в задаче такие:
     *Задаем количество котов
     * Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).
     *
     *
     * Требования:
     * 1. Класс Cat должен содержать только одну переменную catsCount.
     * 2. Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
     * 3. Класс Cat должен содержать два метода setCatsCount и main.
     * 4. Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
     */

    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Set_var_in_Class_with_param.catsCount = catsCount;
    }

    public static void main(String[] args) {

    }
}
