package slavik.sendbox.test_java.introduction_to_JAXB.toXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by vymi1016 on 06/21/2017.
 */
public class MainJAXB {
    public static void main(String[] args) {

        People people = new People();
        Person person = new Person();
        person.setId(100);
        person.setName("Slavik");

        Person person1 = new Person();
        person1.setId(101);
        person1.setName("Slavik1");

        Person person2 = new Person();
        person2.setId(102);
        person2.setName("Slavik2");

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        people.setPerson(persons);
        try {

            File file = new File("fileJAXBTest.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(People.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(people,file);
            jaxbMarshaller.marshal(person, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
