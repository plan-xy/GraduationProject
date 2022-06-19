package project.virus.graduate.library.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.NewsEntity;
import project.virus.graduate.library.entity.NewsItemEntity;
//这是消息模块的数据仓库
import project.virus.graduate.library.entity.NewsPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.requestdto.idForm;
@Repository
public interface NewsRepository {
	
	 //根据id得到的详细信息
	public NewsEntity getNews(int id);
	
	//得到该条消息的第一张图片列表，即表现的图片
	public List<NewsItemEntity> getItems(@Param("start")int start,@Param("end")int end);
	
	
	//NEws的图片列表
	public List<NewsPicEntity> getNewsPicEntities(int id);
	
	//记录总数
	public PageCount Page();
	
	 //增加浏览
	 public int addEyeNum(idForm id);
	
}
