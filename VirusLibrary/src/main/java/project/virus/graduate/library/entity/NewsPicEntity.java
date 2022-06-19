package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("NewsPic")
public class NewsPicEntity {
	private int picid;
	
	private int newsid;
	
	private String pic;

	public int getPicid() {
		return picid;
	}

	public void setPicid(int picid) {
		this.picid = picid;
	}

	public int getNewsid() {
		return newsid;
	}

	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
}
