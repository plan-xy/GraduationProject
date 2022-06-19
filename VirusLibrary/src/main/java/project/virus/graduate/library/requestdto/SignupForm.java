package project.virus.graduate.library.requestdto;

import java.time.LocalDate;
import java.time.LocalDateTime;
 //用来接收新增的信息
public class SignupForm{	
 
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
}