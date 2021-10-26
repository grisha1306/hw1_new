package com.company.polynom;


public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree (){
        return coeffs.length;
    }

    @Override
    public String toString() {
        String str ="";
        for (int i = coeffs.length - 1; i >= 0 ; i--) {
            if ( coeffs[i] == 0 ) continue;
            if (i == coeffs.length - 1 )
                str = str + coeffs[i] + "*x^" + i;
            else if ( coeffs[i] >= 0 )
                str = str + " + " + Math.abs(coeffs[i]) + "*x^" + i;
            else
                str = str + " - " + Math.abs(coeffs[i]) + "*x^" + i;
        }
        if (coeffs[0] != 0 )
            str = str.substring(0, str.lastIndexOf("*"));
        else
            str = str.substring(0, str.lastIndexOf("+"));
        return str;
    }

    public double evaluate(double x) {
        double sum = 0;
        for (int i = 0; i < coeffs.length; i++) {
            sum += coeffs[i] * Math.pow(x, i);
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        int sizeNew;
        double[] coeffsNew;
        if (coeffs.length < right.coeffs.length) {
            sizeNew = right.coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < coeffs.length; i++) {
                coeffsNew[i] = coeffs[i] + right.coeffs[i];
            }
            for (int i = coeffs.length; i < right.coeffs.length; i++) {
                coeffsNew[i] = right.coeffs[i];
            }
        } else if (coeffs.length > right.coeffs.length) {
            sizeNew = coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < right.coeffs.length; i++) {
                coeffsNew[i] = coeffs[i] + right.coeffs[i];
            }
            for (int i = right.coeffs.length; i < coeffs.length; i++) {
                coeffsNew[i] = coeffs[i];
            }

        } else {
            sizeNew = coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < coeffsNew.length; i++) {
                coeffsNew[i] = coeffs[i] + right.coeffs[i];
            }
        }
        return new MyPolynomial(coeffsNew);
    }

    public MyPolynomial multiply (MyPolynomial right){
        double[] add = new double[this.coeffs.length + right.coeffs.length - 1];
        for (int i=this.coeffs.length-1;i>=0;i--) {
            for (int j=right.coeffs.length-1;j>=0;j--) {
                add[i+j] += this.coeffs[i] *right.coeffs[j];
            }
        }
        return new MyPolynomial(add);
    }
}