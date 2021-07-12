package com.tshimologong.project.service;

import com.tshimologong.project.model.Project;
import com.tshimologong.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public Project updateProject(Project project){
        Project existingProject = projectRepository.findById(project.getId()).orElse(null);
        existingProject.setName(project.getName());
        existingProject.setDate(project.getDate());
        return projectRepository.save(existingProject);
    }

    public String deleteProject(int id){
        projectRepository.deleteById(id);
        return "Project Deleted Successfully";
    }
}
