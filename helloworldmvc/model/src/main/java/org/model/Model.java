package org.model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import org.contract.IModel;
import org.model.DAOHelloWorld;

public class Model  extends Observable implements IModel{
		
	public String getHelloWorld() throws SQLException {
		
		DAOHelloWorld daoHelloWorld = new DAOHelloWorld();
		daoHelloWorld.open();
		ResultSet requete = daoHelloWorld.executeQuery(daoHelloWorld.getQuerySelectFirstHelloWorld());
		
		return requete.getString("helloWorld");
	}
}