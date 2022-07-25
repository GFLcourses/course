package SingleTone;

public class SingleTone {
    private static SingleTone instance;
    private String dbConnection;

    private SingleTone() {
        // some logic of installing the db connection
        dbConnection = "Db connected";
    }

    public static SingleTone getInstance() {
        if (instance == null)
            instance = new SingleTone();
        return instance;
    }

    public String getDbConnection() {
        return dbConnection;
    }
}
