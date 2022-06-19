package project.virus.graduate.library.service;
//story接口

import java.util.List;

import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.LibraryPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.briefstoryEntity;
import project.virus.graduate.library.requestdto.selectedstoryForm;

public interface StoryService {
	
	public List<briefstoryEntity> getBriefstoryEntities(int page,int limit);
	
	//检索信息
	public List<briefstoryEntity> getselectedstory(selectedstoryForm form);
	
	//Story详细信息
	public LibraryEntity getLibraryEntity(int id);
	
	//Story图片
	public List<LibraryPicEntity> getlibLibraryPicEntities(int id);
	
	//记录总数
	public PageCount Page();

	public List<briefstoryEntity> getArrayStory(List<Integer> list);
}
