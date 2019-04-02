import virksom.Deserializer;
import virksom.Form;

public class Application {

    public static void main(String [] args) throws Exception {

        Deserializer deserializer = new Deserializer();
        Form form = new Form();
        form = deserializer.getForm();


        System.out.println(form.getIndberetninger().getGrid11().getControl80());

    }

}
