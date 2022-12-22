import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BookShelf s1 = new BookShelf();

        System.out.println("Выводим пустую книжную полку:");
        s1.cOut();
        System.out.println("\n\n");

        String inFileName = "D:\\PP last projects\\BookShelfWSWJ\\src\\in.json";
        String outFileName = "D:\\PP last projects\\BookShelfWSWJ\\src\\out.json";

        System.out.println("Вводим книжную полку из json и выводим:");
        s1.readJSON(inFileName);
        s1.cOut();
        System.out.println("\n\n");

        System.out.println("Сортируем книжную полку по названиям, выводим и записываем json:");
        s1.sortByBookName();
        s1.cOut();
        s1.writeJSON(outFileName);
        System.out.println("\n\n");

        System.out.println("Отбираем книги Достоевского и выводим:");
        s1.arrayListCOut(s1.FilterByAuthorName("Достоевский"));
        System.out.println("\n\n");

        System.out.println("Отбираем книги Неверного автора и выводим:");
        s1.arrayListCOut(s1.FilterByAuthorName("Неизвестный"));
        System.out.println("\n\n");

        System.out.println("Считаем книги Достоевского и выводим:");
        System.out.println("Книг достоевского -> " + s1.numberOfBooksByThisAuthor("Достоевский"));
        System.out.println("\n\n");

        System.out.println("Группируем книжки по авторам и выводим:");
        s1.cOutMapByAuthor(s1.groupByAuthor());
        System.out.println("\n\n");



    }
}

/*
Задача 0:
поменять сортировки через лямбду
задача 1:
отобрать книги одного автора (в ArrayList)
задача 2:
посчитать книги одного автора
задача 3:
получить группы книжек по авторам
*/

/*
        s1.addBook("Эрагон", "Кристафер паулини");
        s1.addBook("Война и мир", "Толстой");
        s1.addBook("Максимы и моральные рассуждения", "Лараш Фуко");
        s1.addBook("Преступление и наказание", "Достоевский");
        s1.addBook("Руслан и Людмила", "Пушкин");
        s1.addBook("Искусство войны", "Сунь Дзы");
        s1.addBook("ООП С++", "Лафоре");
        s1.addBook("Белые ночи", "Достоевский");
        s1.addBook("Бесы", "Достоевский");
*/