package project.virus.graduate.library.requestdto;

public class libraryForm {
	
	private int storyid;
	
	private int virusid;
	
	private String content;
	
	private String  title;
	
	private String  starttime;

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

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}


}
