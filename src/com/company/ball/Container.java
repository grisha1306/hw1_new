package com.company.ball;

public class Container {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width - 1;
        this.y2 = y1 - height + 1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return (this.x2 - this.x1 + 1);
    }
    public int getHeight() {
        return (this.y2 - this.y1 + 1);
    }

    public boolean collidesWith(Ball ball)
    {
        float xLeft = ball.getX() - ball.getRadius();
        float xRight = ball.getX() + ball.getRadius();
        float yDown = ball.getY() - ball.getRadius();
        float yUp = ball.getY() + ball.getRadius();

        if (xLeft >= this.x1 && xRight <= this.x2 && yDown >= this.y2 && yUp <= this.y1)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Container[("+ x1 +","+ y1 +") to ("+ x2 +", "+ y2 +")]";
    }

}
