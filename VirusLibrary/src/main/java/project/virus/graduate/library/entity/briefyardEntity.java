package project.virus.graduate.library.entity;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("briefyard")
public class briefyardEntity {
	private int yardid;
	
	private String head;
	
	private int eyenum;
	
	private String subject;
	
	private LocalDateTime foundtime;
	
	private int level;

	public int getYardid() {
		return yardid;
	}

	public void setYardid(int yardid) {
		this.yardid = yardid;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public int getEyenum() {
		return eyenum;
	}

	public void setEyenum(int eyenum) {
		this.eyenum = eyenum;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public LocalDateTime getFoundtime() {
		return foundtime;
	}

	public void setFoundtime(LocalDateTime foundtime) {
		this.foundtime = foundtime;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
