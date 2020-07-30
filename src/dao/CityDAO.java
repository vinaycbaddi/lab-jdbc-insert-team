package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.*;
import model.*;
public class CityDAO{
	public City getCityByName(String name) throws IOException, SQLException {
		Connection con=ConnectionManager.getConnection();
		String sql="Select * from city";
		PreparedStatement st=con.prepareStatement(sql);
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			if(name.equals(rs.getString(2))) {
				System.out.println("ID is : " + rs.getInt(1) + "\t City name is : "+ rs.getString(2) );
			}
		}
		return null;
	}
	public void createCity(City city) throws SQLException, IOException {
		long id=city.getCityId();
		String cityname=city.getCityName();
		Connection cm=ConnectionManager.getConnection();
		String sql="INSERT INTO CITY(id,city_name)VALUES(?,?)";
		PreparedStatement st=cm.prepareStatement(sql);
		st.setLong(1,id);
		st.setString(2, cityname);
		st.executeUpdate();
		cm.close();	
	}
}
