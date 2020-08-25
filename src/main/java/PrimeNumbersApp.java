import java.util.List;

public class PrimeNumbersApp {

    private Menu menu;
    public PrimeNumbersApp (Menu menu){
        this.menu = menu;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        PrimeNumbersApp app = new PrimeNumbersApp(menu);
        Integer[] parsedNums = app.parseArgsToNums(args);

        if (parsedNums == null){
            System.exit(0);
        }

        app.run(parsedNums[0],parsedNums[1]);
    }

    public void run (int startNum, int endNum){

        ReportGenerator reportGenerator = new ReportGenerator();
        List<Integer> primeNumbers = reportGenerator.generate(startNum, endNum);

        menu.displayMessage("Found " + primeNumbers.size() + " prime numbers between " + startNum + " & " + endNum + ":");
        menu.displayMessage(primeNumbers.toString());

    }

    public Integer[] parseArgsToNums(String[] args){

        int startNum = 0;
        int endNum = 0;
        Integer[] parsedNums;

        try {
            startNum = Integer.parseInt(args[0]);
            endNum = Integer.parseInt(args[1]);

        } catch (NumberFormatException n) {
            menu.displayMessage("Unable to parse input values: " + "'" + args[0] + "'" + " & " + "'" + args[1] + "'" + " try again.");
            return null;
        }
        parsedNums = new Integer[]{startNum,endNum};
        return parsedNums;
    }
}
