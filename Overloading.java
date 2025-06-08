public class Overloading {
    public static void main (String[] args){
        System.out.println(add(5,3));
        System.out.println(add(5,3,7));
        System.out.println(add(5,3,2,6));
    }

    static int add (int a, int b){
        return a+b;
    
    }
    static int add (int a, int b, int c){
        return a+b+c;
    }

    static double add (int a, int b, int c ,int d){
        return a+b+c+d;
    }
    
    
}
