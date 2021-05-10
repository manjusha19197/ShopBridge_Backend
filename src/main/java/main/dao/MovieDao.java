package main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.entity.MovieEntity;

@Repository
public interface MovieDao extends CrudRepository<MovieEntity, Integer>{

}
