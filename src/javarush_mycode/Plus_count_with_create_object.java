package javarush_mycode;

public class Plus_count_with_create_object {
    /**Суть в том, что при создании каждого объекта класса, значение переменной в этом классе
     * увеличивает на 1, т.к. это как бы счетчик, который считает количество котов, т.е. каждый раз,
     * как мы создаем объект мы в этом объекте пишем, чтобы в классе переменная увеличилась на 1
     */
    /**Условия в задаче были такие:
     *Кошки во Вселенной
     * Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильное их количество.
     *
     *
     * Требования:
     * 1. Программа должна выводить текст на экран.
     * 2. Нельзя изменять строку отвечающую за вывод в консоль.
     * 3. Класс Cat должен содержать только одну переменную count.
     * 4. Переменная count класса Cat должна быть статической, иметь модификатор доступа public, тип int и проинициализирована нулем.
     * 5. В методе main должно быть только две проинициализированные переменные типа Cat.
     * 6. Переменная count должна содержать актуальное количество созданных объектов-котов.
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++; //увеличиваем в классе Cat переменную count

        Cat cat2 = new Cat();
        Cat.count++; //увеличиваем в классе Cat переменную count

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat { //создаем класс Cat
        public static int count = 0; //создаем в нем переменную count и ициализуем ее нулем
    }

}
