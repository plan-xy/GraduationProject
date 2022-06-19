package project.virus.graduate.library.service;

import java.util.List;

import project.virus.graduate.library.entity.CommentEntity;
import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.showUserEntity;
import project.virus.graduate.library.requestdto.VirusForm;
import project.virus.graduate.library.requestdto.arrayStoryForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.libraryForm;

public interface AdminService {

		public List<CommentEntity> checkComment();
		
		public int adminCommentDis(arrayStoryForm form); 
		
		public int adminCommentUn(arrayStoryForm form); 

		public List<ShowYardEntity> checkYard();
		
		public int adminYardDis(arrayStoryForm form); 
		
		public int adminYardUn(arrayStoryForm form);
		
		public int clickyardDis(idForm form);
		
		public int clickyardUn(idForm form);		
		
		public int clickComDis(idForm form);
		
		public int clickComUn(idForm form);	
		
		public List<showUserEntity> checkUser();
		
		public int adminUserDis(idForm form); 
		
		public int adminUserUn(idForm form); 
		
		public int userUp(idForm form);
		
		public int userDown(idForm form);
		
		public List<VirusEntity> checkVirus();
		
		public List<LibraryEntity> checklibrary();
		
		public int updateVirus(VirusForm form);
		
		public int updatelibrary(libraryForm form);
		
}
