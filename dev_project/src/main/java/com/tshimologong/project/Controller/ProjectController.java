package com.tshimologong.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@PutMapping("/update")
	public Project updateProject(@RequestBody Project project){
		return service.updateProject(project);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProject(@PathVariable long id){
		return service.deleteProject(id);
	}

}
