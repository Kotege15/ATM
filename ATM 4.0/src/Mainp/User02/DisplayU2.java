package Mainp.User02;

import Mainp.Main;
import data.user;
import data.user2;
import data.user4;

import java.util.Scanner;

public class DisplayU2 {

    static int userinputnumber1;

    static int userinputnumber2;

    public static void screen1(){

        user2 user2data = new user2();

        System.out.println ( );

        System.out.println ( );

        System.out.println ("Welcome " + user2.fullname );

        System.out.println ( );

        menu();

    }

    public static void user2info(){

        user2 data = new user2();

        System.out.println ( );

        System.out.println (" First Name : " + user2.firstname );
        System.out.println (" Second Name : " + user2.lastname );
        System.out.println (" Age : " + user2.age );

        System.out.println ( );

        System.out.println (" Current account balance : " + user2.accountbalence + '$');

        System.out.println ( );



    }

    private static void userversioninfo ( ){

        System.out.println ( );

        System.out.println ("First Name : " + data.user2.firstname );
        System.out.println ("Last Name : " + data.user2.lastname );
        System.out.println ("Age : " + data.user2.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.user2.accountbalence + '$');

        System.out.println ( );

        smenu();

        //notification system
        /*
        if ( data.user2.t1 == true ){
            data.user2.t1 = false;

            System.out.println ( );

            System.out.println ( data.user.fullname + " has transferred " + com.company.user01.userinputnumber2 + '$' + ' ' + "to your account" );
        }

        else if ( data.user2.t4 == true){
            data.user2.t4 = false;

            System.out.println ( );

            System.out.println ( data.user4.fullname + " has transferred " + com.company.user04.userinputnumber2 + '$' + ' ' + "to your account" );
        }
        */

        System.out.println ( );


    }

    private static void menu() {
        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.println (" Select any one of the following option : (1 / 2)");
        System.out.println ("1). deposit funds ");
        System.out.println ("2). withdraw funds ");
        System.out.println ("3). Transfer funds " );
        System.out.println ("4). User INFO");
        System.out.println ("5). Exit program");

        int useroption = reader.nextInt ();

        switch (useroption) {
            case 1 -> deposit();
            case 2 -> withdraw();
            case 3 -> transfer();
            case 4 -> userversioninfo();
            case 5 -> Main.page();
            default -> menu();
        }
    }

// the method allows the user deposit funds

    private static void deposit () {
        user2 user = new user2();

        Main main = new Main();

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        user2.accountbalence += userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + user2.accountbalence + '$');

        System.out.println ( );

        smenu();
    }


    // this method allows the user withdraw funds from their account

    private static void withdraw ( ) {
        user2 user = new user2();

        Main main = new Main();

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        user2.accountbalence -= userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + user2.accountbalence + '$');

        System.out.println ( );

        smenu();
    }

    private static void transfer ( ){

        Scanner reader = new Scanner(System.in);

        System.out.println ();

        System.out.print (" Enter user account number : ");

        int userinput = reader.nextInt ();

        System.out.println ( );



        if (userinput == data.user.accountnumber && user.t2 == false ){
            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.user.accountbalence = data.user.accountbalence + userinput1;

            data.user2.accountbalence = ( ( data.user2.accountbalence ) - (userinput1));

            userinputnumber1 = userinput1;

            System.out.println ( );

            data.user.t2 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.user2.accountbalence )+ '$');
        }

        else if (userinput == data.user4.accountnumber  && !user4.t2){
            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.user4.accountbalence = data.user4.accountbalence + userinput1;

            data.user.accountbalence = ( ( data.user.accountbalence ) - (userinput1));

            userinputnumber2 = userinput1;

            System.out.println ( );

            data.user4.t2 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.user2.accountbalence )+ '$');
        }

        else if (userinput != data.user.accountnumber || userinput != data.user4.accountnumber ){
            System.out.println ( );
            System.out.println (" ERROR , ERROR , INVALID ACCOUNT NUMBER");
            System.out.println ( );
        }

        else if (user.t2 || user4.t2){
            System.out.println ( );
            System.out.println (" ERROR , ERROR , you cannot transfer to two user's or more until and unless the first user's knows that you have transferred");
            System.out.println ( );
        }

        System.out.println ( );

        smenu();
    }

    private static void smenu() {
        Scanner reader = new Scanner(System.in);

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2). Exit this program ");

        int userdepositmenuoption = reader.nextInt ();

        switch ( userdepositmenuoption ) {
            case 1:
                menu();
                break;
            case 2:
                Main.page();
                break;
            default:
                smenu();
                break;
        }
    }

}
