package project.virus.graduate.library.entity;

import java.time.LocalTime;

import org.apache.ibatis.type.Alias;
//这是对应着news表的内容
@Alias("News")
public class NewsEntity extends BaseEntity{
	private int newsid;
	
	private String subject;
	
	private String sort;
	
	private int eyenum;
	
	private String head;
	
	private String content;
	
	private int authorid;
	
	private LocalTime createlogtime;
	
	private int like;
	
	private int virusid;
 
	
	public int getNewsid() {
		return newsid;
	}

	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getEyenum() {
		return eyenum;
	}

	public void setEyenum(int eyenum) {
		this.eyenum = eyenum;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public LocalTime getCreatelogtime() {
		return createlogtime;
	}

	public void setCreatelogtime(LocalTime createlogtime) {
		this.createlogtime = createlogtime;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getVirusid() {
		return virusid;
	}

	public void setVirusid(int virusid) {
		this.virusid = virusid;
	}
 
		
}
