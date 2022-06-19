package project.virus.graduate.library.entity;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;
//对应表中Talkyard,这个是一个集体
@Alias("Talkyard")
public class TalkyardEntity {
	private int yardid;
	 
	private String subject;
	
	private String head;
	
	private String content;
	
	private int level;
	
	private int eyenum;
	
	private int authorid;
	
	private String nickname;
	
	private String useravater;
	
	private LocalDateTime foundtime;
	
	
	public int getYardid() {
		return yardid;
	}

	public void setYardid(int yardid) {
		this.yardid = yardid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getEyenum() {
		return eyenum;
	}

	public void setEyenum(int eyenum) {
		this.eyenum = eyenum;
	}

	public LocalDateTime getFoundtime() {
		return foundtime;
	}

	public void setFoundtime(LocalDateTime foundtime) {
		this.foundtime = foundtime;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUseravater() {
		return useravater;
	}

	public void setUseravater(String useravater) {
		this.useravater = useravater;
	}
	
}
