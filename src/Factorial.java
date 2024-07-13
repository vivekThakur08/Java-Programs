public class Factorial {
     static int factorialN(int n){
         if(n==0 || n==1){
             return 1;
         }
         return n* factorialN(n-1);

     }

    public static void main(String[] args) {
        System.out.println(factorialN(6));
    }
}
