package odevler.donguler;

import java.util.Scanner;

public class YildizElmasProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = scan.nextInt();

        int i, j, space = 1;

        space = n - 1;
        for (j = 1; j<= n; j++)
        {
                for (i = 1; i<= space; i++)
                {
                    System.out.print(" ");
                }
            space--;
                for (i = 1; i <= 2 * j - 1; i++)
                {
                    System.out.print("*");
                }
            System.out.println("");
        }


        space = 1;
        for (j = 1; j<= n - 1; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}





