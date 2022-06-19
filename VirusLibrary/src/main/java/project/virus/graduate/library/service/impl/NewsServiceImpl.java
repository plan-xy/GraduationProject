package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.NewsEntity;
import project.virus.graduate.library.entity.NewsItemEntity;
import project.virus.graduate.library.entity.NewsPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.repository.NewsRepository;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.service.NewsService;
//数据服务实现部分
@Service
public class NewsServiceImpl  implements NewsService{
	@Autowired
	private NewsRepository newsRepository;
	
	//可以获取关于新闻的所有信息
	@Override
    public List<NewsItemEntity > getItems(int Page ,int limit){
		Page = (Page -1) * limit;
		return newsRepository.getItems(Page,limit);
	}
	@Override
	public NewsEntity getNews(int id) {
		return newsRepository.getNews(id);
	}
	
	//NEws的图片列表
	@Override
	public List<NewsPicEntity> getNewsPicEntities(int id){
		return newsRepository.getNewsPicEntities(id);
	}
	
	//记录总数
	@Override
	public PageCount Page() {
		return newsRepository.Page();
	}
	
	 //增加浏览
	@Override
	 public int addEyeNum(idForm id) {
		return newsRepository.addEyeNum(id);
	}
}
