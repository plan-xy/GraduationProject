package project.virus.graduate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.briefyardEntity;
import project.virus.graduate.library.entity.toyardEntity;
import project.virus.graduate.library.requestdto.commentForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.imgForm;
import project.virus.graduate.library.requestdto.myYardForm;
import project.virus.graduate.library.requestdto.userInfoForm;
import project.virus.graduate.library.service.UserService;

@RestController
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("profile")
	public int  profileRevise(@RequestBody userInfoForm form) {
		
		return service.profile(form);
	}
	
	@PostMapping("upload")
	public int avaterUpload(@RequestBody imgForm form) {
			return service.upload(form);
	}
	
	@PostMapping("showpinyard")
	public List<briefyardEntity> showpinyard(@RequestBody idForm  id){
		return service.showpinyard(id);
	}
	
	@PostMapping("close")
	public int close(@RequestBody idForm form) {
		return service.close(form);
	}
	
	@PostMapping("showMyYard")
	public List<ShowYardEntity> showyard(@RequestBody idForm form){
		return service.showyard(form);
	}
	
	@PostMapping("updateMyYard")
	public int updateMyYard( @RequestBody myYardForm from) {
		return service.updateMyYard(from);
	}
	@PostMapping("deleteMyYard")
	public int deleteMyYard(@RequestBody  idForm form) {
		return service.deleteMyYard(form);
	}
	@PostMapping("showCommentToyardEntities")
	public List<toyardEntity> showCommentToyardEntities(@RequestBody idForm form){
		return service.showCommentToyardEntities(form);
	}
	@PostMapping("updateCommentForm")
	public int updateCommentForm(@RequestBody commentForm form) {
		return service.updateCommentForm(form);
	}
	@PostMapping("deleteCommentForm")
	public int deleteCommentForm(@RequestBody idForm form) {
		return service.deleteCommentForm(form);
	}
}
