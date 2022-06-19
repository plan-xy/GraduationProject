package project.virus.graduate.library.entity;
//这个用来显示所有的共有属性

import java.time.LocalDateTime;

public class BaseEntity {
	
	private boolean disableflag;
	
	private LocalDateTime foundtime;

	public boolean isDisableflag() {
		return disableflag;
	}

	public void setDisableflag(boolean disableflag) {
		this.disableflag = disableflag;
	}

	public LocalDateTime getFoundtime() {
		return foundtime;
	}

	public void setFoundtime(LocalDateTime foundtime) {
		this.foundtime = foundtime;
	}
}
