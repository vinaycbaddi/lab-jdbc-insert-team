package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	 public void createTeam(Team team) throws SQLException, IOException {
		 String name=team.getName();
		 String coach=team.getCoach();
		 String captain=team.getCaptain();
		 City city=team.getCity();
		 Connection cm =ConnectionManager.getConnection();
		 String sql="INSERT INTO TEAM(NAME,COACH,CAPTAIN,CITY_ID,CITY_NAME)VALUES(?,?,?,?,?)";
		 PreparedStatement st=cm.prepareStatement(sql);
		 st.setString(1, name);
		 st.setString(2, coach);
		 st.setString(3, captain);
		 st.setLong(4, city.getCityId());
		 st.setString(5, city.getCityName());
		 st.executeUpdate();
		 cm.close();
	 }	
}
