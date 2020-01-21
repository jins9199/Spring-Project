package org.js.movie.movieinfo.domain;


import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieInfoVO {	
	private int movieId;
	private String title;
	private Date regDate;
	private String summary;
	private String poster;
	
	
}	