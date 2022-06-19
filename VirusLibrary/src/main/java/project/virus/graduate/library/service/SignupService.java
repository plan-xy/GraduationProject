package project.virus.graduate.library.service;

import project.virus.graduate.library.entity.UserEntity;

public interface SignupService {
	//注册的Service接口 
	public int Signup(UserEntity userEntity);
	
	public int testemail(String email);
}
