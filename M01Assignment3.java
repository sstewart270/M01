import java.util.Scanner; 

public class M01Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creation of two 3 by 3 arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        // prompt for and fill m1
        System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                m1[i][j] = input.nextInt();
            }
        }

        // rompt for and fill m2
        System.out.print("Enter m2 (a 3 by 3 matrix) row by row: ");
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                m2[i][j] = input.nextInt();
            }
        }
        input.close();

        // compare and display results
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    /** return true if the two 2d arrays havr the same dimensions and contents */
    public static boolean equals(int[][] m1, int[][] m2) {
        // dimensions check
        if (m1.length != m2.length) return false; 
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) return false;
            // element check
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}