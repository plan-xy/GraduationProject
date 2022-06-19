package project.virus.graduate.library.requestdto;

import javax.validation.constraints.NotBlank;

/**
 * 登录入力参数。
 */
public class LoginForm {
    // 用户名
    @NotBlank(message = "用户名不能为空。")
    private String account;
    // 密码
    @NotBlank(message = "密码不能为空。")
    private String password;

 
    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
