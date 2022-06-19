package project.virus.graduate.library.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.LibraryPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.briefstoryEntity;
import project.virus.graduate.library.requestdto.selectedstoryForm;

@Repository
public interface StoryRepository {
	
	public List<briefstoryEntity> getBriefstoryEntities(@Param("start")int start,@Param("end")int end);
	
	//检索story信息
	public List<briefstoryEntity> getselectedstory(selectedstoryForm form);
	
	//Story详细信息
	public LibraryEntity getLibraryEntity(int id);
	
	//Story图片
	public List<LibraryPicEntity> getlibLibraryPicEntities(int id);
	
	//记录总数
	public PageCount Page();
	
	public List<briefstoryEntity> getArrayStory(List<Integer> list);
}
