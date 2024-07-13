import java.util.Scanner;

public class TestA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size");
        int size= sc.nextInt();
        int ids[]=new int[size];
        System.out.println("please enter"+size+"ids");
        for (int i = 0; i < size; i++) {
            ids[i]= sc.nextInt();
        }
        System.out.println("<<<<<<<<<Records>>>>>>>>>");
        for(int value:ids){
            System.out.println(value);
        }
    }
}
