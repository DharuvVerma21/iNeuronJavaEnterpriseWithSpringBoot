/* Write a program to print
    **************
    ******
    *****
    ****
    ***
    **
    *
    **
    ***
    ****
    *****
    ******
    *******
    **************
 */

import java.util.Scanner;
public class Question5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i == 1 || i == n || (i+j) <= (n/2 + 1) || (i-j) >= (n/2 - 1)){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
