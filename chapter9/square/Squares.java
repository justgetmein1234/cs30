package square;
public class HIgestGRade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList < Integer > scores = new ArrayList < Integer > ();
        System.out.println("ENTER 5 GRADES FROM 0 TO 100.");
        int greatest = -1;
        int i = 5;
        while (scores.size() < 5) {

            int input = scan.nextInt();
            if (input <= 100 && input >= 0) {
                scores.add(input);
                if (input >= greatest)
                    greatest = input;
                i--;
                if (i != 0)
                    System.out.println("ENTER " + i + " MORE GRADES.");
            } else {
                System.out.println("Error: MAKE SURE THE grade is FROM 0 and 100!\nEnter a new grade!");
            }
        }
        System.out.println("\nHighest grade: " + greatest);

    }
}