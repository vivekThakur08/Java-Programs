import java.util.Scanner;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        String[] names = {"ram", "shyam", "mohan", "geeta", "ramesh"};
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the name:-");
        String input = sc.nextLine();
        int i = 0;
        boolean flag = false;
        while (i < names.length) {
            if (input.equals(names[i])) {
                System.out.println("Valid name");
                flag = true;
                break;

            }
            i++;
        }
        if(!flag){
            System.out.println("Invalid name");
        }


    }
}

   /*  for(int i=0;i<names.length;i++)
        {
            if(input.equals(names[i]))
        {
            flag=true;
            break;
        }
        }
      if(flag==true)
        {
            sout("name found")
        }
      else
                {
                    sout(not found)
                }

    */