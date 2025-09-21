public class Main {
    public static void main(String[] args) {
        int[][] Matrix1 = {
                {4, 3, 2},
                {1, 2, 7},
                {3, 2, 4}
        };
        int[][] Matrix2 = {
                {2, 1, 3, 0},
                {9, 10, 3, 2},
                {0, 3, 8, 4}
        };

        MatrixReal matrix = new MatrixReal();
        matrix.setMatrix(Matrix1);
        MatrixReal matrix2 = new MatrixReal();
        matrix2.setMatrix(Matrix2);

        
        System.out.println("Matrix times: ");
        MatrixReal.print(matrix.times(matrix2));
        
        System.out.println("Matrix times Scalar: ");
        MatrixReal.print(matrix.times(5));
        
        System.out.println("Matrix add:");
        MatrixReal.print(matrix.add(matrix2));
        
        System.out.println("Matrix add:");
        MatrixReal.print(matrix.add(matrix2));
        
        System.out.println("Matrix transpose:");
        MatrixReal.print(matrix.transpose());
        
        System.out.println("ctvercova: " + matrix.isSquare());
        System.out.println("Get Trace: " + matrix.getTrace());
    }

