package project.virus.graduate.library.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.carouselEntity;

@Repository
public interface GalleryRepository {
	//轮播图
	public List<carouselEntity> getCarouselEntities();
}
