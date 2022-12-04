import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // задача 1
        System.out.println("задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        if (age>= 18)
            System.out.println("Поздравляю Вы совершеннолетный");
        else
            System.out.println("Возраст совершеннолетия ещё не наступил");
        System.out.println();


        // задача 2
        System.out.println("задача 2");
        System.out.println("Введите возраст");
        int age2 = scanner.nextInt();
        if (age2 >=18 && age2<=23)
            System.out.println(" закончил школу и может отправляться в университет");
        else if (age2<18 && age2>7)
            System.out.println(" ребенок ходит в школу");
        else if (age2>= 24)
            System.out.println("ему пора искать первую работу");
        System.out.println();

        // задача 3
        System.out.println("задача 3");
        System.out.println("Введите число пассажиров");
        int people = scanner.nextInt();
        if (people >= 60 && people < 102)
            System.out.println("есть только стоячие места");
        else if (people<60)
            System.out.println("есть седячие и  стоячие места ");
        else
            System.out.println("Мест нет");
        System.out.println();

    }
    }
