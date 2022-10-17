package ru.mirea.task7;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    @Override
    public void moveDown() {
        center.y-=1;
    }

    @Override
    public void moveLeft() {
        center.x-=1;
    }

    @Override
    public void moveRight() {
        center.x+=1;
    }

    @Override
    public void moveUp() {
        center.y+=1;
    }
    public String toString(){
        return "Circle: {"+
                "Radius: "+radius+
                " | X: "+center.x+
                " | Y: "+center.y+
                " | xSpeed: "+center.xSpeed+
                " | ySpeed: "+center.ySpeed+
                "}";
    }
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }
}
