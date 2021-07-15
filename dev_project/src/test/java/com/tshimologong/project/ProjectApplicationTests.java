package com.tshimologong.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Stream;
import com.tshimologong.project.Entities.Project;
import com.tshimologong.project.Repository.ProjectRepo;
import com.tshimologong.project.Service.ProjectService;

@SpringBootTest
class ProjectApplicationTests {
	
	@Autowired
	private ProjectService service;
	@MockBean
	private ProjectRepo repo;

	@Test
	public void saveProejectTest() {
		Project p = new Project(1, "HTML", "2021/07/19");
		when(repo.save(p)).thenReturn(p);
		assertEquals(p, service.savePaject(p));
	}
	
	
	@Test
	public void getAllProjects() {
		when(repo.findAll()).thenReturn(Stream.of(new Project(1,"Nkwe", "Mapoulo")).collect(Collectors.toList()));
		assertEquals(1, service.getAllProject().size());
	}

}
