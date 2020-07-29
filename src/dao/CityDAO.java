package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utility.*;
import model.*;
public class CityDAO{
	public City getCityByName(String name) {
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
