package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.*;
import model.City;
import model.Team;

class Main{
	public static void main(String[] args) throws IOException, SQLException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	TeamDAO teamdao=new TeamDAO();
	CityDAO citydao=new CityDAO();
	City city=null;
	Team team=null;
	
	System.out.println("Enter the city ID");
	long cityID=Long.parseLong(br.readLine());
	
	System.out.println("Enter the city name");
	String cityName=br.readLine();
	city=new City(cityID,cityName);
    citydao.createCity(city);
	System.out.println(city.getCityName());
	System.out.println("Enter the team name");
	String teamname=br.readLine();
	System.out.println("Enter the team coach");
	String teamcoach=br.readLine();
	System.out.println("Enter the team captain");
	String teamcaptain=br.readLine();
	team=new Team(teamname,teamcoach,teamcaptain,city);
	teamdao.createTeam(team);
	
	}
}
