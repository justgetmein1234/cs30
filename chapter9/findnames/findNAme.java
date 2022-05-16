

public class findNAme.java

import java.util.Scanner;
import java.lang.String;
public class findNAme {

    public static void main(String[] args) {
        final int MAX = 5;
        String[] nameArray = new String[MAX];
        Scanner input = new Scanner(System.in);
        int name, location;


        for (int i = 0; i < nameArray.length; i++) {
            nameArray[i] = ((MAX + 1) * Math.random());
        }


        System.out.print("Enter a name: ");
        nameArray[MAX] = input.nextLine();


        location = Search.linear(nameArray, name);
        System.out.println("Enter a name to find: ");
        location = input.nextLine();
        if ((location != nameArray[MAX]))
            System.out.println("Sorry, name cant find. ");
        else
            System.out.println(" " + location);
    }
}
