// ***Вывести все простые числа от 1 до 1000



import java.util.Scanner;

public class HW_2 {
   public static void main(String args[]) {		
	int temp;
	boolean number = true;
	Scanner n= new Scanner(System.in);
	System.out.println("Введите число для проверки:");
	int num = n.nextInt();

        for (int i = 2; i <= num / 2; i++) {
           temp = num % i;
	   if (temp == 0) {
	      number = false;
	      break;
	   }
	}

	if(number) {
	   System.out.println("простое число");
	} else {
	   System.out.println("составное число");
        }
   }
}
