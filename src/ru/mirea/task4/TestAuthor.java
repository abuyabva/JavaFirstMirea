package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alex", "mail@.ru", 'M');
        System.out.println("Name: "+author.getName());
        System.out.println("email: "+author.getEmail());
        System.out.println("Gender: "+author.getGender());
        author.setEmail("frgcbuiysdgf@mail.ru");
        System.out.println("email: "+author.getEmail());
        System.out.println(author);
    }
}
