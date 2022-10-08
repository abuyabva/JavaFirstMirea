package ru.mirea.task3;

public class Book {
    int num_of_pages;
    String author;
    int year_of_publication;
    String name;
    public int getYear_of_publication(){return year_of_publication;}
    public int getNum_of_pages(){return num_of_pages;}
    public String getAuthor(){return author;}
    public String getName(){return name;}
    public void setAuthor(String a){author=a;}
    public void setYear_of_publication(int y){year_of_publication=y;}
    public void setName(String n){name=n;}
    public void setNum_of_pages(int n){num_of_pages=n;}
    public String toString(){
        return "Book{"
                +"Name: "+name
                +" | Author: "+author
                +" | Year of publication: "+year_of_publication
                +" | Pages: "+num_of_pages;
    }
    public Book(){
        num_of_pages=500;
        author="None";
        year_of_publication=2000;
        name="Book";
    }
}
