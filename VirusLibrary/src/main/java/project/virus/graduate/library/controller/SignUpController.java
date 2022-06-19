package project.virus.graduate.library.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.UserEntity;
import project.virus.graduate.library.requestdto.SignupForm;
import project.virus.graduate.library.requestdto.nameForm;
import project.virus.graduate.library.service.SignupService; 

@RestController
public class SignUpController {

	@Autowired
	private SignupService signupService;
	
	//新增用户
	@PostMapping("/signup")
    public int signup(@RequestBody @Valid SignupForm form, Errors errors) {
		//实例化对象
		UserEntity userEntity = new UserEntity();
		//重新赋予对象
		BeanUtils.copyProperties(form, userEntity);
		
		//执行
    	return signupService.Signup(userEntity);

    }
	
	@PostMapping("/signup/testEmail")
	public int testemail(@RequestBody nameForm email) {
		
		return signupService.testemail(email.getUserName());
	}
//	@PostMapping("/editUser")
//	public void editUser(@RequestBody @Valid SignupForm form) {
// 
//		UserEntity userEntity = new UserEntity();
//		
//		BeanUtils.copyProperties(form, userEntity);
//		
//		signUpService.editUser(userEntity);
//	}
//	@PostMapping("/judgeUser")
//	public UserEntity judge(@RequestBody @Valid nameForm form ) {
//		return signUpService.judge(form.getUserName());
//	}
}
