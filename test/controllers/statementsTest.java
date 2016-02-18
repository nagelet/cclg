package controllers;

import helpers.jaxb.postfinance.generated.IC;
import org.junit.Test;
import play.Play;
import play.test.UnitTest;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;
import java.io.File;

/**
 * @author agne
 */
public class statementsTest extends UnitTest {

    public static final String EXTENTION_XML = ".xml";

    @Test
    public void loadTest() throws JAXBException {
        File xml = new File("app/files/acc_200_f_4334527213" + EXTENTION_XML);

        JAXBContext jaxbContext = JAXBContext.newInstance(IC.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        IC statements = (IC) jaxbUnmarshaller.unmarshal(xml);

        System.out.println(statements);

    }
}
