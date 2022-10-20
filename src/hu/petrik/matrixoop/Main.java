package hu.petrik.matrixoop;

public class Main {

    public static void main(String[] args) {
        Matrix m1 = new Matrix(5,7);
        Matrix m2 = new Matrix(2,3);
        System.out.println(m2);
        System.out.println();
        System.out.println(m2.getElemekOsszege());
        System.out.println();
        System.out.println(m2.getPozitivElemekSzama());
        System.out.println();
        System.out.println(m2.getLegnagyobbElem());
        System.out.println();
        System.out.println(m2.getElsoPozitivElem()[0]+" "+m2.getElsoPozitivElem()[1]);
        System.out.println();
        System.out.println(m2.sorOsszeg(1));
        System.out.println();
        System.out.println(m1);
        System.out.println();
        System.out.println(m1.maxElemOszlop(4));
        System.out.println();
        System.out.println();
        NegyzetesMatrix nm = new NegyzetesMatrix(5);
        System.out.println(nm);
        System.out.println();
        System.out.println(nm.getFoatloElemekOsszeg());
    }
}
