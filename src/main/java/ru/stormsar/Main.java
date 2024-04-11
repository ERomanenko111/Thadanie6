package ru.stormsar;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого пользователя: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите возраст первого пользователя: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        User user1 = new User(name1, age1);

        System.out.print("Введите имя второго пользователя: ");
        String name2 = scanner.nextLine();
        System.out.print("Введите возраст второго пользователя: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        User user2 = new User(name2, age2);

        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1.toString());
        } else {
            System.out.println(user2.toString());
        }
    }
}