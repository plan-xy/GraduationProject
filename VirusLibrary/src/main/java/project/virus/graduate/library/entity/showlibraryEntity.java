package project.virus.graduate.library.entity;

import org.apache.ibatis.type.Alias;

@Alias("showlibrary")
public class showlibraryEntity {
	
	private boolean disableflag;

	public boolean isDisableflag() {
		return disableflag;
	}

	public void setDisableflag(boolean disableflag) {
		this.disableflag = disableflag;
	}
}
