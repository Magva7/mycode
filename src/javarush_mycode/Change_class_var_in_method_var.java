package javarush_mycode;

public class Change_class_var_in_method_var {
    /**Т.е. мы выставляем значение переменной в классе (глобальной) равной переменной метода,
     * у которой такое же имя, но в методе она локальная*/
    /**Условие в задаче следующее:
     * Программа учета имен
     * Допишите код метода setName, чтобы с его помощью установить значение private String fullName
     * равное значению локальной переменной String fullName через this. Т.е. this будет обращаться к
     * переменной класса, в котором мы метод вызываем, а не к самой переменной метода
     *
     *
     * Требования:
     * 1. Класс Cat должен содержать только одну переменную fullName.
     * 2. Переменная fullName должна иметь модификатор доступа private и тип String.
     * 3. Класс Cat должен содержать только два метода setName и main.
     * 4. Метод setName должен иметь локальную переменную fullName.
     * 5. Метод setName класса Cat должен устанавливать значение глобальной переменной private String fullName равным локальной переменной fullName.
     */

    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName; /**т.е. та, что с this это переменная класса, а просто
        fullname, которая после знака =, это локальная переменная метода*/
    }

    public static void main(String[] args) {

    }
}
