package calculatorMVC;

import calculatorMVC.db.DatabaseManagementSlice;
import calculatorMVC.db.fetch.FetchFromPostgresql;
import calculatorMVC.db.save.SaveToPostgresql;
import calculatorMVC.view.ConsoleView;
import calculatorMVC.view.IView;
import calculatorMVC.view.input.SystemInInput;
import calculatorMVC.view.output.ConsoleOutput;

public class Main {
    public static void main(String[] args) {
        DatabaseManagementSlice databaseManagement = new DatabaseManagementSlice(new FetchFromPostgresql(), new SaveToPostgresql());
        IView view = new ConsoleView(new SystemInInput(), new ConsoleOutput());
        view.runCalculator();
    }
}

