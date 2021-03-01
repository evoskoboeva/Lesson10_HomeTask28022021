package com.companyCat.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Создайте класс DocumentWorker. В теле класса создайте три метода:
//openDocument(), editDocument(), saveDocument(). В тело каждого из методов
//добавьте вывод на экран соответствующих строк: "Документ открыт",
//"Редактирование документа доступно в версии Про", "Сохранение
//документа доступно в версии Про" соответственно. Создайте
//производный класс ProDocumentWorker. Переопределите соответствующие
//методы, при переопределении методов выводите следующие строки: "Документ
//отредактирован", "Документ сохранен в старом формате. Сохранение в
//остальных форматах доступно в версии Эксперт".
//Создайте класс ExpertDocumentWorker — производный от базового класса
//ProDocumentWorker. Переопределите соответствующий метод, при вызове
//которого необходимо выводить на экран "Документ сохранен в новом формате".
//В теле метода main() реализуйте возможность приема от пользователя ключа
//доступа: pro или exp. Если пользователь не вводит ключ, то он может пользоваться
//только бесплатной версией (создается экземпляр базового класса), если
//пользователь ввел номера ключа доступа pro или exp, то должен создаться
//экземпляр соответствующей версии класса, приведенный к базовому —
//DocumentWorker.



        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Key: PRO/EX/..");
        String key = scanner.nextLine();
        if (key.equals("PRO")) {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            for (String s : Arrays.asList(proDocumentWorker.OpenDocument(), proDocumentWorker.EditDocument(), proDocumentWorker.SaveDocument())) {
                System.out.println(s);
            }
        }
        else if (key.equals("EX")){
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            for (String s : Arrays.asList(expertDocumentWorker.OpenDocument(), expertDocumentWorker.EditDocument(), expertDocumentWorker.SaveDocument())) {
                System.out.println(s);
            }
        }
        else {
            DocumentWorker documentWorker = new DocumentWorker();
            for (String s : Arrays.asList(documentWorker.OpenDocument(), documentWorker.EditDocument(), documentWorker.SaveDocument())) {
                System.out.println(s);
            }

        }
    }

}
