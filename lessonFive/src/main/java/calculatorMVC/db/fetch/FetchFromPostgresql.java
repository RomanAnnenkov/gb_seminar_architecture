package calculatorMVC.db.fetch;

public class FetchFromPostgresql implements IFetchFromDB {

    @Override
    public String fetchFromDB() {
        return "return from postgresql";
    }
}
