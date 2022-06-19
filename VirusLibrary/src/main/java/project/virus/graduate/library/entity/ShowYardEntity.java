package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("showYard")
public class ShowYardEntity extends TalkyardEntity {
	private boolean disableflag;

	public boolean isDisableflag() {
		return disableflag;
	}

	public void setDisableflag(boolean disableflag) {
		this.disableflag = disableflag;
	}
}
