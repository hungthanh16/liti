package Mapper;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ModelMapper {
    public static <T> T mapResultSetToObject(ResultSet resultSet, Class<T> clazz) throws SQLException, IllegalAccessException, InstantiationException {
        T object = clazz.newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String columnName = toLowerCase(field.getName()); // Chuyển tên trường sang chữ thường
            field.set(object, resultSet.getObject(columnName));
        }
        return object;
    }

    private static String toLowerCase(String str) {
        return str.toLowerCase(); // Chuyển chuỗi sang chữ thường
    }
}
