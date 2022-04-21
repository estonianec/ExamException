package com.company;

import com.company.Exceptions.WrongAnswerException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Напишите пример перехвата и обработки исключения с использованием собственных исключений.
        Scanner scanner = new Scanner(System.in);
        int correctAnswerHash = 1662;
        boolean isAnswered = false;
        System.out.println("Введите ответ на самый главный вопрос(у вас три попытки):");
        for (int i = 0; i < 3; i++) {
            if (scanner.nextLine().hashCode() == correctAnswerHash) {
                isAnswered = true;
                break;
            }
        }
        try {
            if (isAnswered) {
                System.out.println("Good for you");
            } else throw new WrongAnswerException("World terminate");
        } catch (WrongAnswerException e) {
            e.printStackTrace();
        }
// for commit
    }
}

