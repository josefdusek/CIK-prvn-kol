public class Matrix implements IMatrix {
    private int[][] matrix;

    public void setMatrix(int[][] data) {
        this.matrix = data;
    }
    public static void printMatrix(IMatrix M) {
        int rows = M.getRows();
        int cols = M.getColumns();
        for (int i = 0; i < rows; i++) {
            System.out.print("[ ");
            for (int j = 0; j < cols; j++) {
                int v = (int) Math.round(M.get(i, j));
                System.out.print(v);
                if (j + 1 < cols) System.out.print(" ");
            }
            System.out.println(" ]");
        }
        System.out.println();
    }


    @Override
    public IMatrix times(IMatrix n) {
        int a = getRows();
        int b = getColumns();
        int c = n.getColumns();

        int[][] out = new int[a][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                double sum = 0;
                for (int k = 0; k < b; k++) {
                    sum = sum + get(i, k) * n.get(k, j);
                }
                out[i][j] = (int) Math.round(sum);
            }
        }
        Matrix m = new Matrix();
        m.setMatrix(out);
        return m;
    }

    @Override
    public IMatrix times(int scalar) {
        int a = getRows();
        int c = getColumns();

        int[][] out = new int[a][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                out[i][j] = (int) Math.round(get(i, j) * scalar);
            }
        }
        Matrix m = new Matrix();
        m.setMatrix(out);
        return m;
    }

    @Override
    public IMatrix add(IMatrix other) {
        int r = getRows();
        int c = getColumns();
        int[][] out = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                out[i][j] = (int) Math.round(get(i, j) + other.get(i, j));
            }
        }
        Matrix m = new Matrix();
        m.setMatrix(out);
        return m;
    }

    @Override
    public IMatrix transpose() {
        int r = getRows();
        int c = getColumns();
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = (int) Math.round(get(i, j));
            }
        }
        Matrix m = new Matrix();
        m.setMatrix(t);
        return m;
    }

    @Override
    public boolean isSquare() {
        int a = getRows();
        int b = getColumns();
        if (a == b){
            return true;
        }
        return false;
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double get(int n, int m) {
        return matrix[n][m];
    }
}