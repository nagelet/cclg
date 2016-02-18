package controllers;

import play.mvc.Controller;

import java.io.File;

/**
 * @author agne
 */
public class Statements extends Controller {

    public static final String EXTENTION_XML = ".xml";

    public static void load() {
        File xml = new File("app/files/acc_200_f_4334527213" + EXTENTION_XML);
    }
}
