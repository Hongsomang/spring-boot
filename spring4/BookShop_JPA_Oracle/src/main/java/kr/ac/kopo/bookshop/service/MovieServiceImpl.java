package kr.ac.kopo.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bookshop.dao.MovieDao;
import kr.ac.kopo.bookshop.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao dao;
	
	@Override
	public List<Movie> list() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void add(Movie item) {
		// TODO Auto-generated method stub
		 dao.save(item);
	}

	@Override
	public Movie item(int movieId) {
		// TODO Auto-generated method stub
		return dao.findByMovieId(movieId);
	}

	@Override
	public void update(Movie item) {
		// TODO Auto-generated method stub
		dao.save(item);
	}

	@Override
	public void delete(int movieId) {
		// TODO Auto-generated method stub
		dao.deleteById(movieId);
	}

}
