import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        System.out.println("#################################");
        System.out.println("Задание 1.");
        printDouble();
        System.out.println("#################################");
        System.out.println("Задание 2.");
        division();
        System.out.println("#################################");
        System.out.println("Задание 3.");
        foo();
        System.out.println("#################################");
        System.out.println("Задание 4.");
        printString();
        System.out.println("#################################");

    }



    public static Scanner scanner = new Scanner(System.in);

    //region Task1
    public static void printDouble(){
        while (true){
            try{
                System.out.println("Введите число с плавающей точкой: ");
                double result = inputDouble();
                System.out.printf("Ваше число: %.2f\n", result);
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Неверный формат ввода");
            }
        }
    }
    public static double inputDouble(){

        double res = Double.parseDouble(scanner.nextLine());

        return res;
    }
    //endregion Task1

    //region Task2
    public static void division(){
        try {
            int d = 12;
            int[] intArray = new int[0];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
    //endregion Task2

    //region Task3
    public static void foo() throws Exception {
        try {
            String string = null;
            int x = string.length();

            int a = 90;
            int b = 3;
            System.out.println("Результат деления чисел: " + a / b);

            printSum(23, 234);

            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("file");
        }
        catch (FileNotFoundException e){
            System.out.println("Такого файла нет!");
        }
        finally {
            System.out.printf("Cумма чисел равна: %d\n", a + b);
        }

    }

    //endregion Task3

    //region Task4

    // Разработайте программу, которая выбросит Exception,
    // когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static String inputString(){
        String string = scanner.nextLine();
        return string;
    }

    public static String checkString(String str) throws EmptyStringException{
        if (str.isEmpty())
            throw new EmptyStringException("Empty string");
        return str;

    }

    public static void printString(){
        try{
            System.out.printf("Ваша строка: %s", checkString(inputString()));
        } catch (EmptyStringException e){
            System.out.println("Пустую строку нельзя выводить!");
        }

    }

    //endregion Task4
}







