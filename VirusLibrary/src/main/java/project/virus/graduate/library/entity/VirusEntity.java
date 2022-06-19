package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;
//只用作检索病毒表的实体：对应着病毒表内容
@Alias("Virus")
public class VirusEntity {
	
	private int virusid;
	
	private String name;
	
	private String subname;
	
	private String disease;
	
	private String introduction;
	
	private String foundtime;
	
	private String R;
	
	private String infection;
	
	private String shape;
	
	private String structbuild;
	
	private String way;
	
	private String fight;
	
	private int deadmount;
	
	private String deathrate;

	
	private int eyenum;

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

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getStructbuild() {
		return structbuild;
	}

	public void setStructbuild(String structbuild) {
		this.structbuild = structbuild;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getFight() {
		return fight;
	}

	public void setFight(String fight) {
		this.fight = fight;
	}

	public int getDeadmount() {
		return deadmount;
	}

	public void setDeadmount(int deadmount) {
		this.deadmount = deadmount;
	}

	public String getDeathrate() {
		return deathrate;
	}

	public void setDeathrate(String deathrate) {
		this.deathrate = deathrate;
	}

	public int getEyenum() {
		return eyenum;
	}

	public void setEyenum(int eyenum) {
		this.eyenum = eyenum;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getFoundtime() {
		return foundtime;
	}

	public void setFoundtime(String foundtime) {
		this.foundtime = foundtime;
	}

	public String getR() {
		return R;
	}

	public void setR(String r) {
		R = r;
	}

	public String getInfection() {
		return infection;
	}

	public void setInfection(String infection) {
		this.infection = infection;
	}

}
