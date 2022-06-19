package project.virus.graduate.library.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.UserEntity;

@Repository
public interface LoginRepository {

	public int loginValidator(@Param("account")String account, @Param("password")String password);

	public UserEntity relogin(@Param("account")String account);

    public UserEntity emailLogin(@Param("email")String email);
}
