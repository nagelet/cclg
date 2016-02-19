package controllers;

import helpers.jaxb.postfinance.generated.IC;
import play.mvc.Controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * @author agne
 */
public class Statements extends Controller {

    public static final String EXTENTION_XML = ".xml";

    public static void load() throws JAXBException {
        File xml = new File("app/files/acc_200_f_4334527213" + EXTENTION_XML);

        JAXBContext jaxbContext = JAXBContext.newInstance(IC.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        IC statements = (IC) jaxbUnmarshaller.unmarshal(xml);


    }
}
