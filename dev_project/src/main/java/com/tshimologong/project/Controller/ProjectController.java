package com.tshimologong.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tshimologong.project.Entities.Project;
import com.tshimologong.project.Service.ProjectService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/api/projects/")
@Slf4j
public class ProjectController {
	
	@Autowired
	private ProjectService service;
	
	@PostMapping("/")
	public Project saveProject(@RequestBody Project project) {
		log.info("Inside the saveProject method of the Project Controller ");
		return service.savePaject(project);
	}
	
	@GetMapping("/")
	public List<Project> getAllProjects(){
		log.info("Inside the getAllProjects method of the Project Controller ");
		return service.getAllProject();
	}
	
	@GetMapping("/{id}")
	public Project getProjectById(@PathVariable long id) {
		log.info("Inside the getProjectById method of the Project Controller ");
		return service.getProjectById(id);
	}

}
