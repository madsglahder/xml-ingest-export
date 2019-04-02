package virksom;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class SerializerForm {

    public void formToFile(Form form, String filePath, String fileName) {

        Serializer serializer = new Persister();
        File file = new File(filePath + fileName);

        try {
            serializer.write(form, file);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
