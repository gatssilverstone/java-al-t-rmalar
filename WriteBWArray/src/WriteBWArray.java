public class WriteBWArray {
    public static void main(String[] args) {

        String[][] writeB=new String[7][4];

        for (int i=0;  i< writeB.length;i++){
            for (int j=0;j<writeB[i].length;j++){
                if (i==0||j==0||i==6)
                    writeB[i][j]=" * ";
                else if (i==3&&j!=3) {
                    writeB[i][j]=" * ";
                } else if (j==3) {
                    if (i!=3)
                        writeB[i][j]=" * ";
                    else
                        writeB[i][j]="   ";

                } else
                    writeB[i][j]="   ";
            }

        }
        for (String[] row : writeB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
