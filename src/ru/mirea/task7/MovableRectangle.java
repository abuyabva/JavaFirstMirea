package ru.mirea.task7;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    @Override
    public void moveUp() {
        topLeft.y+=1;
        bottomRight.y+=1;
    }

    @Override
    public void moveRight() {
        topLeft.x+=1;
        bottomRight.x+=1;
    }

    @Override
    public void moveLeft() {
        topLeft.x-=1;
        bottomRight.x-=1;
    }

    @Override
    public void moveDown() {
        topLeft.y-=1;
        bottomRight.y-=1;
    }

    public String toString(){
        return "Rectangle: {"+
                "TopLeft: {"+
                "X: "+topLeft.x+
                " | Y: "+topLeft.y+
                "} BottomRight: {"+
                "X: "+bottomRight.x+
                " | Y: "+bottomRight.y+
                "} xSpeed: "+topLeft.xSpeed+
                " | ySpeed: "+topLeft.ySpeed+
                "}";
    }
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft=new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight=new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
}
