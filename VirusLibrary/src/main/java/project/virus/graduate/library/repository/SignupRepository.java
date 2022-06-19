package project.virus.graduate.library.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.UserEntity;
@Repository
public interface SignupRepository {
//仓库接口
	public int signup(UserEntity userEntity);
	
	public int testemail(@Param("email") String email);
}
