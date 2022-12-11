package com.api.mock.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	private static final String PATTER_DATE= "dd/MM/yyyy";
	
	public static String getStrDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTER_DATE);
		String dateResp = simpleDateFormat.format(date);
		return dateResp;
	}

}
