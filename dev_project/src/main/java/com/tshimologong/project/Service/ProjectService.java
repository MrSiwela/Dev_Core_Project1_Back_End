package com.tshimologong.project.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tshimologong.project.Entities.Project;
import com.tshimologong.project.Repository.ProjectRepo;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepo repo;
	
	
	public Project savePaject(Project project) {
		return repo.save(project);
	}
	
	
	public List<Project> getAllProject(){
		List<Project> projects = new ArrayList<>();
		repo.findAll().forEach(projects::add);
		return projects;
	}
	
	public Project getProjectById(long id) {
		return repo.findProjectById(id);
	}

    public Project updateProject(Project project) {
		Project existingProject = repo.findById(project.getId()).orElse(null);
		existingProject.setName(project.getName());
		existingProject.setDueDate(project.getDueDate());
		return repo.save(existingProject);
    }

	public String deleteProject(long id) {
		repo.deleteById(id);
		return "Project Deleted Successfully.";
	}
}
