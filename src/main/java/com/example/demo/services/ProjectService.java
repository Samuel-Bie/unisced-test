package com.example.demo.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exceptions.EntityNotFoundException;
import com.example.demo.models.Project;
import com.example.demo.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project findById(Long id) {
		return projectRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Project not foind"));
	}

	public List<Project> findAll() {
		return projectRepository.findAll();
	}

	@Transactional
	public Project save(Project project) {
		return projectRepository.save(project);
	}

	@Transactional
	public Project update(Long id, Project project) {

		Project retrieved = this.findById(id);
		BeanUtils.copyProperties(project, retrieved, "id");
		return retrieved;
	}

	@Transactional
	public void delete(Long id) {
		
		try {
			projectRepository.deleteById(id);
		}
		catch(EmptyResultDataAccessException exeception) {
			throw new EntityNotFoundException("project not found");
		}	
	}

}
