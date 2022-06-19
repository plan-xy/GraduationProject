package project.virus.graduate.library.service;

import java.util.List;

import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.SelectTypeEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.VirusPicEntity;
import project.virus.graduate.library.entity.briefvirusEntity;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.selectVirusForm;
//病毒相关信息接口
public interface VirusService {
	//选定的病毒的详细信息
	public VirusEntity virusInfo( int id);
	
	//简略病毒信息  
	public List<briefvirusEntity> briefvirusInfo(int Page,int limit);
	
	//筛选的病毒信息
	 public List<briefvirusEntity> selectedvirus(selectVirusForm form);
	 
	 //病毒的图片列表
	 public List<VirusPicEntity> getVirusPic(int id);
	 
		//记录总数
	 public PageCount Page();
	 
	 // 种类检索
	 public List<SelectTypeEntity> getShapeType();
	 public List<SelectTypeEntity> getStructType();
	 
	 //增加浏览
	 public int addEyeNum(idForm id);
	 
}
