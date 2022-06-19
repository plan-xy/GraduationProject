package project.virus.graduate.library.controller;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.SelectTypeEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.VirusPicEntity;
import project.virus.graduate.library.entity.briefvirusEntity;
import project.virus.graduate.library.requestdto.PageForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.selectVirusForm;
import project.virus.graduate.library.service.VirusService;

/**
 * 病毒信息相关控制层
 */
@RestController
@RequestMapping("/virus/")
public class ViursController {
	@Autowired
	private VirusService virusService;
	//展示病毒表的信息
	@PostMapping("detailedvirus")
	public VirusEntity virusInfo(@RequestBody idForm form){
		return virusService.virusInfo(form.getId());
	}
	//筛选病毒信息
	@PostMapping("selectedvirus")
	 public List<briefvirusEntity> selectedvirus(@RequestBody selectVirusForm form){
		 return virusService.selectedvirus(form);
	 }
	 
	//展示简略的病毒信息（添加分页）
	@PostMapping("briefvirus")
	public List<briefvirusEntity> briefvirusInfo(@RequestBody PageForm form){
		
		return virusService.briefvirusInfo(form.getPage(),form.getLimit());
	}
	//详细病毒的图片列表
	@PostMapping("viruspic")
	public List<VirusPicEntity> getVirusPic(@RequestBody idForm form){
		return virusService.getVirusPic(form.getId());
	}
	//获取页数
	@GetMapping("Page")
	public PageCount getPage() {
		return virusService.Page();
	}
	//获取种类
	@GetMapping("ShapeType")
	public List<SelectTypeEntity> getShapeType() {
		
		return virusService.getShapeType();
	}
	@GetMapping("StructType")
	public List<SelectTypeEntity> getStructType() {
		
		return virusService.getStructType();
	}

	 //增加浏览
	@PostMapping("eyenum")
	 public int addEyeNum(@RequestBody idForm id) {
		return virusService.addEyeNum(id);
	}
}
