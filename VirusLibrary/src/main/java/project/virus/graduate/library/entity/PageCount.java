package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("Page")
public class PageCount {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
