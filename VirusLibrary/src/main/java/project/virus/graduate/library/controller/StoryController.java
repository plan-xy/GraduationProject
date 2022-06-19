package project.virus.graduate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * story的管理层
 * */

import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.LibraryPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.briefstoryEntity;
import project.virus.graduate.library.requestdto.PageForm;
import project.virus.graduate.library.requestdto.arrayStoryForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.selectedstoryForm;
import project.virus.graduate.library.service.StoryService;
//story 的控制类

@RestController
@RequestMapping("/story/")
public class StoryController {
	//依赖注入DI	
	@Autowired
	private StoryService service;
	
	//获取story列表	
	@PostMapping("briefstory")
	public List<briefstoryEntity> getBriefstoryEntities(@RequestBody PageForm form){
		
		return service.getBriefstoryEntities(form.getPage(),form.getLimit());
	}
	//搜索
	@PostMapping("selectedstory")
	public List<briefstoryEntity> getselectedstory(@RequestBody selectedstoryForm form){
		
		return service.getselectedstory(form);
	}
	//获取详细的信息
	@PostMapping("detailedstory")
	public LibraryEntity getLibraryEntity(@RequestBody  idForm form) {
		return service.getLibraryEntity(form.getId());
	}
	//获取图片
	@PostMapping("storypic")
	public List<LibraryPicEntity> getLibraryPicEntities(@RequestBody idForm form){
		return service.getlibLibraryPicEntities(form.getId());
	}
	@GetMapping("Page")
	public PageCount getPage() {
		return service.Page();
	}
	
	@PostMapping("storylist")
	public List<briefstoryEntity> getArrayStory(@RequestBody arrayStoryForm form){
		return service.getArrayStory(form.getList());
	}
}
