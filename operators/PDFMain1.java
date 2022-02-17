/** Задача №1
 * Из двух введённых с клавиатуры чисел, одно из которых чётное, а другое нечётное,
 * определить и вывести на экран НЕ чётное число.
 */

package operators;

import java.util.Scanner;

public class PDFMain1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите чётное или нечётное число 1");
        int a = scan.nextInt();
        System.out.println("Введите чётное или нечётное число 2");
        int b = scan.nextInt();

        if (a % 2 == 0 && b % 2 != 0) { // если b нечётное - выводим b
            System.out.println(b);
        } else if (a % 2 != 0 && b % 2 == 0) { // если a нечётное - выводим a
            System.out.println(a);
        } else if (a % 2 != 0 && b % 2 != 0) { // если a и b нечётные - выводим Вы ввели оба нечётных
            System.out.println(b + " " + a + " -> Вы ввели оба нечётных числа");
        } else {                               // иначе выводим Вы ввели оба чётных
            System.out.println(b + " " + a + " -> Вы ввели оба чётных числа");
        }


    }
}
