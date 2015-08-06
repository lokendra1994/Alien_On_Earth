class Alien{
	private String Code_Name;
	private String Blood_Color;
	private Integer No_Of_Antennas;
	private Integer No_Of_Legs;
	private String Home_Planet;
	public String getCodeName(){
		return Code_Name;
	}
	public String getBloodColor(){
		return Blood_Color;
	}
	public Integer getNoOfAntennas(){
		return No_Of_Antennas;
	}
	public Integer getNoOfLegs(){
		return No_Of_Legs;
	}
	public String getHomePlanet(){
		return Home_Planet;
	}
	public void setCodeName(String x){
		Code_Name = x;
	}
	public void setBloodColor(String x){
		Blood_Color = x;
	}
	public void setNoOfAntennas(Integer x){
		No_Of_Antennas = x;
	}
	public void setNoOfLegs(Integer x){
		No_Of_Legs = x;
	}
	public void setHomePlanet(String x){
		Home_Planet = x;
	}
}