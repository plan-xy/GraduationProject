package project.virus.graduate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.TalkyardEntity;
import project.virus.graduate.library.entity.briefyardEntity;
import project.virus.graduate.library.entity.toyardEntity;
import project.virus.graduate.library.entity.yardPicEntiry;
import project.virus.graduate.library.requestdto.PageForm;
import project.virus.graduate.library.requestdto.PinYardForm;
import project.virus.graduate.library.requestdto.ReleaseYardForm;
import project.virus.graduate.library.requestdto.commentForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.service.YardService;

@RestController
@RequestMapping("/yard/")
public class YardController {
	
	@Autowired
	private YardService yardService;
	
	@PostMapping("briefyard")
	public List<briefyardEntity> getTalkyardEntities(@RequestBody PageForm form){
		return yardService.getTalkyardEntities(form.getPage(),form.getLimit());
	}
	@PostMapping("detailedyard")
	public TalkyardEntity getTalkyardEntity(@RequestBody idForm form) {
		return yardService.getTalkyardEntity(form.getId());
	}
	@PostMapping("toyard")
	public List<toyardEntity> getToyardEntities(@RequestBody idForm form){
		return yardService.getToyardEntities(form.getId()); 
	}
	@GetMapping("Page")
	public PageCount getPage() {
		return yardService.Page();
	}
	
	 //增加浏览
	@PostMapping("eyenum")
	 public int addEyeNum(@RequestBody idForm id) {
		return yardService.addEyeNum(id);
	}
	
	 
	 //增加
	@PostMapping("release")
	 public int release(@RequestBody ReleaseYardForm form) {
		return yardService.release(form);
	}
	
	 //增加评论
	@PostMapping("insertcomment")
	 public int  insertcomment(@RequestBody commentForm  form) {
		return yardService.insertcomment(form);
	}	 
	 //标记
	@PostMapping("pinyard")
	 public int pinyard(@RequestBody PinYardForm form) {
		return yardService.pinyard(form);
	}
	 //取消标记
	@PostMapping("notpinyard")
	 public int Notpinyard(@RequestBody PinYardForm form) {
		return yardService.Notpinyard(form);
	}

	 //检测
	@PostMapping("ispin")
	 public int Ispin(@RequestBody PinYardForm form) {
		return yardService.Ispin(form);
	}
	@PostMapping("liststorypic")
	 public List<yardPicEntiry> getYardPic(@RequestBody idForm form){
		 return yardService.getYardPic(form);
	 }
}
