package kr.ac.kopo;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
	
	public String msg() {
		return "World";
	}

}
