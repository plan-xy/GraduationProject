package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("Libpic")
public class LibraryPicEntity {
	private int picid;
	
	private int storyid;
	
	private String pic;

	public int getPicid() {
		return picid;
	}

	public void setPicid(int picid) {
		this.picid = picid;
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
