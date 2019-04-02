import randomString.RandomString;
import virksom.Deserializer;
import virksom.Form;

public class Application {

    public static void main(String [] args) throws Exception {

        Deserializer deserializer = new Deserializer();
        Form form = new Form();
        form = deserializer.getForm();

        RandomString randomString = new RandomString();

        System.out.println("Control application is running");
        System.out.println(randomString.nextString());

        form.randomizeFields();


    }

}
