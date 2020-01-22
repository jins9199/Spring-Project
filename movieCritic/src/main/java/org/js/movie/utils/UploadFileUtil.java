package org.js.movie.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

import net.coobird.thumbnailator.Thumbnails;

public class UploadFileUtil {
	
	static final int THUMB_WIDTH = 300;
	static final int THUMB_HEIGHT = 300;
	
	public static String fileUpload(String uploadPath,
			String fileName,
	        byte[] fileData, String ymdPath) throws Exception {

		UUID uid = UUID.randomUUID();
	  
		String newFileName = uid + "_" + fileName; // uid_fileName
	    String imgPath = uploadPath + ymdPath;	//uploadPath (bean설정한 절대경로) ymdPath?

	    File target = new File(imgPath, newFileName); // 파일경로,파일명으로 새로운 파일 생성.
	    FileCopyUtils.copy(fileData, target); // 카피
	  
	    String thumbFileName = "s_" + newFileName; //썸파일네임.. s_newFileName
	    File image = new File(imgPath + File.separator + newFileName); //image 파일생성 절대경로에 파일구분자 추가.

	    File thumbnail = new File(imgPath + File.separator + "s" + File.separator + thumbFileName); // ""

	    if (image.exists()) {
	    	thumbnail.getParentFile().mkdirs(); //썸네일의 부모파일을 얻고 디렉토리를 만듬.
	    	Thumbnails.of(image).size(THUMB_WIDTH, THUMB_HEIGHT).toFile(thumbnail); //이미지 사이즈 제한해서 파일로..
	    }
	     return newFileName;
	 }

	 public static String calcPath(String uploadPath) {
	  Calendar cal = Calendar.getInstance();
	  String yearPath = File.separator + cal.get(Calendar.YEAR);
	  String monthPath = yearPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
	  String datePath = monthPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.DATE));

	  makeDir(uploadPath, yearPath, monthPath, datePath); //폴더 나누는 기준 (,)
	  makeDir(uploadPath, yearPath, monthPath, datePath + "\\s");

	  return datePath;
	 }

	 private static void makeDir(String uploadPath, String... paths) {

	  if (new File(paths[paths.length - 1]).exists()) { return; }

	  for (String path : paths) {
	   File dirPath = new File(uploadPath + path);

	   if (!dirPath.exists()) {
	    dirPath.mkdir();
	   }
	  }
	 }
	 
}
