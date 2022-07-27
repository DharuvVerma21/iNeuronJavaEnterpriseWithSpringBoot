// Write a program to print INEURON using pattern programming logic.

import java.util.Scanner;
public class INeuron{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ODD number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i=1; i<=n; i++){
            // For I
            for (int j=1; j<=n; j++){
                if (i == 1 || i == n || j == (n+1)/2){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.print("  ");
            // For N
            for (int j=1; j<=n; j++){
                if (j == 1 || j == n || j == i){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.print("  ");
            // For E
            for (int j=1; j<=n; j++){
                if (i == 1 || i == n || j == 1 || (i == (n+1)/2 && j <= (n+1)/2)){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.print("  ");
            // For U
            for (int j=1; j<=n; j++){
                if ((j == 1 && i != n) || (j == n && i != n) || (i == n && j != 1 && j != n)){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.print("  ");
            // For R
            for (int j=1; j<=n; j++){
                if (j == 1 || ((i == 1 || i == (n+1)/2) && j != n) || (j == n && i > 1 && i < (n+1)/2) || (i > (n+1)/2 && j == (2*(i - (n+1)/2) + 1))){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.print("  ");
            // For O
            for (int j=1; j<=n; j++){
                if (((j == 1 || j == n) && i != 1 && i != n) || ((i == 1 || i == n) && j != 1 && j != n)){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.print("  ");
            // For N
            for (int j=1; j<=n; j++){
                if (j == 1 || j == n || i == j){
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
