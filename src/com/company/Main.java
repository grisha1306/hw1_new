package com.company;

import com.company.ball.Ball;
import com.company.ball.Container;
import com.company.complex.MyComplex;
import com.company.figures.*;
import com.company.polynom.MyPolynomial;
import com.company.work.*;
import com.company.library.*;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

//        Circle circle = new Circle();
//        System.out.println(circle.getColor());
//        System.out.println(circle.getRadius());
//        System.out.println(circle.toString());
//        System.out.println(circle.getArea());

//        Rectangle rectangle = new Rectangle(5f,8f);
//        System.out.println(rectangle.getLength());
//        rectangle.setLength(10f);
//        System.out.println(rectangle.getLength());
//        rectangle.setWidth(3f);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.toString());

//        Employee employee = new Employee(1, "Grigoriy", "Shumilov", 60000 );
//        System.out.println(employee.raiseSalary(3));
//        System.out.println(employee.toString());

        Author a1 = new Author("Petr", "Petr@gmail.com", 'm');
        Author a2 = new Author("Ivan", "Ivan@gmail.com", 'm');
        Author[] authors = new Author[] {a1, a2};
        Book book = new Book("War", authors, 50.0, 1);
        System.out.println(book.getName());
        System.out.println((book.getAuthorNames()));
        System.out.println(Arrays.toString(book.getAuthors()));
//        System.out.println(book.toString());

//        MyPoint myPoint = new MyPoint(0,1);
//        System.out.println(Arrays.toString(myPoint.getXY()));
//        System.out.println(myPoint.toString());
//        System.out.println(myPoint.distance(2, -2));
//        MyPoint myPoint1 = new MyPoint(2,-2);
//        System.out.println(myPoint.distance(myPoint1));
//        myPoint.setXY(2,2);
//        System.out.println(Arrays.toString(myPoint.getXY()));
//        System.out.println(myPoint.distance());


//        MyTriangle myTriangle = new MyTriangle(0,0,2,4,4,0);
//        MyPoint v1 = new MyPoint(3,3);
//        MyPoint v2 = new MyPoint(-3,-3);
//        MyPoint v3 = new MyPoint(3,5);
//        MyTriangle myTriangle1 = new MyTriangle(v1,v2,v3);
//        System.out.println(myTriangle.toString());
//        System.out.println(myTriangle1.toString());
//        System.out.println(myTriangle.getPerimeter());
//        System.out.println(myTriangle.getType());



//        MyComplex myComplex = new MyComplex(0.0,3.0);
//        //System.out.println(myComplex.toString());
//        //MyComplex myComplex1 = new MyComplex(1.0,3.0);
//        //System.out.println(myComplex.equals(myComplex1));
//        //myComplex.setValue(3,-6);
//        //System.out.println(myComplex.magnitude());
//        //System.out.println(myComplex.argument());
//        MyComplex right = new MyComplex(8.0,-4.0);
//        System.out.println(myComplex.isReal());
//        //System.out.println(myComplex.toString());
//        myComplex.divide(right);
//        System.out.println(myComplex.toString());

//        int degree = 3;
//        double[] coeffs1 = new double[degree + 1];
//        for (int i = 0; i < coeffs1.length; i++) {
//            coeffs1[i] = i;
//        }
//        double[] coeffs2 = new double[degree + 1];
//        for (int i = 0; i < coeffs2.length; i++) {
//            coeffs2[i] = i;
//        }

//        double[] coeffs1 = {-10, 8 , 4, 2};
//        double[] coeffs2 = {1, 2,-9,4,-3};
//        MyPolynomial myPolynomial = new MyPolynomial(coeffs1);
//        MyPolynomial myPolynomial1 = new MyPolynomial(coeffs2);
//        System.out.println(myPolynomial.getDegree());
//        System.out.println(myPolynomial.toString());
//        System.out.println(myPolynomial1.toString());
////        System.out.println(myPolynomial.add(myPolynomial1));
//        System.out.println(myPolynomial.multiply(myPolynomial1));

//        Ball ball = new Ball(3.0f, -3.0f, 1, 4, 0);
//
//        Container container = new Container(0,0,10,10);
//
//        for ( int step = 0; step < 10; step++) {
//            System.out.println(container.collidesWith(ball));
//            System.out.println(ball);
//            ball.move();
//        }
    }
}
