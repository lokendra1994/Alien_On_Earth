class Alien{

	private String CodeName;
	private String BloodColor;
	private Integer NoOfAntennas;
	private Integer NoOfLegs;
	private String HomePlanet;
	
	public void setCodeName(String x){
		CodeName = x;
	}
	
	public void setBloodColor(String x){
		BloodColor = x;
	}
	
	public void setNoOfAntennas(Integer x){
		NoOfAntennas = x;
	}
	
	public void setNoOfLegs(Integer x){
		NoOfLegs = x;
	}
	
	public void setHomePlanet(String x){
		HomePlanet = x;
	}
	
	public String getCodeName(){
		return CodeName;
	}
	
	public String getBloodColor(){
		return BloodColor;
	}
	
	public Integer getNoOfAntennas(){
		return NoOfAntennas;
	}
	
	public Integer getNoOfLegs(){
		return NoOfLegs;
	}
	
	public String getHomePlanet(){
		return HomePlanet;
	}
	
}