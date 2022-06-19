package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.briefyardEntity;
import project.virus.graduate.library.entity.toyardEntity;
import project.virus.graduate.library.repository.UserRepository;
import project.virus.graduate.library.requestdto.commentForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.imgForm;
import project.virus.graduate.library.requestdto.myYardForm;
import project.virus.graduate.library.requestdto.userInfoForm;
import project.virus.graduate.library.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	//用户信息更改
	@Autowired
	private UserRepository repository;
	
	public int profile(userInfoForm form) {
		
		return repository.profile(form); 
	}
	
	//上传图片
	public int upload(imgForm form) {
		return repository.upload(form);
	}
	
	//图片信息更改
//	public  int alter();
	
	//展示标记病毒信息
//	public List<briefvirusEntity> showpinvirus();
	
	//展示标记Story
	public List<briefyardEntity> showpinyard(idForm id){
		return repository.showpinyard(id);
	}

	@Override
	public int close(idForm form) {
		// TODO Auto-generated method stub
		return repository.close(form);
	}
	
	@Override
	public List<ShowYardEntity> showyard(idForm form){
		
		return repository.showyard(form);
	}
	@Override
	public int updateMyYard(myYardForm from) {
		return repository.updateMyYard(from);
	}
	@Override	
	public int deleteMyYard(idForm form) {
		return repository.deleteMyYard(form);
	}
	@Override	
	public List<toyardEntity> showCommentToyardEntities(idForm form){
		return repository.showCommentToyardEntities(form);
	}
	@Override	
	public int updateCommentForm(commentForm form) {
		return repository.updateCommentForm(form);
	}
	@Override	
	public int deleteCommentForm(idForm form) {
		return repository.deleteCommentForm(form);
	}
}
