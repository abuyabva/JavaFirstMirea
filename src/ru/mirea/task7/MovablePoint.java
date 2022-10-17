package ru.mirea.task7;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    @Override
    public void moveUp(){
        y+=1;
    }
    @Override
    public void moveDown() {
        y-=1;
    }

    @Override
    public void moveLeft() {
        x-=1;
    }

    @Override
    public void moveRight() {
        x+=1;
    }

    public String toString(){
        return "Point: {"+
                "X: "+x+
                " | Y: "+y+
                " | xSpeed: "+xSpeed+
                " | ySpeed: "+ySpeed+
                "}";
    }
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
}
