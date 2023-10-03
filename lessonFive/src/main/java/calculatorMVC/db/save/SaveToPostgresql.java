package calculatorMVC.db.save;

public class SaveToPostgresql implements ISaveToDB {

    @Override
    public void saveToDB(String info) {
        System.out.println("Save to postgresql: " + info);
    }
}
