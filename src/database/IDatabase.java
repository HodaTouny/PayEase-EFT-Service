package database;

import java.util.List;

public interface IDatabase {
    void saveData(List<Object> data);
    List<Object> loadData();
}
