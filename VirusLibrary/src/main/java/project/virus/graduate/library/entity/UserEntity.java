package project.virus.graduate.library.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.ibatis.type.Alias;
//只用作检索用户的实体：对应着user表内容
@Alias("User")
public class UserEntity extends BaseEntity {
	// 用户id
	private Integer userid;
	//用户名
	private String nickname;
	//	性别
	private String gender;
	//出身年月
	private LocalDate birthday;
	//登录时间
	private LocalDateTime loginday;
	//职业
	private String career;
	//级别
	private Integer grade;
	//用户账号
	private String account;
	//用户密码
	private String password;
	//用户邮箱
	private String email;

	private String useravater;
	
	private String phone;
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public LocalDateTime getLoginday() {
		return loginday;
	}

	public void setLoginday(LocalDateTime loginday) {
		this.loginday = loginday;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}



	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUseravater() {
		return useravater;
	}

	public void setUseravater(String useravater) {
		this.useravater = useravater;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}
}
