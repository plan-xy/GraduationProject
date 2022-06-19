package project.virus.graduate.library.entity.data;

import org.apache.ibatis.type.Alias;

@Alias("frontchart")
public class frontChartdata {
	private double deathrate;
	
	private String name;
	
	private String disease;
	
	private String virusid;

	public double getDeathrate() {
		return deathrate;
	}

	public void setDeathrate(double deathrate) {
		this.deathrate = deathrate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getVirusid() {
		return virusid;
	}

	public void setVirusid(String virusid) {
		this.virusid = virusid;
	}
}
