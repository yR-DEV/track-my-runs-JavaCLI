package zc.trackmyruns.cli.run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import zc.trackmyruns.cli.dbconnection.ConnectionManager;

public class RunDAOClass implements RunDAO{
	
	private Connection connection = ConnectionManager.getConnection();

	@Override
	public List<Run> getAllRuns() {
		
		try {
			PreparedStatement prepStatement = connection.prepareStatement("SELECT * FROM run");
			ResultSet rSet = prepStatement.executeQuery();
			
			List<Run> runList = new ArrayList<>();
			
			while(rSet.next()) {
				runList.add(new Run(rSet.getInt(1), rSet.getInt(2), rSet.getString(3)));
			}
			
			rSet.close();
			prepStatement.close();
			System.out.println(runList);
			return runList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

}
