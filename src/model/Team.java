package model;

public class Team{
	String name;
	String coach;
	String captain;
	City city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public Team(String name, String coach, String captain, City city) {
		super();
		this.name = name;
		this.coach = coach;
		this.captain = captain;
		this.city = city;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
