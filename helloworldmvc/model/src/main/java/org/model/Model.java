package org.model;


import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import org.contract.IModel;
import org.model.DAOHelloWorld;

public class Model  extends Observable implements IModel{
	
	private DAOHelloWorld daoHelloWorld;
	
	public String getHelloWorld() throws SQLException {
		return "Hello World";
		//return daoHelloWorld.getQuerySelectFirstHelloWorld();
	}
	
}