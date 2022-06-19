package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;
//这是轮播图获取

@Alias("carousel")
public class carouselEntity {
	
	private int pid;
	
	private String pic;
	
	private String sort;
	
	private String subject;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
