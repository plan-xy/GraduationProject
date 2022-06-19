package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.PageCount;
import project.virus.graduate.library.entity.TalkyardEntity;
import project.virus.graduate.library.entity.briefyardEntity;
import project.virus.graduate.library.entity.toyardEntity;
import project.virus.graduate.library.entity.yardPicEntiry;
import project.virus.graduate.library.repository.YardRepository;
import project.virus.graduate.library.requestdto.PinYardForm;
import project.virus.graduate.library.requestdto.ReleaseYardForm;
import project.virus.graduate.library.requestdto.commentForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.service.YardService;

@Service
public class YardServiceImpl implements YardService {
	
	@Autowired
	private YardRepository yardRepository;
		//展示简略的讨论区域
	@Override
		public List<briefyardEntity> getTalkyardEntities(int Page,int limit){
			Page = (Page -1) * limit;
			return yardRepository.getTalkyardEntities(Page,limit);
		}
		
		//展示详细的讨论区域
		@Override
		public TalkyardEntity getTalkyardEntity(int id) {
			return yardRepository.getTalkyardEntity(id);
		}
		
		//评论
		@Override
		public List<toyardEntity> getToyardEntities(int id){
			return yardRepository.getToyardEntities(id);
		}
		
		@Override
		public PageCount Page() {
			return yardRepository.Page(); 
		}
		
		@Override
		 public int addEyeNum(idForm id) {
			return yardRepository.addEyeNum(id);
		}
		
		@Override
		 public int release(ReleaseYardForm form) {
			return yardRepository.release(form);
		}
		
		@Override
		 public int  insertcomment(commentForm form) {
				return yardRepository.insertcomment(form);
			}
		@Override
		 public int pinyard( PinYardForm form) {
			return yardRepository.pinyard(form);
		}
		@Override
		 public int Notpinyard( PinYardForm form) {
			return yardRepository.Notpinyard(form);
		}
		 @Override
		 public int Ispin(PinYardForm form) {
		
			 return yardRepository.Ispin(form);
		 }
		 
		 @Override
		 public List<yardPicEntiry> getYardPic(idForm form){
			 return yardRepository.getYardPic(form);
		 }
}
