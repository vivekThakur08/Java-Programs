public class Exponent {
    static int pow(int base, int exponent){
        if (base == 0){
            return 0;
        }
        if(exponent==0){
            return 1;
        }
        return base*pow(base,exponent-1);
    }

    public static void main(String[] args) {
        System.out.println(pow(3,4));
    }
}
