package dao;
import java.sql.SQLException;

public interface ObjectDAO {
     default boolean add(Object obj) {
         return false;
    }

    default boolean remove(String id) {
        return false;
    }
    default boolean edit(String id,Object obj) {
        return false;
    }

}
