public class Multidimension {
    public static void main(String[] args) {
        int[][] numb = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };

        int[][] RevArr = new int[numb.length][numb[0].length];
        
        for(int i=numb.length-1; i>=0; i--){
            for(int j=numb[i].length-1; j>=0; j--) {

            RevArr[numb.length-1-i][numb[i].length-1-j] = numb[i][j];
            System.out.print(RevArr[numb.length-1-i][numb[i].length-1-j] + "\t");
            }
            System.out.println("\t");
        }
        }
    }


