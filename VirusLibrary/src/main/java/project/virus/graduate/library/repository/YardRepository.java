package project.virus.graduate.library.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.TalkyardEntity;
import project.virus.graduate.library.entity.briefyardEntity;
import project.virus.graduate.library.entity.toyardEntity;
import project.virus.graduate.library.entity.yardPicEntiry;
import project.virus.graduate.library.requestdto.PinYardForm;
import project.virus.graduate.library.requestdto.ReleaseYardForm;
import project.virus.graduate.library.requestdto.commentForm;
import project.virus.graduate.library.requestdto.idForm;
@Repository
public interface YardRepository {
	   //展示简略的讨论区域
		public List<briefyardEntity> getTalkyardEntities(@Param("start")int start,@Param("end")int end);
		
		//展示详细的讨论区域
		public TalkyardEntity getTalkyardEntity(int id); 
		
		//评论
		public List<toyardEntity> getToyardEntities(int id);
		
		//记录总数
		public PageCount Page();
		 //增加浏览
		 public int addEyeNum(idForm id);
		 
		 //增加
		 public int release(ReleaseYardForm form);
		 
		 //增加评论
		 public int  insertcomment(commentForm form);
		 
		 //标记
		 public int pinyard(PinYardForm form);
		 //取消标记
		 public int Notpinyard(PinYardForm form);
		 
		 //检测
		 public int Ispin(PinYardForm form);

		 public List<yardPicEntiry> getYardPic(idForm form);
}
