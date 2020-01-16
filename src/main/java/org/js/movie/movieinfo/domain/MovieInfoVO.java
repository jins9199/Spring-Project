package org.js.movie.movieinfo.domain;


import java.util.Date;

public class MovieInfoVO {
	
//	DROP TABLE tbl_movieinfo;
//
//	CREATE TABLE tbl_movieinfo (
//		id INT NOT NULL AUTO_INCREMENT, 
//		title VARCHAR(50) NOT NULL,
//		regDate TIMESTAMP NOT NULL DEFAULT NOW(),
//		summary VARCHAR(1000),
//		PRIMARY KEY(id)
//	);
//
//	INSERT INTO tbl_movieInfo (title, summary)
//		VALUES ('테스트제목1', 'gwjprpbkrpagkkgaggdskgsa[ogk[oewkgwgk[wgkw[gk[w[g[');
//	INSERT INTO tbl_movieInfo (title, summary)
//		VALUES ('테스트제목2', '242fgdhfzhrgrhrwafwqdfwwqghgghewhewhwehewhwgewgewgew');
//	INSERT INTO tbl_movieInfo (title, summary)
//		VALUES ('테스트제목3', 'yehhjahawfwqfwqfwqfwqfqffwqwqfwqq');
//	INSERT INTO tbl_movieInfo (title, summary)
//		VALUES ('테스트제목4', 'wehwagwqfwqrwqrwtwtwtwtqtwq');
//	INSERT INTO tbl_movieInfo (title, summary)
//		VALUES ('테스트제목5', 'grewhewhw22rwqtwtwtqwtwq');
		
	COMMIT;
	private int id;
	private String title;
	private Date regDate;
	private String summary;
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}