package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import models.Task;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

/*    public Result tasks() {
    	List<Object> FizzBuzz = new ArrayList<>();
    	for(int i=1;i<=50;i++){
    		FizzBuzz.add(i);
    	}

    	return ok(tasks.render("Task List\n tasks",FizzBuzz));
    }*/
    public Result tasks() {
    	Task task = new Task();
    	task.name = "Pizza を食べる";
    	task.period = new Date();
    	task.save();

    	List<Task> taskList = task.find.all();
    	return ok(tasks.render(taskList));
    }
    public Result help() {
    	return ok(help.render());
    }
}
