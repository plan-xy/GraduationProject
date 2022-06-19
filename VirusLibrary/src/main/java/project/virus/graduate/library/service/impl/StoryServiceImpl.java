package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.LibraryPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.briefstoryEntity;
import project.virus.graduate.library.repository.StoryRepository;
import project.virus.graduate.library.requestdto.selectedstoryForm;
import project.virus.graduate.library.service.StoryService;
//StoryService 的实现类
@Service
public class StoryServiceImpl implements StoryService{
	
	@Autowired
	private StoryRepository repository;
	@Override
	public List<briefstoryEntity> getBriefstoryEntities(int Page,int limit){

		Page = (Page -1) * limit;
		return repository.getBriefstoryEntities(Page,limit);
	}
	@Override
	public List<briefstoryEntity> getselectedstory(selectedstoryForm form){
		return repository.getselectedstory(form);
	}
	
	//Story详细信息
	@Override
	public LibraryEntity getLibraryEntity(int id) {
		return repository.getLibraryEntity(id);
	}
	
	//Story图片
	@Override
	public List<LibraryPicEntity> getlibLibraryPicEntities(int id){
		
		return repository.getlibLibraryPicEntities(id);
	}
	
	//记录总数
	@Override
	public PageCount Page() {
		return repository.Page();
	}
	@Override
	public List<briefstoryEntity> getArrayStory(List<Integer> list){
		return repository.getArrayStory(list);
	}
}
