package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("Type")
public class SelectTypeEntity {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
