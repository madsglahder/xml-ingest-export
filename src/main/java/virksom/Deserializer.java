package virksom;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import resourceHandling.SettingsLoad;

import java.io.File;

public class Deserializer {

    public Form getForm() throws Exception {

        SettingsLoad settingsLoad = new SettingsLoad();
        String filePath = settingsLoad.getFilepath();
        File source = new File(filePath);

        Serializer serializer = new Persister();
        Form form = serializer.read(Form.class, source);

        return form;
    }


}
