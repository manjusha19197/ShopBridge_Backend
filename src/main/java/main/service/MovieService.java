package main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.MovieDao;
import main.entity.MovieEntity;

@Service
public class MovieService {

	@Autowired
	private MovieDao dao;
	
	public MovieEntity saveMovie(MovieEntity movie) {
		return dao.save(movie);
	}

	public List<MovieEntity> getAll() {
		Iterable<MovieEntity> itr = dao.findAll();
	     List<MovieEntity> list = new ArrayList<MovieEntity>(); 
	     for(MovieEntity movie : itr) {
	    	 list.add(movie);
	     }
		return list;
	}

	public Optional<MovieEntity> getById(int id) {
		return dao.findById(id);
	}

	public void deleteById(int id) {
		dao.deleteById(id);
	}

	public void editMovie(MovieEntity movie) {
		dao.save(movie);
	}
}
