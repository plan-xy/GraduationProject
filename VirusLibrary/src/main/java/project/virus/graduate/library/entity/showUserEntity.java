package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("showUser")
public class showUserEntity extends UserEntity {
	
	private boolean disableflag;

	public boolean isDisableflag() {
		return disableflag;
	}

	public void setDisableflag(boolean disableflag) {
		this.disableflag = disableflag;
	}
	
}
