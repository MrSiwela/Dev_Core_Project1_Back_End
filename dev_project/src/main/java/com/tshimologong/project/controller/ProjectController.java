package com.tshimologong.project.controller;


import com.tshimologong.project.model.Project;
import com.tshimologong.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projectapi")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @DeleteMapping("/deleteProject/{id}")
    public String deleteProject(@PathVariable int id){
        return projectService.deleteProject(id);
    }

    @PutMapping("/updateProject")
    public Project updateProject(@RequestBody Project project){
        return projectService.updateProject(project);
    }
}
