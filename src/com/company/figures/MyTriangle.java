package com.company.figures;

public class MyTriangle {
    private static final double EPSILON = 0.00001;
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    enum TypeTriangle { EQUILATERAL, ISOSCELES, SCALENE }

    public MyTriangle ( int x1, int y1, int x2, int y2, int x3, int y3 ) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public MyTriangle ( MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString () {
        return "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]" ;
    }

    public double getPerimeter () {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType () {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        final double threshold = EPSILON;
        boolean triangleExist = ((side1+side2) > side3) || ((side1+side3) > side2) || ((side2+side3) > side1);
        if (triangleExist)
            if ( (Math.abs((side1 - side2)) < threshold) && (Math.abs((side2 - side3)) < threshold) && (Math.abs((side3 - side1)) < threshold) ) {
                return TypeTriangle.EQUILATERAL.toString();
            }
            else if ( (Math.abs((side1 - side2)) < threshold) || (Math.abs((side2 - side3)) < threshold) || (Math.abs((side3 - side1)) < threshold)){
                return TypeTriangle.SCALENE.toString();
            }
            else {
                return TypeTriangle.EQUILATERAL.toString();
            }
        else
            return "Triangle is not exist";
    }
}
