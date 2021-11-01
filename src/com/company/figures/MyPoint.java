package com.company.figures;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint () {
    }

    public MyPoint ( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY () {
        return new int[]{x,y};
    }

    public void setXY (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance (int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(Math.pow(xDiff,2) + Math.pow(yDiff,2));
    }

    public double distance ( MyPoint another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(Math.pow(xDiff,2) + Math.pow(yDiff,2));
    }

    public double distance () {
        return Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // первый шаг

        if (!(obj instanceof MyPoint)) return false; // второй шаг

        if(obj == null) return false;

        MyPoint myPoint = (MyPoint) obj; // третий шаг

        return this.x == myPoint.x && this.y == myPoint.y; // вывод
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + x;
        result = 31*result + y;

        return result;
    }


}
