package calculatorMVC.view.input;

import java.util.Scanner;

public class SystemInInput implements IInput {
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public String getInput() {
        return scanner.nextLine();
    }
}
