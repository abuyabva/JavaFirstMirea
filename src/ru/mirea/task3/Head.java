package ru.mirea.task3;

public class Head {
    String hair_color;
    String eye_color;
    public String getHair_color(){return hair_color;}
    public String getEye_color(){return eye_color;}
    public void setHair_color(String h){hair_color=h;}
    public void setEye_color(String e){eye_color=e;}
    public String toString(){
        return "Head{"
                +"hair color: "+hair_color
                +" eye color: "+eye_color
                +"}";
    }
    public Head(){
        hair_color="Black";
        eye_color="Black";
    }
}
