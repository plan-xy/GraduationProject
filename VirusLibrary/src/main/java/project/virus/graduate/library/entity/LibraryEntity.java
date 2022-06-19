package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;
/*
 * 对应着Library 库
 * */
@Alias("Library")
public class LibraryEntity {
	
	private int storyid;
	
	private int virusid;
	
	private String content;
	
	private String  title;

	public int getStoryid() {
		return storyid;
	}

	public void setStoryid(int storyid) {
		this.storyid = storyid;
	}

	public int getVirusid() {
		return virusid;
	}

	public void setVirusid(int virusid) {
		this.virusid = virusid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
