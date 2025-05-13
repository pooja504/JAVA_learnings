import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] rvarr = new int[10];
        int j = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 20; i < 30; i++) {
            arr[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 10; i++) {
            arr[i] *= arr[i];
        }
        System.out.println(Arrays.toString(arr));
        j = 0;
        for (int i = 9; i >= 0; i--) {
            rvarr[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(rvarr));

        boolean flag=false;

        System.out.println("enter a number:");
        int a = sc.nextInt();
        int k=0;
        for (int var : arr) {
            if (var == a) {
                flag=true;

                break;

            }
            k++;

        }
        if (flag){
            System.out.println("element found" + "ith the "+k+"th element");
        }else {
            System.out.println("element not found");
        }
    }
}
