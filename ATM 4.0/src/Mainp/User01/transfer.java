package Mainp.User01;

import Mainp.Main;
import data.user2;
import data.user4;

import java.util.Scanner;

public class transfer {
    static void Function(){

        Scanner reader = new Scanner(System.in);

        System.out.println ();

        System.out.print (" Enter user account number : ");

        int userinput = reader.nextInt ();

        System.out.println ( );

        int bamount;

        int intbamountt;


        if (userinput == data.user2.accountnumber && !user2.t1 ){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.user2.accountbalence = data.user2.accountbalence + userinput1;

            data.user.accountbalence = ( ( data.user.accountbalence ) - (userinput1));

           // userinputnumber1 = userinput1;

            System.out.println ( );

            data.user2.t1 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.user.accountbalence ) + '$');
        }

        else if ( data.user4.accountnumber == userinput && !user4.t1 ){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.user4.accountbalence = data.user4.accountbalence + userinput1;

            data.user.accountbalence = ( ( data.user.accountbalence ) - (userinput1));

            //userinputnumber2 = userinput1;

            System.out.println ( );

            data.user4.t1 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.user.accountbalence ) + '$');
        }

        else {
            System.out.println ( );
            System.out.println (" ERROR , ERROR , INVALID ACCOUNT NUMBER");
            System.out.println ( );
        }

        System.out.println ( );

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2). Exit this program ");

        int userdepositmenuoption = reader.nextInt ();

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
