package Utils;

import com.google.gson.JsonParser;
import org.codehaus.jackson.map.util.JSONPObject;

import java.io.BufferedReader;
import java.io.IOException;
import com.google.gson.JsonObject;

public class JsonUtils {
    public static String getValueFromJson(BufferedReader reader, String key) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();
        String jsonString = sb.toString();

        // Phân tích JSON thành đối tượng JsonObject
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();

        // Lấy giá trị của key
        String value = jsonObject.get(key).getAsString();
        return value;
    }
}
