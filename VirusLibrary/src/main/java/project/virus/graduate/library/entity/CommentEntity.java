package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("Comment")
public class CommentEntity extends toyardEntity {
	
	private String content;
	
	private String subject;
	
	private boolean disableflag;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isDisableflag() {
		return disableflag;
	}

	public void setDisableflag(boolean disableflag) {
		this.disableflag = disableflag;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
