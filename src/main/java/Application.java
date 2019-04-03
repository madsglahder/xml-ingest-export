import randomString.RandomString;
import virksom.Deserializer;
import virksom.Form;
import virksom.SerializerForm;

public class Application {

    public static void main(String [] args) throws Exception {

        Deserializer deserializer = new Deserializer();
        Form form = new Form();
        form = deserializer.getForm();

        RandomString randomString = new RandomString();

        System.out.println("Control application is running");

        form.randomizeFields();

        SerializerForm serializerForm = new SerializerForm();
        serializerForm.formToFile(form, "src/main/resources/", "alteredTest.xml");
    }

}
