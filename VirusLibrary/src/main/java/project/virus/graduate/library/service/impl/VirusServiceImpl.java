package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.SelectTypeEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.VirusPicEntity;
import project.virus.graduate.library.entity.briefvirusEntity;
import project.virus.graduate.library.repository.VirusRepository;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.selectVirusForm;
import project.virus.graduate.library.service.VirusService;
@Service
public class VirusServiceImpl implements VirusService {
	
	@Autowired
	private VirusRepository virusRepository;
	
	//选定的病毒的详细信息
	@Override
	public VirusEntity virusInfo(int id) {
		
		return virusRepository.virusInfo(id);
	};
	
	//简略病毒信息：接口实现
	@Override
	public List<briefvirusEntity> briefvirusInfo(int Page,int limit) {
		int num = Page;
		Page = (Page -1) * limit;
		limit = num * limit;
		return virusRepository.briefvirusInfo(Page,limit);
	}
	
	//检索病毒的信息
	@Override
	 public List<briefvirusEntity> selectedvirus(selectVirusForm form ){
		 int page =  form.getPage();
		 int limit  = form.getLimit();
		 int num = page;
		 page = (page-1)*limit;
		 limit = num * limit;
		 form.setPage(page);
		 form.setLimit(limit);
		 return virusRepository.selectedvirus(form);
	 };
	 //病毒图片列表
		@Override
	 public List<VirusPicEntity> getVirusPic(int id){
		 return virusRepository.getVirusPic(id);
	 }
	 
		//记录总数
		@Override
		public PageCount Page() {
			return virusRepository.Page();
		}
		@Override
		public List<SelectTypeEntity> getShapeType() {
			
			return virusRepository.getShapeType();
		}
		@Override
		public List<SelectTypeEntity> getStructType() {
			
			return virusRepository.getStructType();
		}
		
		@Override
		 public int addEyeNum(idForm id) {
			return virusRepository.addEyeNum(id);
		}

}
