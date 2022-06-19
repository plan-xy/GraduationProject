package project.virus.graduate.library.entity;
//评论
import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;
@Alias("toyard")
public class toyardEntity {
	
	private int toid;
	
	private int yardid;
	
	private String content;
	
	private LocalDateTime yardtime;
	
	private int authorid;
	
	private int towhoid;
	
	private String nickname;
	
	private String email;
	
	private String useravater; 
	
	public int getToid() {
		return toid;
	}
	public void setToid(int toid) {
		this.toid = toid;
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
	public int getTowhoid() {
		return towhoid;
	}
	public void setTowhoid(int towhoid) {
		this.towhoid = towhoid;
	}
	public LocalDateTime getYardtime() {
		return yardtime;
	}
	public void setYardtime(LocalDateTime yardtime) {
		this.yardtime = yardtime;
	}
	public int getYardid() {
		return yardid;
	}
	public void setYardid(int yardid) {
		this.yardid = yardid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUseravater() {
		return useravater;
	}
	public void setUseravater(String useravater) {
		this.useravater = useravater;
	}
	
}
