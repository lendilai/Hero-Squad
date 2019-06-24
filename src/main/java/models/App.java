package models;

import static spark.Spark.staticFileLocation;
import spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        //Get: View the Home page
        //Get: Add squad form
        //Post: Submit data from the add squad form
        //Get: View all squads
        //Get: View squad-details e.g heroes
        //Get: Add hero form
        //Post: Submit add hero form
        //Get: Delete a squad
    }
}
