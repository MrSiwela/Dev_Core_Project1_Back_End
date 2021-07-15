package com.tshimologong.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tshimologong.project.Entities.Project;

public interface ProjectRepo extends JpaRepository<Project, Long> {

	Project findProjectById(long id);

}
