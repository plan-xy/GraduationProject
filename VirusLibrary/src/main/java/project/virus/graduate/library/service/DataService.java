package project.virus.graduate.library.service;

import java.util.List;

import project.virus.graduate.library.entity.data.frontChartdata;
import project.virus.graduate.library.entity.data.rankResultEntity;

public interface DataService {

	public List<frontChartdata> getFrontChartdata();
	
	public List<rankResultEntity> rankEyenum();
	public List<rankResultEntity> rankR();
	public List<rankResultEntity> rankRate();
}
