public class Matrica {
    public static void main(String[] args) {
        int[][] matrixA = {
                {10, 20,5},
                {30, 40,1}};
        int[][] matrixB = {
                {2, 4,5},
                {1, 6,2}};

        if (matrixA.length == 0 || matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length){
            System.out.println("Matrix is bad");
            return;
        }

        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
        for (int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixA[0].length;j++){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }System.out.print('\n');
        }


        int sumMin=0,sumMax=0;
        for (int i = 0;i < matrixC[0].length; i++) {
            if (i % 2 == 0) {
                int localMax = matrixC[0][i];
                for (int[] line : matrixC) {
                    if (line[i] > localMax) {
                        localMax = line[i];
                    }
                }
                sumMax += localMax;
            }
            if (i % 2 == 1) {
                int localMin = matrixC[0][i];
                for (int[] line : matrixC) {
                    if (line[i] < localMin) {
                        localMin = line[i];
                    }
                }
                sumMin += localMin;
            }
            System.out.println("------------------");
            System.out.println("SumMax = " + sumMax);
            System.out.println("SumMin = " + sumMin);
        }

    }
}