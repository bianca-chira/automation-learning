package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DocumentUtils {
    public static Properties getPropertiesFile() {
        Properties prop = new Properties();
        try {
            FileReader reader = new FileReader("src/test/resources/utils/utils.properties");
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
