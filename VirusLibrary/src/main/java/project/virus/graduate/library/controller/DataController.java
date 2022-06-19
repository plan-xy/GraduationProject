package project.virus.graduate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.virus.graduate.library.entity.data.frontChartdata;
import project.virus.graduate.library.entity.data.rankResultEntity;
import project.virus.graduate.library.service.DataService;

@RestController
@RequestMapping("/data/")
public class DataController {
	
	@Autowired
	private DataService dataService;
	
	@GetMapping("frontdata")
	public List<frontChartdata> getfrontdata() {
		return dataService.getFrontChartdata();
	}
	
	@GetMapping("rankEyenum")
	public List<rankResultEntity> rankEyenum(){
		return dataService.rankEyenum();
	}
	@GetMapping("rankR")
	public List<rankResultEntity> rankR(){
		return dataService.rankR();
	}
	@GetMapping("rankRate")
	public List<rankResultEntity> rankRate(){
		return dataService.rankRate();
	}
}
