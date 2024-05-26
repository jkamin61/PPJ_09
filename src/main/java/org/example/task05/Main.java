package org.example.task05;

public class Main {
    public static void main(String[] args) {
        Cplx cplx1 = new Cplx(1, 2);
        Cplx cplx2 = new Cplx(3, 4);
        cplx1.add(cplx2);
        cplx1.show();
        cplx1.sub(cplx2);
        cplx1.show();
        cplx1.mul(cplx2);
        cplx1.show();
        cplx1.inc();
        cplx1.show();
    }
}
