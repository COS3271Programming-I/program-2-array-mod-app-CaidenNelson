import java.util.Arrays;
import java.util.Scanner;

class arrayModApp {
    static Scanner userinput = new Scanner(System.in);
    static Scanner userinput2 = new Scanner(System.in);
    public static void main(String[] args) {
        int counter = 0;
        int number = 0;
        String edit;

        System.out.println("How many numbers would you like in the array? Max of 20.");
        int length = userinput.nextInt();


        int[] array = new int[length];

        while (counter < length){

            System.out.println("What number do you want at place" + " " + counter);
            array[number] = userinput.nextInt();

            number++;
            counter++;
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Would you like to edit any of your numbers? Yes or No");
        edit = userinput2.nextLine();
        edit = edit.toLowerCase();

        while (edit.equals("yes")){
            System.out.println("Which number do you want to edit?");
            number = userinput.nextInt();
            System.out.println("What do you want number" +" "+ number +" "+ "to equal?");
            array[number] = userinput.nextInt();

            System.out.println("Do you want to edit another number?");
            edit = userinput2.nextLine();
            edit = edit.toLowerCase();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
