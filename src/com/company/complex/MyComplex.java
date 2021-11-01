package com.company.complex;

import com.company.ball.Container;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex () {

    }

    public MyComplex (double real, double imag ) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue (double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString () {
        if ( this.imag < 0.0 )
            return "(" + real + " - " + Math.abs(imag) + "i)";
        else
            return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        if ( Math.abs(imag - 0.0) <= 0.00001)
            return true;
        else
            return false;
    }

    public boolean isImaginary() {
        if ( Math.abs(imag - 0.0) <= 0.00001)
            return false;
        else
            return true;
    }

    public boolean equals (double real, double imag) {
        boolean checkReal = Math.abs((this.real - real)) <= 0.00001;
        boolean checkImag = Math.abs((this.imag - imag)) <= 0.00001;
        return  (checkReal && checkImag);
    }

    public boolean equals (MyComplex another) {
        boolean checkReal = Math.abs((this.real - another.real)) <= 0.00001;
        boolean checkImag = Math.abs((this.imag - another.imag)) <= 0.00001;
        return (checkReal && checkImag);
    }

    public double magnitude() {
        return Math.sqrt( Math.pow(real, 2) + Math.pow(imag,2));
    }


    public double argument() {
        if ( this.real > 0.0)
            return Math.atan(imag/real);
        else {
            if( real < 0.0 && imag > 0.0 )
                return Math.PI + Math.atan(imag/real);
            else
                return Math.PI - Math.atan(imag/real);
        }
    }

    public MyComplex add ( MyComplex right ){
        setValue((this.real + right.real),(this.imag + right.imag));
        return this;
    }

    public MyComplex addNew (MyComplex right) {
        return new MyComplex((this.real + right.real),(this.imag + right.imag));
    }

    public MyComplex substractNew (MyComplex right) {
        return new MyComplex((this.real - right.real),(this.imag - right.imag));
    }

    public MyComplex substract ( MyComplex right ){
        setValue((this.real - right.real),(this.imag - right.imag));
        return this;
    }

    public MyComplex multiply (MyComplex right ) {
        setValue( (this.real * right.real - this.imag* right.imag), (this.imag*right.real + this.real*right.imag) );
        return this;
    }

    public MyComplex divide (MyComplex right ) {
        double real = (this.real*right.real + this.imag* right.imag) / (right.real* right.real + right.imag* right.imag);
        double imag = (this.imag*right.real - this.real* right.imag) / (right.real* right.real + right.imag* right.imag);
        setValue(real,imag);
        return this;
    }

    public MyComplex conjugate () {
        return new MyComplex(this.real, -this.imag);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // первый шаг

        if (!(obj instanceof MyComplex)) return false; // второй шаг

        if(obj == null) return false;

        MyComplex myComplex = (MyComplex) obj; // третий шаг

        return this.real == myComplex.real && this.imag == myComplex.imag; // вывод
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + (int)(Double.doubleToLongBits(real) ^ (Double.doubleToLongBits(real) >>> 32));
        result = 31*result + (int)(Double.doubleToLongBits(imag) ^ (Double.doubleToLongBits(imag) >>> 32));

        return result;
    }

}

