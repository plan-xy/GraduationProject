package project.virus.graduate.library.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.CommentEntity;
import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.showUserEntity;
import project.virus.graduate.library.requestdto.VirusForm;
import project.virus.graduate.library.requestdto.arrayStoryForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.libraryForm;

@Repository
public interface AdminRepository {
	
	public List<CommentEntity> checkComment();
	
	public int adminYard(arrayStoryForm form); 
	
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
