package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("yardPic")
public class yardPicEntiry {

	private int yardid;
	
	private int storyid;
	
	private String pic;

	public int getYardid() {
		return yardid;
	}

	public void setYardid(int yardid) {
		this.yardid = yardid;
	}

	public int getStoryid() {
		return storyid;
	}

	public void setStoryid(int storyid) {
		this.storyid = storyid;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
}
