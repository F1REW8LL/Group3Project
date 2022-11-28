package application;

public class PlayerTest {
	String name;
	String team;
	
	public PlayerTest() {
		this.name = "";
		this.team = "";
	}
	
	public PlayerTest(String name, String team) {
		this.name = name;
		this.team = team;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}
}
