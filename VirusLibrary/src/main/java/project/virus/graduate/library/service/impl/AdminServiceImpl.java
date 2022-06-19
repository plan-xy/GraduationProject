package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.CommentEntity;
import project.virus.graduate.library.entity.LibraryEntity;
import project.virus.graduate.library.entity.ShowYardEntity;
import project.virus.graduate.library.entity.VirusEntity;
import project.virus.graduate.library.entity.showUserEntity;
import project.virus.graduate.library.repository.AdminRepository;
import project.virus.graduate.library.requestdto.VirusForm;
import project.virus.graduate.library.requestdto.arrayStoryForm;
import project.virus.graduate.library.requestdto.idForm;
import project.virus.graduate.library.requestdto.libraryForm;
import project.virus.graduate.library.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
		@Autowired
		private AdminRepository repository;

		@Override
		public List<CommentEntity> checkComment() {
			return repository.checkComment();
		}
		
		@Override
		public int adminCommentDis(arrayStoryForm form) {
			return repository.adminCommentDis(form);
		}
		@Override
		public int adminCommentUn(arrayStoryForm form) {
			return repository.adminCommentUn(form);
		}
		
		@Override
		public List<ShowYardEntity> checkYard() {
			return repository.checkYard();
		}
		@Override
		public int adminYardDis(arrayStoryForm form) {
			return repository.adminYardDis(form);
		}
		@Override
		public int adminYardUn(arrayStoryForm form) {
			return repository.adminYardUn(form);
		}
		@Override
		public int clickyardDis(idForm form) {
			return repository.clickyardDis(form);
		}
		@Override
		public int clickyardUn(idForm form) {
			return repository.clickyardUn(form);			
		}
		@Override
		public int clickComDis(idForm form) {
			return repository.clickComDis(form);
		}
		@Override
		public int clickComUn(idForm form) {
			return repository.clickComUn(form);
		}
		@Override
		public List<showUserEntity> checkUser(){
			return repository.checkUser();
		}
		@Override
		public int adminUserDis(idForm form) {
			return repository.adminUserDis(form);
		}
		@Override
		public int adminUserUn(idForm form) {
			return repository.adminUserUn(form);
		}

		@Override
		public int userUp(idForm form) {
			// TODO Auto-generated method stub
			return repository.userUp(form);
		}

		@Override
		public int userDown(idForm form) {
			
			return repository.userDown(form);
		}
		
		@Override
		public List<VirusEntity> checkVirus(){
			return repository.checkVirus();
		}
		
		@Override
		public List<LibraryEntity> checklibrary(){
			return repository.checklibrary();
		}
		
		@Override
		public int updateVirus(VirusForm form) {
			return repository.updateVirus(form);
		}
		
		@Override
		public int updatelibrary(libraryForm form) {
			return repository.updatelibrary(form);
		}

}
