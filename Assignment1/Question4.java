/* Write a program to print






    *            *
    **          **
    ***        ***
    ****      ****
    *****    *****
    ******  ******
    **************
    **************
 */

import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if ((i-j) >= (n/2 - 1) || (i+j) >= (n + n/2)){
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
