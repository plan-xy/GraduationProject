package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("VirusPic")
public class VirusPicEntity {
//病毒信息之图片
	private int picid;
	
	private int virusid;
	
	private String pic;

	public int getPicid() {
		return picid;
	}

	public void setPicid(int picid) {
		this.picid = picid;
	}

	public int getVirusid() {
		return virusid;
	}

	public void setVirusid(int virusid) {
		this.virusid = virusid;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
}
