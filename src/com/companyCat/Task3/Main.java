package com.companyCat.Task3;

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
            System.out.println(proDocumentWorker.OpenDocument());
            System.out.println(proDocumentWorker.EditDocument());
            System.out.println(proDocumentWorker.SaveDocument());
        }
        else if (key.equals("EX")){
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println(expertDocumentWorker.OpenDocument());
            System.out.println(expertDocumentWorker.EditDocument());
            System.out.println(expertDocumentWorker.SaveDocument());
        }
        else {
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.println(documentWorker.OpenDocument());
            System.out.println(documentWorker.EditDocument());
            System.out.println(documentWorker.SaveDocument());

        }
    }

}
