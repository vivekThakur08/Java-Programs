public class SumOfDigit {
   static int sum(int num){
        if(num>=0 && num<=9) {
            return num;
        }
        return (num % 10)+ sum(num/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(23456));
    }
}
