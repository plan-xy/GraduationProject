package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

//1.用来返回用户验证之后的id
@Alias("id")
public class IdEntity {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
