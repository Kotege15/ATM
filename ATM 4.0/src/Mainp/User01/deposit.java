package Mainp.User01;

import Mainp.Main;
//import data.user;

import java.util.Scanner;

public class deposit {

    static void Function() {

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        data.user.accountbalence += userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + data.user.accountbalence + '$' );

        System.out.println ( );

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2). Exit this program ");

        int userdepositmenuoption = reader.nextInt();



        switch ( userdepositmenuoption ) {
            case 1:
                Mainp.User01.DisplayU1.menu();
                break;
            case 2:
                Main.page();
                break;
            default:
                break;
        }
    }

}
