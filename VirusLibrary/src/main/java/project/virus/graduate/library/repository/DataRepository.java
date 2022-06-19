package project.virus.graduate.library.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import project.virus.graduate.library.entity.data.frontChartdata;
import project.virus.graduate.library.entity.data.rankResultEntity;

@Repository
public interface DataRepository {
	
	public List<frontChartdata> getFrontChartdata();
	
	public List<rankResultEntity> rankEyenum();
	public List<rankResultEntity> rankR();
	public List<rankResultEntity> rankRate();
}
