package ru.mirea.task4;

public class Author {
    String name;
    String email;
    char gender;
    public String getName(){return name;}
    public String getEmail(){return email;}
    public char getGender(){return gender;}
    public void setEmail(String e){email=e;}
    public String toString(){
        return "Author{"
                +"Name: "+name
                +" | email: "+email
                +" | gender: "+gender;
    }
    public Author(String n, String e, char g){
        name=n;
        email=e;
        gender=g;
    }
}
