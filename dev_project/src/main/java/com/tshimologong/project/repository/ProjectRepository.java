package com.tshimologong.project.repository;

import com.tshimologong.project.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {


}