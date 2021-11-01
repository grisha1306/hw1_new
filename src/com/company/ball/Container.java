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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // первый шаг

        if (!(obj instanceof Container)) return false; // второй шаг

        if(obj == null) return false;

        Container container = (Container) obj; // третий шаг

        return this.x1 == container.x1 && this.x2 == container.x2 && this.y1 == container.y1 && this.y2 == container.y2; // вывод
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + x1;
        result = 31*result + x2;
        result = 31*result + y1;
        result = 31*result + y2;

        return result;
    }

}
