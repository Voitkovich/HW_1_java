// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

// import java.util.Scanner;

// public class seminar_1 {
//     public static void main(String[] args) {
//         System.out.print("Ваше имя: ");
//         Scanner in = new Scanner(System.in);
//         String name = in.nextLine();
//         System.out.println("Привет," + name + "!");
//         in.close();
//     }
// }



// Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

// public class seminar_1 {
//     public static void main(String[] args) {
//         int[] arr = new int[] {1,1,0,1,1,1,1,0,1,1,1,1,1};
//         int count = 0;
//         int countMax = 0;
//         for(int i: arr){
//             if (i == 1){
//                 count++;
//             }
//             else{
//                 if (count >= countMax) {
//                     countMax = count;
//                 }
//                 count = 0;
//             }
//         }
//         if (count > countMax){
//             countMax = count;
//         }
//         System.out.println(countMax);
//     }
// }


// Дан массив nums = [3,2,2,3,4,3] и число val вводим с клавиатуры

// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
// Ввод: 3
// Вывод:
// 2, 2, 4, 3, 3, 3

// public class seminar_1 {
//     public static void main(String[] args) {
//         int[] num = new int[] {2, 2, 5, 4, 3, 3, 3, 2}; 
//         int[] arr = new int[num.length];
//         int val = 2;
//         int idX = 0;
//         for(int i = 0; i < num.length; i ++){
//             if (val != num[i]){
//                 arr[idX] = num[i];
//                 idX++;
//             }
//         }
//         for (int i = idX; i < arr.length; i++) {
//             arr[i] = val;
//         }
//         for (int i : arr) {
//             System.out.print(" " + i);
//         }
//     }
// }

// ***Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

// import java.util.Scanner;

// public class HW_1 {
//     public static void main(String[] args) {
//         Scanner n = new Scanner(System.in);
//         System.out.println("Введите число: ");
//         int num = n.nextInt();
//         n.close();

//         int f = 1;
//         for (int i = 1; i <= num; i++)
//             f = f * i;
//         System.out.println("Факториал числа: " + f);
        
//         int sum = 0;
//         for (int i = 1; i <= num; i++)
//             sum = sum + i;
//             System.out.println("Треугольное числo: " + sum);
//     }
// }



// ***Вывести все простые числа от 1 до 1000



// import java.util.Scanner;

// public class HW_1 {
//    public static void main(String args[]) {		
// 	int temp;
// 	boolean number = true;
// 	Scanner n= new Scanner(System.in);
// 	System.out.println("Введите число для проверки:");
// 	int num = n.nextInt();

//         for (int i = 2; i <= num / 2; i++) {
//            temp = num % i;
// 	   if (temp == 0) {
// 	      number = false;
// 	      break;
// 	   }
// 	}

// 	if(number) {
// 	   System.out.println("простое число");
// 	} else {
// 	   System.out.println("составное число");
//         }
//    }
// }

// ***Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
import java.util.Scanner;

public class HW_1 {
   public static void main(String args[]) {	

Scanner scan = new Scanner(System.in);

System.out.println("Введите первое число: ");
int num1 = scan.nextInt();

System.out.println("Введите оператор: (+ или - или * или /) ");
char operation = scan.next().charAt(0);

System.out.println("Введите второе число: ");
int num2 = scan.nextInt();

if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
    System.err.println("Неверная операция!");}

else if (operation == '/' && num2 == 0) {
    System.err.println("На ноль делить нельзя!");
}

switch (operation) {
    case '+':
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
         break;
    case '-':
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        break;
    case '*':
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        break;
    case '/':
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        break;
        
    }
}
   }


// ****(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69