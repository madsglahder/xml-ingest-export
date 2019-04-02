package resourceHandling;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SettingsLoad {

    private String filepath;

    public void readSettings() {

        JSONParser jsonParser = new JSONParser();

        try (FileReader fileReader = new FileReader("src/main/resources/settings.json")) {

            //could be one line of parsing, assigning and casting
            //but ehh, i dunno ¯\_(ツ)_/¯
            Object notYetJsonObject = jsonParser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) notYetJsonObject;

            this.filepath = (String) jsonObject.get("xmlpath");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public String getFilepath() {
        return filepath;
    }

    public SettingsLoad() {
        this.readSettings();
    }

    public void readSettings(String settingsPath) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader fileReader = new FileReader(settingsPath)) {

            Object notYetJsonObject = jsonParser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) notYetJsonObject;

            this.filepath = (String) jsonObject.get("xmlpath");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void readSettings(String settingsPath, String jsonKey) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader fileReader = new FileReader(settingsPath)) {

            Object notYetJsonObject = jsonParser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) notYetJsonObject;

            this.filepath = (String) jsonObject.get(jsonKey);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
