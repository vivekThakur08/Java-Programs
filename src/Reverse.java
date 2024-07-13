import java.util.*;
public class Reverse {
  /** public static void main(String[] args) {
        int a[] ={1,2,3,4,7,9,10};
        int b[]=new int[a.length];
        int j=0;
        for (int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(b));
    }
}
*/

    public static void main(String[] args) {
        int arr []={2,3,4,6,8,3};
        int rev []=new int[ arr.length];
        int j=0;
        for (int i= arr.length -1; i >=0 ; i--) {
             rev[j]=arr[i];
            j++;

        }

        System.out.println(Arrays.toString(rev));
    }
}