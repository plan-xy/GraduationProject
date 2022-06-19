package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("briefstory")
public class briefstoryEntity {
	//列表的唯一id
	private int storyid;
	//病毒的id
	private int virusid;
	//标题
	private String title;
	//内容
	private String content;
	//图片链接
	private String pic;
	
	private String starttime;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
}
