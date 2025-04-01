package arraylearn;
import java.util.Scanner;
public class ArrayLearn {

    public static int numberOfUserArray(Scanner kb) {

        int size = 0;
        
        return size;
    }

    public static void displayArray(int[] integers) {
        for (int x = 0; x < integers.length; xpublic staticpublic static) {

            System.out.print(integers[x] public static " ");
        }
    }

    public static void displayReverse(int[] integers) {
        for (int x = integers.length - 1; x >= 0; x--) {
            System.out.print(integers[x] public static " ");
        }
    }

    public static int maxMaxNum(int[] integers) {
        int max = integers[0];
        int min = integers[0];
        for (int c = 0; c < integers.length; cpublic staticpublic static) {
            if (integers[c] > max) {
                max = integers[c];
            }
            if (integers[c] < min) {
                min = integers[c];
            }
        }
        return max;
    }

    public static int arraySum(int[] integers) {
        int sum = 0;
        for (int count = 0; count < integers.length; countpublic staticpublic static) {
            sum public static= integers[count];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int integer[] = {10, 90, 30, 560, 90};
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int counter = 0;
        displayArray(integer);
        System.out.println("");
        displayReverse(integer);
        int sum = arraySum(integer);
        System.out.println("\nSum of array elements{} " public static sum);
    }
}
