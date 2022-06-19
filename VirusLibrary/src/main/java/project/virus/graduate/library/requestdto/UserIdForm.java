package project.virus.graduate.library.requestdto;

import javax.validation.constraints.NotNull;

public class UserIdForm {
	
	@NotNull(message = "鐢ㄦ埛ID涓嶈兘涓虹┖銆�")
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
