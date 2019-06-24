package models;

import static spark.Spark.*;
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
        get("/", (request, response) -> {
          Map<String, Object> user = new HashMap<>();
          return new ModelAndView(user, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //Get: Add squad form
        get("/squads/new", (request, response) -> {
            Map<String, Object> user = new HashMap<>();
            return new ModelAndView(user, "Squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        //Post: Submit data from the add squad form
        post("/squads/new", (request, response) -> {
            Map<String, Object> user = new HashMap<>();
            String squadName = request.queryParams("name");
            String theme = request.queryParams("theme");
            String url = request.queryParams("url");
            int numberOf = Integer.parseInt(request.queryParams("max"));
            Squads userSquad = new Squads(squadName, theme, url, numberOf);
            user.put("userSquad", Squads.getAllSquads());
            return new ModelAndView(user, "success.hbs");
        }, new HandlebarsTemplateEngine());

        //Get: View all squads
        get("/squads", (request, response) -> {
            Map<String, Object> user = new HashMap<>();
            user.put("userSquad", Squads.getAllSquads());
            return new ModelAndView(user, "Squads.hbs");
        }, new HandlebarsTemplateEngine());

        //Get: View squad-details e.g heroes
        //Get: Add hero form
        //Post: Submit add hero form
        //Get: Delete a squad
    }
}
