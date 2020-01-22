package org.js.movie.rating.domain;

import java.util.Date;

public class RatingVO {

	private int id;
	private int movieID;
	private String content;
	private String writer;
	private Date regDate;
	private int rating;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the movie_id
	 */
	public int getMovieID() {
		return movieID;
	}
	/**
	 * @param movie_id the movie_id to set
	 */
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @return the regDate
	 */
	public Date getRegDate() {
		return regDate;
	}
	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "RatingVO [id=" + id + ", movieID=" + movieID + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + ", rating=" + rating + "]";
	}
		
}
