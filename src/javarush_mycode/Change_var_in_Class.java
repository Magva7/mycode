package javarush_mycode;

public class Change_var_in_Class { /**Это у меня так класс называется, в задаче он называется Cat*/
    /**Увеличиваем значение переменной через метод - увеличиваем количество котов*/
    /**В самой задаче были следующие условия*/
    /**Учет котов
     Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
     За количество котов отвечает переменная catsCount.


     Требования:
     1. Класс Cat должен содержать только одну переменную catsCount.
     2. Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
     3. Класс Cat должен содержать два метода addNewCat и main.
     4. Метод addNewCat класса Cat должен увеличивать количество котов на 1.*/

    private static int catsCount = 0;

    public static void addNewCat() {
        catsCount++;

    }

    public static void main(String[] args) {

    }
}