package Mainp.User04;

import Mainp.Main;
import data.user;
import data.user2;
import data.user4;

import java.util.Scanner;

public class DisplayU4 {

    static int userinputnumber1;

    static int userinputnumber2;

    public static void screen1(){

        System.out.println ( );
        System.out.println ("welcome " +( user4.fullname ));

        System.out.println ( );

        userversioninfo();

        menu();

    }

    public static void userinfo(){

        System.out.println ( );

        System.out.println ("First Name : " + user4.firstname);
        System.out.println ("Last Name : " + user4.lastname );
        System.out.println ("Age : " + user4.age);

        System.out.println ( );

        System.out.println ("Current Account Balence : " + user4.accountbalence + '$');

        System.out.println ( );


    }

    private static void userversioninfo ( ){

        System.out.println ( );

        System.out.println ("First Name : " + data.user4.firstname );
        System.out.println ("Last Name : " + data.user4.lastname );
        System.out.println ("Age : " + data.user4.age );

        System.out.println ( );

        System.out.println ("Current Account Balence : " + data.user4.accountbalence + '$');

        //notification system
        /*
        if ( data.user4.t1 == true ){
            data.user4.t1 = false;

            System.out.println ( );

            System.out.println ( data.user.fullname + " has transferred " + com.company.user01.userinputnumber2 + '$' + ' ' + "to your account" );
        }

        else if ( data.user4.t2 == true){
            data.user4.t2 = false;

            System.out.println ( );

            System.out.println ( data.user2.fullname + " has transferred " + com.company.user02.userinputnumber2 + '$' + ' ' + "to your account" );
        }
        */
        System.out.println ( );


    }

    protected static void menu(){
        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.println(" Select any one of the following option : (1 / 2 / 3)");
        System.out.println("1). deposit funds ");
        System.out.println("2). withdraw funds ");
        System.out.println("3). Transfer funds " );
        System.out.println("4). Exit program");

        int useroption = reader.nextInt ();

        switch ( useroption ) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                transfer();
                break;
            case 4:
                Main.page();
                break;
            default:
                break;
        }
    }

    private static void deposit(){
        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        user4.accountbalence += userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + user4.accountbalence + '$');

        System.out.println ( );

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2).Exit this program ");

        int userdepositmenuoption = reader.nextInt ();

        switch ( userdepositmenuoption ) {
            case 1:
                menu();
                break;
            case 2:
                Main.page();
                break;
            default:
                break;
        }
    }

    private static void withdraw(){

        Scanner reader = new Scanner(System.in);

        System.out.println ( );

        System.out.print("Amount : ");

        long userdeposit = reader.nextLong ();

        user4.accountbalence -= userdeposit;

        System.out.println ( );

        System.out.println ("Current balence : " + user4.accountbalence + '$');

        System.out.println ( );

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
                break;
        }
    }


    private static void transfer(){

        Scanner reader = new Scanner(System.in);

        System.out.println ();

        System.out.print (" Enter user account number : ");

        int userinput = reader.nextInt ();

        System.out.println ( );


        if (userinput == data.user.accountnumber && user.t4 == false){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.user.accountbalence = data.user.accountbalence + userinput1;

            data.user4.accountbalence = ( ( data.user4.accountbalence ) - (userinput1));

            userinputnumber1 = userinput1;

            System.out.println ( );

            data.user.t4 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.user.accountbalence )+ '$');
        }


        else if (userinput == data.user2.accountnumber && user2.t4 == false){

            System.out.print (" Enter Amount : ");

            int userinput1 = reader.nextInt ();

            data.user2.accountbalence = data.user2.accountbalence + userinput1;

            data.user4.accountbalence = ( ( data.user4.accountbalence ) - (userinput1));

            userinputnumber2 = userinput1;

            System.out.println ( );

            data.user2.t4 = true;

            System.out.println (" Successfully transferred ");

            System.out.println ( );

            System.out.println ( "Current Account Balence : " + ( data.user.accountbalence )+ '$');
        }

        else if (userinput != data.user2.accountnumber || userinput != data.user.accountnumber ){
            System.out.println ( );
            System.out.println (" ERROR , ERROR , INVALID ACCOUNT NUMBER");
            System.out.println ( );
        }

        else if (user.t4 == true || user2.t4 == true){
            System.out.println ( );
            System.out.println (" ERROR , ERROR , you cannot transfer to tow user's or more until and unless the first user's knows that you have transferred");
            System.out.println ( );
        }

        System.out.println ( );

        System.out.println ("select anyone of the following : (1 / 2)");
        System.out.println ("1).Back to the menu");
        System.out.println ("2). Exit this program ");

        int userdepositmenuoption = reader.nextInt ();

        switch ( userdepositmenuoption ) {
            case 1:
                menu ( );
                break;
            case 2:
                Main.page ( );
                break;
            default:
                break;
        }
    }



}
