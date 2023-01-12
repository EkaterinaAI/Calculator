import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t***Калькулятор произведения, разницы, суммы и частного 2х чисел***");

        System.out.println("Введите 1 число:");
        double firstInt = new Scanner(System.in).nextDouble();

        System.out.println("Введите 2 число:");
        double secondInt = new Scanner(System.in).nextDouble();

        var in = 1;
        System.out.println("Произведение 2х чисел: " + firstInt + " * " + secondInt + " = " + (firstInt * secondInt) );
        System.out.println("Разница 2х чисел: " + firstInt + " - " + secondInt + " = " + (firstInt - secondInt) );
        System.out.println("Сумма 2х чисел: " + firstInt + " + " + secondInt + " = " + (firstInt + secondInt) );
        System.out.println("Деление 2х чисел: " + firstInt + " / " + secondInt + " = " + (firstInt / secondInt) );
    }
}
