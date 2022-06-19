package project.virus.graduate.library.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.briefyardEntity;
import project.virus.graduate.library.entity.toyardEntity;
import project.virus.graduate.library.requestdto.commentForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.imgForm;
import project.virus.graduate.library.requestdto.myYardForm;
import project.virus.graduate.library.requestdto.userInfoForm;

@Repository
public interface UserRepository {
	//用户信息更改
	public int profile(userInfoForm form);
	
	//上传图片
	public int upload(imgForm form);
	
	//图片信息更改
	public  int alter();
	
	//展示标记Story
	public List<briefyardEntity> showpinyard(idForm id);
	
	public int close(idForm form);
	
	public List<ShowYardEntity> showyard(idForm form);
	
	public int updateMyYard(myYardForm from);
	
	public int deleteMyYard(idForm form);
	
	public List<toyardEntity> showCommentToyardEntities(idForm form);
	
	public int updateCommentForm(commentForm form);
	
	public int deleteCommentForm(idForm form);
}
