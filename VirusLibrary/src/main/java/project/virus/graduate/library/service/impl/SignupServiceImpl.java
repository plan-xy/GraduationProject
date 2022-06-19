package project.virus.graduate.library.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.UserEntity;
import project.virus.graduate.library.repository.SignupRepository;
import project.virus.graduate.library.service.SignupService;

@Service
public class SignupServiceImpl implements SignupService {
	
	//实例化注册操作
	@Autowired
	private SignupRepository signupRepository;
	@Override
	public int Signup(UserEntity userEntity) {
	//重构
		LocalDateTime date  = LocalDateTime.now();
		Double userAccout = date.getMonthValue()*Math.pow(10, 6)+date.getDayOfMonth()*Math.pow(10, 4)+date.getHour()*Math.pow(10, 2)+date.getMinute();

		//生成用户的账号
		userEntity.setAccount(userAccout.toString());
		return signupRepository.signup(userEntity);
	
	}
	
	@Override
	public int testemail(String email) {
			if(signupRepository.testemail(email)>0)
				return 1;
			else
				return  0;
	}
}
