package org.main;

import java.sql.SQLException;

import org.controller.Controller;
import org.model.Model;
import org.view.View;

public class Main {
	private static View view = new View();
	private static Model model =  new Model();
    public static void main( String[] args ) throws SQLException{
		final Controller controller = new Controller(view, model);
		controller.run();
    }
}
