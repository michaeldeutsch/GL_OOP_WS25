package einheit_01.wiederholung;

public class AndereArrays {

    int [][][][][][] matrix = new int[3][3][3][][][];

    public static void main(String[] args) {

        int [][] unregel = new int[3][];

        int[] max = {1,2,3};
        int[] susi = {1,2,3, 6, 7};
        int[] susi2 = {1,2};

        unregel[0] = max;
        unregel[1] = susi;
        unregel[2] = susi2;

        for (int i = 0; i < unregel.length; i++){
            for (int j = 0; j < unregel[i].length; j++){
                System.out.print(unregel[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
