public class SumOfElement {
    static int sum(int []arr,int size){
        if(size==0){
            return 0;
        }
        return arr[size-1]+ sum(arr,size-1);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,2,5,7,3,36,7,4,2,4};
        System.out.println(sum(arr, arr.length));
    }
}
