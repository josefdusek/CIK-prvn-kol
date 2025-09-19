public class Main {
    public static void main(String[] args) {
        int[][] Matrix1 = {{1,2,3},{0,1,4},{5,6,0}};
        int[][] Matrix2 = {{7,8,9,10},{2,3,4,5},{1,0,-1,2}};

        Matrix matr = new Matrix(); matr.setMatrix(Matrix1);
        Matrix matr2 = new Matrix(); matr2.setMatrix(Matrix2);

        IMatrix sum = matr.add(matr2);
        IMatrix a = matr.times(matr2);
        IMatrix b = matr.transpose();

        Matrix.printMatrix(matr);
        Matrix.printMatrix(matr2);
        Matrix.printMatrix(sum);
        Matrix.printMatrix(a);
        Matrix.printMatrix(b);

        System.out.println("ctvercova: " + matr.isSquare());
    }

}