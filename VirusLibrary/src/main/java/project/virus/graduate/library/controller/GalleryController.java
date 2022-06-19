package project.virus.graduate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.carouselEntity;
import project.virus.graduate.library.service.GalleryService;

@RestController
@RequestMapping("/gallery/")
public class GalleryController {
	
	@Autowired
	private GalleryService galleryService;

	//轮播图
	@GetMapping("carousel")
	public List<carouselEntity> getCarouselEntities(){
		return galleryService.getCarouselEntities();
	}
}
