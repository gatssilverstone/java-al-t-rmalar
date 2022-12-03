import java.util.Random;
import java.util.Scanner;

public class MineField {
    int satir;
    int sutun;
    int MineNumber;

    String[][] MineLocations;
    String[][] GameMap;


    MineField(int satir, int sutun){
        this.satir=satir;
        this.sutun=sutun;
        this.GameMap=new String[sutun][satir];
        this.MineLocations=new String[sutun][satir];
        this.MineNumber=(satir*sutun)/4;

    }

    void placeMine(){
        Random rnd=new Random();

        for (int i=0;i<MineNumber;i++){
            int satirRand= rnd.nextInt(satir);
            int sutunRand= rnd.nextInt(sutun);
            if (MineLocations[sutunRand][satirRand]!="*"){
                MineLocations[sutunRand][satirRand]="*";
            }
        }
      for (int a=0;a<sutun;a++){
          for (int b=0;b<satir;b++){
            if (MineLocations[a][b]!="*")
                MineLocations[a][b]=" ";

          }
      }
    }

    void placeField(){
        for(int i=0;i<this.sutun;i++){
            for (int j=0;j<this.satir;j++){
                this.GameMap[i][j]="-";
            }

        }

    }

    void printGameMap(){
        for(int i=0;i<this.sutun;i++){
            for (int j=0;j<this.satir;j++){
                System.out.print(this.GameMap[i][j]);
            }
            System.out.println();
        }

    }

    void printMineLocations(){
        for(int i=0;i<this.sutun;i++){
            for (int j=0;j<this.satir;j++){
                System.out.print(this.MineLocations[i][j]);
            }
            System.out.println();
        }
    }



    void runrunrun(){
        int gameProgress=(satir*sutun)-MineNumber;
        Scanner scan=new Scanner(System.in);
        int enteredColumn, enteredLine;
        boolean isWin=true;
        placeMine();
        placeField();
        printGameMap();
       printMineLocations();

        while (gameProgress>0){
            if (isWin==true){

                System.out.println("satır gir ulan köpke: ");
                enteredColumn= scan.nextInt();
                System.out.println("aferin, sütun gir şimdi bakiyim: ");
                enteredLine= scan.nextInt();

            if ((enteredColumn>=0&&enteredColumn<sutun)&&(enteredLine>=0&&enteredLine<satir)) {
                if (MineLocations[enteredColumn][enteredLine] == "*") {
                    isWin = false;
                    break;
                } else {
                int sayac=0;
                int minSatir=enteredColumn-1, maxSatir=enteredColumn+1;
                int minSutun=enteredLine-1,maxSutun=enteredLine+1;

                if (enteredColumn==0){
                   minSatir++;
                }
                if (enteredColumn==satir-1){
                    maxSatir--;
                }
                if (enteredLine==0){
                    minSutun++;

                }
                if (enteredLine==sutun-1){
                    maxSutun--;
                }

                    for (int i=minSatir;i<=maxSatir;i++){
                        for (int j=minSutun;j<=maxSutun;j++){
                            if (MineLocations[i][j]=="*")
                                sayac++;

                        }

                    }


                    String sayacToString=String.valueOf(sayac);


                    GameMap[enteredColumn][enteredLine] = sayacToString;
                    printGameMap();
                    gameProgress--;
                }

            }
            else
                System.out.println("kanka napıyon olm geçerli araklıklarda girsene");
            }
       }

        if (isWin==false){
            System.out.println("AHAHAHAHHAHAHAHAH MAYINA BASTIN MAAAAAAALLLLLL");
        }
        else
            System.out.println("helal lan kazandın");


    }


}
