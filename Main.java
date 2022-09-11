import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int a = sc.nextInt();
       int array[] = new int[a];
       for(int i=0; i<a; i++){
           System.out.print((i+1)+". Elemanı : ");
           array[i] = sc.nextInt();
       }
        Arrays.sort(array);
        System.out.print("Sıralama : " + Arrays.toString(array));
        sc.close();
    }
}