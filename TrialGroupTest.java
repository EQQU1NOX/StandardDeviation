import java.util.Scanner;

public class TrialGroupTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Data file 1 path: ");
        String dataFile1 = scanner.nextLine();

        System.out.print("Enter Data file 2 path: ");
        String dataFile2 = scanner.nextLine();

        System.out.print("Enter Data file 3 path: ");
        String dataFile3 = scanner.nextLine();

        TrialGroup groupOne = new TrialGroup(dataFile1);
        TrialGroup groupTwo = new TrialGroup(dataFile2);
        TrialGroup groupThree = new TrialGroup(dataFile3);

        System.out.println("group 1: average = " + groupOne.getAverage() + " standard deviation = " + groupOne.getStandardDeviation());
        System.out.println("group 2: average = " + groupTwo.getAverage() + " standard deviation = " + groupTwo.getStandardDeviation());
        System.out.println("group 3: average = " + groupThree.getAverage() + " standard deviation = " + groupThree.getStandardDeviation());


    }
}