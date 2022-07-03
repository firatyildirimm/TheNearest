import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TheNearest {

    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};


        System.out.println("Enter a number...");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int min = 0;
        int max = 0;
        Arrays.sort(list);

            for(int i=0;i< list.length;i++){
                if(list[i]<value){
                min = list[i];
                }
                if(list[i]>value){
                    max = list[i];
                    break;
                }
            }

        System.out.println("The nearest number smaller than the entered number " + min);
        System.out.println("The nearest number bigger than the entered number" + max);

    }
}




