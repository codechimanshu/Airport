package Basics.PracticeQuestions;

public class MatrixAddition {
    public static void main(String[] args) {
        int [][] m1 ={{1,2,3},{4,5,6}};
        int [][] m2 ={{4,5,6},{1,2,3}};
        int [][] result ={{0,0,0},{0,0,0}};

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                result[i][j]=m1[i][j] + m2[i][j];
            }
        }
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
