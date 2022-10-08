package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book=new Book();
        if(book.getName()=="Book") book.setName("Mysterious Island");
        if(book.getAuthor()=="None") book.setAuthor("Jules Verne");
        if(book.getYear_of_publication()==2000) book.setYear_of_publication(1875);
        if(book.getNum_of_pages()==500) book.setNum_of_pages(630);
        System.out.println(book);
    }
}
