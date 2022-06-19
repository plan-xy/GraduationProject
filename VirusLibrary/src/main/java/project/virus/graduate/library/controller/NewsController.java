package project.virus.graduate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.NewsEntity;
import project.virus.graduate.library.entity.NewsItemEntity;
import project.virus.graduate.library.entity.NewsPicEntity;
import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.requestdto.PageForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.service.NewsService;

@RestController
@RequestMapping("/news/")
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	@PostMapping("detailednews")
	public NewsEntity getNews(@RequestBody idForm form) {
			return newsService.getNews(form.getId());
	}
	
	//详细消息列表
	@PostMapping("briefnews")
	public List<NewsItemEntity> getItems(@RequestBody PageForm form){
		return newsService.getItems(form.getPage(),form.getLimit());
	}
	
	//获取news的图片列表
	@PostMapping("newspic")
	public List<NewsPicEntity> getNewsPicEntities(@RequestBody idForm form){
		return newsService.getNewsPicEntities(form.getId());
	}
	@GetMapping("Page")
	public PageCount getPage() {
		return newsService.Page();
	}
	 //增加浏览
	@PostMapping("eyenum")
	 public int addEyeNum(@RequestBody idForm id) {
		return newsService.addEyeNum(id);
	}
}
