/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Map;

import javax.xml.ws.Response;

import java.util.ArrayList;
public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        //hero class get and post methods
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

        get("heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/heroes-form.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heros", request.session().attribute("heros"));
            model.put("heros", Heros.all());
            model.put("template", "templates/heroes.vtl");
            return new ModelAndView(model, layout);
        },new VelocityTemplateEngine());

        get("/heros/:id", (request, response) -> {
            HashMap<String, Object> model = new HashMap<String, Object>();
            Heros heros = Heros.find(Integer.parseInt(request.queryParams(":id")));
            model.put("heros", heros);
            model.put("template", "templates/hero.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

        //Squad class get and post methods

        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/squad-form.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

          get("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squads", Squad.all());
            model.put("template", "templates/squads.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

          get("/squads/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/squad.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

          get("squads/:id/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/squad-hero-form.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

          post("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String cause = request.queryParams("cause");
            int size = Integer.parseInt(request.queryParams("size"));
            Squad newSquad = new Squad(name,cause,size);
            model.put("template", "templates/squad-success.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

          post("/heroes", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.queryParams("squadId")));
            String name = request.queryParams("SuperHero-Name");
            int age = Integer.parseInt(request.queryParams("hero-age"));
            String power = request.queryParams("special-power");
            String weakness = request.queryParams("weakness");
            Heros myHeros = new Heros(name,age,power,weakness);
            
            squad.addHero(myHeros);
            model.put("squad", squad);
            model.put("template", "templates/squad-hero-success.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());
          


    }
}
