package org.js.movie.movieinfo.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieInfoVO {
 
	private int movieID;
	private String title;
	private String starring;
	private String summary; 
	private String genre;
	private String writer;
	private String regDate;
	private int viewCnt;
	private String stillCut;
	private String thumbNail; 
	private String poster;
}