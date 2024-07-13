public class MaxElementOfArray {
    static int findMax(int nums[], int start ,int end){
        if(start == end)
            return nums[start];
        int mid=(start+end)/2;
        int max1 = findMax(nums,start,mid);
        int max2 = findMax(nums,mid+1,end);
        return (max1  > max2) ? max1 : max2;
    }
     static int findMin(int nums[], int start ,int end){
        if(start == end)
            return nums[start];
        int mid=(start+end)/2;
        int min1 = findMin(nums,start,mid);
        int min2 = findMin(nums,mid+1,end);
        return (min1  < min2) ? min1 : min2;
    }

    public static void main(String[] args) {
        int [] arr ={3,5,2,6,3,6,7,8,5,4,6,8,5,3,5,3,4,3,3};
        int end=arr.length-1;
        System.out.println("Greatest of them is : " +findMax(arr,0,end));
        System.out.println("Lowest of them is : "+ findMin(arr,0,end));
    }
}
