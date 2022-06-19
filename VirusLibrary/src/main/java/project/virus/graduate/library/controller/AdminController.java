package project.virus.graduate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.CommentEntity;
import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.showUserEntity;
import project.virus.graduate.library.requestdto.VirusForm;
import project.virus.graduate.library.requestdto.arrayStoryForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.libraryForm;
import project.virus.graduate.library.service.AdminService;

@RestController
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private AdminService service;
		
	@GetMapping("showComment")
	public List<CommentEntity> showComment(){
		return service.checkComment();
	}
	@PostMapping("adminCommentDis")
	public int adminCommentDis(@RequestBody arrayStoryForm form) {
		return service.adminCommentDis(form);
	}
	@PostMapping("adminCommentUn")
	public int adminCommentUn(@RequestBody arrayStoryForm form) {
		return service.adminCommentUn(form);
	}
	

	@GetMapping("showYard")
	public List<ShowYardEntity> showYard(){
		return service.checkYard();
	}
	@PostMapping("adminYardDis")
	public int adminYardDis(@RequestBody arrayStoryForm form) {
		return service.adminYardDis(form);
	}
	@PostMapping("adminYardUn")
	public int adminYardUn(@RequestBody arrayStoryForm form) {
		return service.adminYardUn(form);
	}
	
	@PostMapping("clickyardDis")
	public int clickyardDis(@RequestBody idForm form) {
		return service.clickyardDis(form);
	}
	@PostMapping("clickyardUn")
	public int clickyardUn(@RequestBody idForm form) {
		return service.clickyardUn(form);			
	}
	@PostMapping("clickComDis")
	public int clickComDis(@RequestBody idForm form) {
		return service.clickComDis(form);
	}
	
	@PostMapping("clickComUn")
	public int clickComUn(@RequestBody idForm form) {
		return service.clickComUn(form);
	}
	
	@GetMapping("showUser")
	public List<showUserEntity>showUser(){
		return service.checkUser();
	}
	
	@PostMapping("userUp")
	public int userUp( @RequestBody idForm form) {
		
		return service.userUp(form);
	}

	@PostMapping("userDown")
	public int userDown( @RequestBody idForm form) {
	
		return service.userDown(form);
	}
	
	@PostMapping("checkVirus")
	public List<VirusEntity> checkVirus(){
		return service.checkVirus();
	}
	
	@PostMapping("checklibrary")
	public List<LibraryEntity> checklibrary(){
		return service.checklibrary();
	}
	
	@PostMapping("updateVirus")
	public int updateVirus(@RequestBody VirusForm form) {
		return service.updateVirus(form);
	}
	
	@PostMapping("updatelibrary")
	public int updatelibrary(@RequestBody libraryForm form) {
		return service.updatelibrary(form);
	}

	
	
}
