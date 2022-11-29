// import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Imput triangular number: ");
//         int n = scanner.nextInt();
//         for (int i = 1; i <= n; i++) {

//         }
//         System.out.printf("Triangular of %d = %d", n, n * (n + 1) / 2);
//         System.out.println();
//         System.out.print("Imput factorial number: ");

//         int n2 = scanner.nextInt();
//         int factorial = 1;
//         for (int i = 1; i <= n2; ++i) {
//             factorial *= i;
//         }
//         System.out.printf("Factorial of %d = %d", n2, factorial);

//     }
// }

// Вывести все простые числа от 1 до 1000

// public class App {
//     public static void main(String[] args) {
//         for (int i = 2; i < 1000; ++i) {
//             int count = 0;
//             for (int j = 2; j <= i && count < 2; ++j) {
//                 if (i % j == 0) {
//                     ++count;
//                 }
//             }
//             if (count < 2)
//                 System.out.print(i + " ");
//         }
//     }
// }

// Реализовать простой калькулятор

// public class App {
//     static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         int num1 = getInt();
//         int num2 = getInt();
//         char operation = getOperation();
//         int result = calc(num1, num2, operation);
//         System.out.print("Результат операции = " + result);
//     }

//     public static int getInt() {
//         System.out.print("Введите число: ");
//         int num;
//         if (scanner.hasNextInt()) {
//             num = scanner.nextInt();
//         } else {
//             System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз!");
//             scanner.next();
//             num = getInt();
//         }
//         return num;
//     }

//     public static char getOperation() {
//         System.out.print("Введите операцию: ");
//         char operation;
//         if (scanner.hasNext()) {
//             operation = scanner.next().charAt(0);
//         } else {
//             System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз!");
//             scanner.next();
//             operation = getOperation();
//         }
//         return operation;
//     }

//     public static int calc(int num1, int num2, char operation) {
//         int result;
//         switch (operation) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 result = num1 / num2;
//                 break;
//             default:
//                 System.out.println("Операция не распознана. Повторите ввод.");
//                 result = calc(num1, num2, getOperation());
//         }
//         return result;
//     }
// }