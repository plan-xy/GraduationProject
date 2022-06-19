package project.virus.graduate.library.requestdto;

import javax.validation.constraints.NotNull;

public class ReturnForm {
 	
	private Integer historyId;
 
	public Integer getHistoryId() {
		return historyId;
	}

	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}
    @NotNull(message = "鍥句功ID涓嶈兘涓虹┖銆�")
    private Integer bookId;
    // 鐢ㄦ埛ID
    @NotNull(message = "鐢ㄦ埛ID涓嶈兘涓虹┖銆�")
    private Integer userId;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getUserId() {
      return userId;
    }

    public void setUserId(Integer userId) {
      this.userId = userId;
    }
}
