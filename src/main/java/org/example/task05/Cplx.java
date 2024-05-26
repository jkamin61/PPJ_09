package org.example.task05;

public class Cplx {
    double re;
    double im;

    public Cplx(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void add(Cplx cplx) {
        re += cplx.re;
        im += cplx.im;
    }

    public void sub(Cplx cplx) {
        re -= cplx.re;
        im -= cplx.im;
    }

    public void mul(Cplx cplx) {
        double re = this.re * cplx.re - this.im * cplx.im;
        double im = this.re * cplx.im + this.im * cplx.re;
        this.re = re;
        this.im = im;
    }

    public void inc() {
        re++;
        im++;
    }

    public void show() {
        System.out.println(re + " + " + im + "i");
    }
}
