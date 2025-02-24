package com.teicenties.genericutility;

import java.time.LocalDateTime;

public class javaUtility {
	/**
	 * THIS METHOD WILL CAPTURE THE REAL TIME OR SYSTEMTIME1
	 * @return
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}

}
