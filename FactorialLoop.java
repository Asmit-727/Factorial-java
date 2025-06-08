import java.util.Scanner;

public class FactorialLoop {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scn.nextInt();
        int arr[]=new int[num];

        for(int i=num; i>0; i--){
            arr[i-1]=i;
        }
        scn.close();
        Fact(arr);
    }

    public static int Fact(int[] arr){
        int result=1;
        for( int n:arr){
            if(n!=0){
                result *=n;
            }
        }
        System.out.println(result);
        return result;
    }
    
}
