import java.util.Scanner;

public class Names {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        String name1, name2, name3;
        int number;

        System.out.println("ENTER FIRST THREE NAMES: ");
        name1 = scan.nextLine();
        name2 = scan.nextLine();
        name3 = scan.nextLine();
        System.out.println("POSSIBLE NAMES ARE:");
        System.out.println("1 - " + name1 + " " + name2);
        System.out.println("2 - " + name1 + " " + name3);
        System.out.println("3 - " + name2 + " " + name1);
        System.out.println("4 - " + name2 + " " + name3);
        System.out.println("5 - " + name3 + " " + name1);
        System.out.println("6 - " + name3 + " " + name2);

        String initial1, initial2;  
        System.out.print("ENTER 1-6 TO SELECT A NAME: ");
        number = scan.nextInt();

        switch ( number ) { 
            case 1: //name1 + name2
                System.out.println("THE INITIALS FOR " + name1 + " " +  name2 + " IS " + (name1.charAt(0)) + (name2.charAt(0)));
                System.out.println("SUGGESTED USERNAME: " + name1.toLowerCase() + "_" + name2.toLowerCase());
                break;

            case 2: //name1 + name3
                System.out.println("THE INITIALS FOR " + name1 + " " +  name3 + " IS " + (name1.charAt(0)) + (name3.charAt(0)));
                System.out.println("SUGGESTED USERNAME: " + name1.toLowerCase() + "_" + name3.toLowerCase());
                break;

            case 3: //name2 + name1
                System.out.println("THE INITIALS FOR " + name2 + " " +  name1 + " IS " + (name2.charAt(0)) + (name1.charAt(0)));
                System.out.println("SUGGESTED USERNAME: " + name2.toLowerCase() + "_" + name1.toLowerCase());
                break;

            case 4: //name2 + name3
                System.out.println("THE INITIALS FOR " + name2 + " " +  name3 + " IS " + (name2.charAt(0)) + (name3.charAt(0)));
                System.out.println("SUGGESTED USERNAME: " + name2.toLowerCase() + "_" + name3.toLowerCase());
                break;

            case 5: //name3 + name1
                System.out.println("THE INITIALS FOR " + name3 + " " +  name1 + " IS " + (name3.charAt(0)) + (name1.charAt(0)));
                System.out.println("SUGGESTED USERNAME: " + name3.toLowerCase() + "_" + name1.toLowerCase());
                break;

            case 6: //name3 + name2
                System.out.println("THE INITIALS FOR" + name3 + " " +  name2 + " IS " + (name3.charAt(0)) + (name2.charAt(0)));
                System.out.println("SUGGESTED USERNAME: " + name3.toLowerCase() + "_" + name2.toLowerCase());
                break;

            default:
                System.out.println("ENTER 1-6 ONLY");
        }
    }
}