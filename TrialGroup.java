import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrialGroup {

    private String fileName;
    private int count;
    private int sum;
    private int sumOfSquares;

    public TrialGroup(String fileName) {
        this.fileName = fileName;
        count = 0;
        sum = 0;
        sumOfSquares = 0;
        readFileContents();
    }

    public double getAverage() {

        return 1.0 * sum / count;
    }

    public double getStandardDeviation() {
        double average = getAverage();
        return Math.sqrt((average * average) / count) - (average * average);
    }

    public String getFileName() {
        return fileName;
    }

    private void readFileContents() {

        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                count += 1;
                int value = Integer.parseInt(scanner.nextLine());
                sum += value;
                sumOfSquares += value * value;
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
