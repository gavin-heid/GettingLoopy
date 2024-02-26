import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int count = 0;
       for (;count <= 30;){
           System.out.print(count + " ");
           count = count + 1;
       }
        System.out.println();//moves to next line
       count30to1(args);
    }
    public static void count30to1(String[] args){
        int count = 30;
        for (; count >= 0;){
            System.out.print(count + " ");
            count = count - 1;
        }
        System.out.println();//moves to next line
        countby3to18(args);
    }
    public static void countby3to18(String[] args){
        int count = 0;
        for (; count >= 18;){//only keep looping while count is 18 or less
            System.out.print(count + " ");
            count = count + 3;//adding 3 to count
        }
        System.out.println();//moves to next line
        count10to0by2(args);
    }
    public static void count10to0by2(String[] args){
        int count = 10;
        for (; count <=0;){
            System.out.print(count + " ");
            count = count - 2;
        }
        System.out.println();
        astriskincreasing(args);
    }
    public static void astriskincreasing(String[] args){
        int totalRows = 5;
        int currentRow = 1;
        int numberOfStars = 1;
        for (
                currentRow = 1;
                currentRow <= totalRows;
                currentRow = currentRow + 1)
        {
            for (numberOfStars = 1;
            numberOfStars <= currentRow;
            numberOfStars = numberOfStars + 1){
                System.out.print("*");
            }
            System.out.println();
        }
        astriskdecreasing(args);
    }
    public static void astriskdecreasing(String[] args){
        int totalRows = 5;
        int currentRow = 5;
        int numberOfStars = 5;
        for (
                ;currentRow >= 1;
                currentRow = currentRow - 1)
        {
            for (numberOfStars = currentRow;
            numberOfStars >= 1;
            numberOfStars = numberOfStars - 1){
                System.out.print("*");
            }
            System.out.println();
        }
        astriskblock(args);
    }
    public static void astriskblock(String[] args){
        int totalRows = 5;
        int currentRow = 1;
        int numberOfStars = 5;
        for(
                ;currentRow <= totalRows;
                currentRow = currentRow + 1){
            for (; numberOfStars >=1;
            numberOfStars = numberOfStars -1){
                System.out.print("*");
            }
            numberOfStars = 5; //resets numberOfStars for next row
            System.out.println();
        }
        CtoFConverter(args);
    }
    public static void CtoFConverter(String[] args){
        double cel = 0;
        double fah = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        for (boolean done = false; !done; ){
            System.out.println("Input the temperature in Celsius you wish to convert to Fahrenheit");
            if (in.hasNextDouble()){
                cel = in.nextDouble();
                fah = cel * 1.8 + 32;
                done = true;
            }else {
                trash = in.nextLine();
                System.out.println("You input " + trash + " for the temperature");
                System.out.println("Please enter a valid number!");
            }
        }
        System.out.println("Temperature in fahrenheit: " + fah);
    }
}