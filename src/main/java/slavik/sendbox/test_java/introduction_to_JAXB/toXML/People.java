package slavik.sendbox.test_java.introduction_to_JAXB.toXML;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by vymi1016 on 06/20/2017.
 */
@XmlRootElement
public class People {

    ArrayList<Person> person;

    public ArrayList<Person> getPerson() {
        return person;
    }


    @XmlElement
    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }
}
