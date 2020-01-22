package org.js.movie.review.domain;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ReviewVO {

	private int reviewId;
	private int movieId;
	private String content;
	private String writer;
	private int rating;
	private Date registerDate;

}
