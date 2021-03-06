package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobsService;
import kodlamaio.hrms.entities.concretes.Jobs;
import lombok.Data;
@Data
@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	
	private JobsService jobsService;

	@Autowired
	public JobsController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}
	
	@GetMapping("/getall")
	public List<Jobs> getall(){
		return this.jobsService.getall();
	}
	

}
