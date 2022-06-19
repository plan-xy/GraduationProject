package project.virus.graduate.library.entity.data;

import org.apache.ibatis.type.Alias;

@Alias("rankResult")
public class rankResultEntity {
	private int virusid;
	
	private String name;
	
	private String subname;
	
	private  String disease;
	
	private  Double  deathrate;
	
	private  Double 	R;
	
	private  int eyenum;

	public int getVirusid() {
		return virusid;
	}

	public void setVirusid(int virusid) {
		this.virusid = virusid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Double getDeathrate() {
		return deathrate;
	}

	public void setDeathrate(Double deathrate) {
		this.deathrate = deathrate;
	}

	public Double getR() {
		return R;
	}

	public void setR(Double r) {
		R = r;
	}

	public int getEyenum() {
		return eyenum;
	}

	public void setEyenum(int eyenum) {
		this.eyenum = eyenum;
	}
	
	
	
}
