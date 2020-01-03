package javarush_mycode;

public class sum_all_cifr {
    public static void main(String[] args) {
        /**Сумма цифр в числе или сумма цифр числа*/
        int number = 53332324;

        /*Теперь пробуем универсальный метод, для этого сначала надо найти количество цифр в числе, т.е. длинну массива*/
        /*Вводим новую переменную, в которой будет тоже самое, что в числе, только в виде String*/
        String number2 = number + "";

        /*Вводим переменную для подсчета длины массива*/
        int count = number2.length();
//        System.out.println("Цифр в числе: " + count);

        /*Вариант без цикла*/
        int a = number % (int) Math.pow(10, count) / (int) Math.pow(10, count - 1);
        int b = number % (int) Math.pow(10, count - 1) / (int) Math.pow(10, count - 2);
        int c = number % (int) Math.pow(10, count - 2) / (int) Math.pow(10, count - 3);
        int d = number % (int) Math.pow(10, count - 3) / (int) Math.pow(10, count - 4);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        /*Суммируем цифры в числе и выводим*/
        int result = a + b + c + d;
        System.out.println("Сумма первых четырех цифр в числе: " + result);

        /*Теперь пробуем замутить это все через цикл, делаться в цикле каждую итерацию будет следующее:
        - в переменную result суммируется a,b,c,d именно суммируется, а не добавляется
         */
        /*Переменная, в которой будут суммироваться цифры*/
        int resultLoop = 0;

        for (int i = 0; i < count; i++) {
            int m;//переменная для очередной цифры, каждую итерацию она будет меняться
            m = number % (int) Math.pow(10, count-i) / (int) Math.pow(10, count - (i+1));
            resultLoop = resultLoop + m;

        }
        System.out.println("Сумма цифр через цикл: "+resultLoop);
    }
}
