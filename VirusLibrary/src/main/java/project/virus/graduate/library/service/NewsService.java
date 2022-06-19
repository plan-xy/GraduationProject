package project.virus.graduate.library.service;

import java.util.List;

import project.virus.graduate.library.entity.NewsEntity;
import project.virus.graduate.library.entity.NewsItemEntity;
import project.virus.graduate.library.entity.NewsPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.requestdto.idForm;

public interface NewsService {
	
	public NewsEntity getNews(int id);
	//获取新闻所有信息的接口
	public List<NewsItemEntity > getItems(int page,int limit);
	
	
	//News的图片列表
	public List<NewsPicEntity> getNewsPicEntities(int id);
	
	//记录总数
	public PageCount Page();
	
	 //增加浏览
	 public int addEyeNum(idForm id);
}
