package project.virus.graduate.library.entity;
 

import org.apache.ibatis.type.Alias;
//这是可以显示关于新闻的所有信息
@Alias("NewsItem")
public class NewsItemEntity extends BaseEntity {
	
	private int newsid;
	
	private String subject;
	
	private String sort;
	
	private int eyenum;
	
	private String head;
 	
	private int authorid;
 
	private int like;

	private String pic;
	 
	
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

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
 
}
