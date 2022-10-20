package hu.petrik.matrixoop;

public class NegyzetesMatrix extends Matrix {
    public NegyzetesMatrix(int sor) {
        super(sor, sor);
    }

    public int getFoatloElemekOsszeg() {
        int sum =0;
        int sorcount =0;
        int oszlopcount =0;
        for (int i = 0; i < this.getM().length; i++) {
            for (int j = 0; j < this.getM()[i].length; j++) {
                if (i == j){
                    sum = sum + this.getM()[i][j];
                }
            }
        }
        return sum;
    }
}
