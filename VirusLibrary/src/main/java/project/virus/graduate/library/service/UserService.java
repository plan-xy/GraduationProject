package project.virus.graduate.library.service;

import java.util.List;

import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.briefstoryEntity;
import project.virus.graduate.library.entity.briefyardEntity;
import project.virus.graduate.library.entity.toyardEntity;
import project.virus.graduate.library.requestdto.commentForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.imgForm;
import project.virus.graduate.library.requestdto.myYardForm;
import project.virus.graduate.library.requestdto.userInfoForm;

public interface UserService {
	
	//用户信息更改
	public int profile(userInfoForm form);
	
	//上传图片
	public int upload(imgForm form);
	
	//图片信息更改
//	public  int alter();
	
	//展示标记病毒信息
//	public List<briefvirusEntity> showpinvirus();
	
	//展示标记Story
	public List<briefyardEntity> showpinyard(idForm id);
	
	public int close(idForm form);
	
	public List<ShowYardEntity> showyard(idForm form);
	
	public int updateMyYard(myYardForm from);
	
	public int deleteMyYard(idForm form);
	
	public List<toyardEntity> showCommentToyardEntities(idForm form);
	
	public int updateCommentForm(commentForm form);
	
	public int deleteCommentForm(idForm  form);
}
