
// ***Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
import java.util.Scanner;

public class HW_3 {
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