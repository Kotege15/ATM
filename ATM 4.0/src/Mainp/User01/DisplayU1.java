package Mainp.User01;

import Mainp.Main;
import data.user;

import java.util.Scanner;

public class DisplayU1 {

    static int userinputnumber1;

    static int userinputnumber2;

    public static void screen1(){

        System.out.println ( );
        System.out.println ("welcome " +( data.user.fullname ));

        System.out.println ( );

        menu();

    }

    public static void userinfo(){

        System.out.println ( );

        System.out.println ("First Name : " + data.user.firstname );
        System.out.println ("Last Name : " + data.user.lastname );
        System.out.println ("Age : " + data.user.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.user.accountbalence + '$');

        System.out.println ( );


    }

    private static void userversioninfo ( ){
        System.out.println ( );

        System.out.println ("First Name : " + data.user.firstname );
        System.out.println ("Last Name : " + data.user.lastname );
        System.out.println ("Age : " + data.user.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.user.accountbalence );

        System.out.println ( );

        menu();

        // notification system
        /*
        if ( user.t2 ){
            data.user.t2 = false;

            System.out.println ( );

            System.out.println ( data.user2.fullname + " has transferred " + com.company.user02.userinputnumber1 + '$' + ' ' + "to your account" );
        }

        else if ( user.t4 ){
            data.user.t4 = false;

            System.out.println ( );

            System.out.println ( data.user4.fullname + " has transferred " + com.company.user04.userinputnumber1 + '$' + ' ' + "to your account" );
        }
        */

        System.out.println ( );


    }

    // this is the menu after the user log's in

    static void menu() {
        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.println(" Select any one of the following option : (1 / 2 / 3)");
        System.out.println("1). Deposit funds ");
        System.out.println("2). Withdraw funds ");
        System.out.println("3). Transfer funds " );
        System.out.println("4). View User Info");
        System.out.println("5). View Account Balance");
        System.out.println("6). Log out");

        int useroption = reader.nextInt ();

        switch ( useroption ) {
            case 1:
                deposit.Function();
                break;
            case 2:
                withdraw.Function();
                break;
            case 3:
                transfer.Function();
                break;
            case 4:
                userversioninfo();
                break;
            case 5:
                System.out.println ("Current Account Balence : " + user.accountbalence + '$' );
                menu();
                break;
            case 6:
                Main.page();
                break;
            default:
                break;
        }
    }


  }




