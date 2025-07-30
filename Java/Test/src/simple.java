import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        arr[0] = 10;
        arr[1] = scan.nextInt();
        System.out.println(arr[0]+" ,"+arr[1]);

        
    }
}
