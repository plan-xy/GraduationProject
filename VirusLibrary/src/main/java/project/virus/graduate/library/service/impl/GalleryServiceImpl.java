package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.carouselEntity;
import project.virus.graduate.library.repository.GalleryRepository;
import project.virus.graduate.library.service.GalleryService;
@Service
public class GalleryServiceImpl implements GalleryService{

	@Autowired
	private GalleryRepository galleryRepository;
	

	//轮播图
	public List<carouselEntity> getCarouselEntities(){
		
		return galleryRepository.getCarouselEntities();
	}
}
