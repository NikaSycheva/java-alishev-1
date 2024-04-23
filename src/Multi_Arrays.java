public class Multi_Arrays {
    public static void main(String[] args) {
        int[] number = {1,2,3};

        int[][] matrice = {{1,3,82},
                           {2,7,0,15,77},
                           {14, 2}};

        System.out.println(matrice[2][0]);//14
        System.out.println(matrice[0][1]);//3
        System.out.println(matrice[1][4]);//77

        System.out.println("======================");

        //String [][] stringArray = new String[2][3];
        String [][] stringArray2 = {{"привет", "пока", "джава"},
                                    {"hi", "good", "java", "okey"}};

        System.out.println(stringArray2[0][2]);
        System.out.println(stringArray2[1][3]);//okey
        System.out.println(stringArray2.length);//почему 2?

        //перебор для двумерного массива:
        // вложенный цикл, где внешний цикл идет по строчкам, а внутренний по столбцам)
        for(int i=0; i<matrice.length; i++){
            for(int j=0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }



    }
}
