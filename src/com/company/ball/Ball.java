package com.company.ball;

import java.util.Objects;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta =  speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return "Ball[("+x+", "+y+"), speed=("+xDelta+", "+yDelta+")]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // первый шаг

        if (!(obj instanceof Ball)) return false; // второй шаг

        if(obj == null) return false;

        Ball ball = (Ball) obj; // третий шаг

        return this.x == ball.x && this.y == ball.y && this.radius == ball.radius && this.xDelta == ball.xDelta && this.yDelta == ball.yDelta; // вывод
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + radius;
        result = 31*result + Float.floatToIntBits(x);
        result = 31*result + Float.floatToIntBits(y);
        result = 31*result + Float.floatToIntBits(xDelta);
        result = 31*result + Float.floatToIntBits(yDelta);

        return result;
    }

}