/*1.Вывести n-ое треугольного число ()сумма чисел от 1 до n
*2.Факториал числа n!
*3. Вывести все простые числа от 1 до 1000
*4. Реализовать простой калькулятор: использовать условия и цикл. Программа должна запросить: введите 1 число, введите 2 число. 
*Выберите операцию 1-сложить, 2-вычесть, 3- умножить, 4-разделить
*5. Задано уравнение q+w=e. Где q, w, e целые неотрицательные числа. Некоторые числа могут быть заменены знаком вопроса. например 2?+?5=69. 
*Требуется восстановить выражение до верного равенства.
*Предложить хотябы одно решение или сообщить что его нет
*6. Вводится массив (количество элементов, сами элементы). Найдите сумму элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались
*7.Дан список. Выведите те его элементы, которые встречаются в списке один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке. 
*Вводится список чисел. Все числа списка находятся на одной строке 
 * 
 */
import java.util.Scanner;
public class homeworkJ1 {  
    static void task1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for (int i = 1; i <= n; i++) {
            c=i+c;    
        }
        System.out.println(c);
        sc.close();
    }

    static void task2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=1;
        for (int i = 1; i <= n; i++) {
            c=i*c;    
        }
        System.out.println(c);
        sc.close();
    }
    static void task3() {
        for (int j = 1; j < 1000; j++) {
           int k = 0;
            for (int i = 1; i < j+1; i++) {
                if (j % i == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.println(j + " ");
            }
        }
    }
    static void task4() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n_1 = sc.nextInt();
        int n_2 = sc.nextInt();
        switch (a){
            case 1: 
                System.out.printf("%d + %d = %d \n", n_1, n_2, n_1+n_2);
                break;
            case 2:
                System.out.printf("%d - %d = %d \n", n_1, n_2, n_1-n_2);
                break;
            case 3:
                System.out.printf("%d * %d = %d \n", n_1, n_2, n_1*n_2);
                break;
            case 4:
                double b= (double) n_1;
                double d = (b/n_2);
                System.out.printf("%d : %d = %.2f\n ", n_1, n_2, d);
                break;
        }
        sc.close();
        
    }

    static void task6() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int summ = 0;
        for (int i = 0; i < arr.length; i++)
            if (i%2 == 0)
                summ += arr[i];
 
        System.out.println(summ);
        for (int i = 0; i < arr.length; i+=2){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    static void task7() {
        int[] array = new int[]
        {
            1, 2, 3, 2, 3, 3, 5, 4, 7, 1, 5
        };
        for (int i = 0; i < array.length; i++)
        {
            int count = 0;
            for (int j = 0; j < array.length; j++)
                if (array[i] == array[j])
                    count++;

            if (count == 1)
                System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                task1();
            break;
            case 2:
                task2();
            break;
            case 3:
                task3();
            break;
            case 4:
                task4();
            break;
            case 6:
                task6();
            break;
            case 7:
                task4();
            break;
            }
        sc.close();   

    } 

}
