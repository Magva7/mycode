package javarush_mycode;

public class Change_class_var_in_method_param {
    /**Задаем значение переменной класса равное параметру, который передаем в метод*/
    /**Условия в задаче следующие:
     * Как зовут кота?
     * Помогите коту обрести имя с помощью метода setName.
     *
     *
     * Требования:
     * 1. Класс Cat должен содержать только одну переменную name.
     * 2. Переменная name должна иметь модификатор доступа private и тип String.
     * 3. Класс Cat должен содержать только два метода setName и main.
     * 4. Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
     */

    private String name = "безымянный кот";

    public void setName(String name) {
        /**Метод setName класса Cat должен устанавливать значение
         * переменной private String name равным переданному параметру String name через this.
         * Т.е. this будет обращаться к переменной класса, в котором мы метод вызываем,
         * а не к самой переменной метода*/
        this.name = name; /**тут у нас та, что с this это переменная класса, а просто
         name, которое после =, это параметр, который мы передаем в метод*/

    }

    public static void main(String[] args) {
        Change_class_var_in_method_param cat = new Change_class_var_in_method_param();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
