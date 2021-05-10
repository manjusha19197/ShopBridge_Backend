package main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import main.entity.MovieEntity;
import main.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService service;
	
	
	@PostMapping("/addMovieDetails")
	private String addMovieDetails(@RequestBody MovieEntity movie) {
		service.saveMovie(movie);
		return "Movie details saved successfully";
	}
	
	@GetMapping("/getAllMoviesDetails")
	private List<MovieEntity> getAllMoviesDetails() {
		return service.getAll();
    }
	
	@GetMapping("/getMovieById/{id}")
	private Optional<MovieEntity> getMovieById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@DeleteMapping("/deleteMovieDetails/{id}")
	private ResponseEntity<String> deleteMovieDetails(@PathVariable int id) {
		service.deleteById(id);
		String msg = "deleted";
		return new ResponseEntity<String>(msg, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PutMapping("/editMovieDetails")
	private String editMovieDetails(@RequestBody MovieEntity movie) {
		service.editMovie(movie);
        return "Movie Details updated successfully";
	}
}
