import java.util.Scanner;
public class LearnArray {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int n = console.nextInt();
             int[] array = new int[n];
            if (n>0){
                for (int i = 0; i < n; i++) {
                    array[i] = console.nextInt();
                }
                if (n%2==0) {
                    for (int i = n-1; i >= 0; i--)
                        System.out.println(array[i]);
            }  else {
                    for (int i = 0; i <= n - 1; i++)
                        System.out.println(array[i]);
                }
            }
        }
    }

