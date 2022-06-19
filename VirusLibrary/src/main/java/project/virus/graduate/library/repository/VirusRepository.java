package project.virus.graduate.library.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.SelectTypeEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.VirusPicEntity;
import project.virus.graduate.library.entity.briefvirusEntity;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.selectVirusForm;
@Repository
public interface VirusRepository {
	//单个病毒的文本信息
	 public VirusEntity virusInfo(@Param("id")int id);
	 
	 //简略病毒列表
	 public List<briefvirusEntity> briefvirusInfo(@Param("start")int start,@Param("end")int end);
	 
	 //筛选出的简略信息
	 public List<briefvirusEntity> selectedvirus(selectVirusForm form);
	 
	 //病毒图片列表
	 public List<VirusPicEntity> getVirusPic(@Param("id")int id);
	 
		//记录总数
	 public PageCount Page();
		
		//种类获取
	  public List<SelectTypeEntity> getShapeType();
	  public List<SelectTypeEntity> getStructType();
	  
		 //增加浏览
	  public int addEyeNum(idForm id);
}
