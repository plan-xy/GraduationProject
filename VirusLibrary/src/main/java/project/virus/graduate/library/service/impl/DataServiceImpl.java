package project.virus.graduate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.virus.graduate.library.entity.data.frontChartdata;
import project.virus.graduate.library.entity.data.rankResultEntity;
import project.virus.graduate.library.repository.DataRepository;
import project.virus.graduate.library.service.DataService;

@Service
public class DataServiceImpl implements DataService{
		
	@Autowired
	private DataRepository dataRepository;	
	
	@Override
	public List<frontChartdata> getFrontChartdata() {
		return dataRepository.getFrontChartdata();
	}
	
	@Override
	public List<rankResultEntity> rankEyenum(){
		return dataRepository.rankEyenum();
	}
	@Override
	public List<rankResultEntity> rankR(){
		return dataRepository.rankR();
	}
	@Override
	public List<rankResultEntity> rankRate(){
		return dataRepository.rankRate();
	}
}
