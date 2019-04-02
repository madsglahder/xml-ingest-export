package personGeneration;

import randomString.RandomString;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateXml {

    public void writeObject(Person person) throws JAXBException, FileNotFoundException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        OutputStream outputStream = new FileOutputStream("src/main/resources/person.xml");
        marshaller.marshal(person, outputStream);

    }

    public Person generatePerson() {

        Person person = new Person();

        int randomId = ThreadLocalRandom.current().nextInt(0, 100000000);
        person.setId(randomId);

        int randomCpr = ThreadLocalRandom.current().nextInt(1000000000, 2000000000);
        person.setCpr(randomCpr);

        RandomString firstName = new RandomString(5, ThreadLocalRandom.current());
        person.setFirstName(firstName.nextString());

        RandomString lastName = new RandomString(8, ThreadLocalRandom.current());
        person.setLastName(lastName.nextString());

        long randomSalary = ThreadLocalRandom.current().nextLong(0L, 1000000L);
        person.setSalary(randomSalary);

        List<String> hobbies = new ArrayList<>();
        RandomString hobby = new RandomString(6, ThreadLocalRandom.current());
        hobbies.add(hobby.nextString());
        hobbies.add(hobby.nextString());
        hobbies.add(hobby.nextString());
        hobbies.add(hobby.nextString());
        person.setHobbies(hobbies);

        return person;

    }

}
