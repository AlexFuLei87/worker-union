/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhStaffNotLoginException extends Exception {

	public WhStaffNotLoginException() {
		super();
	}

	public WhStaffNotLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhStaffNotLoginException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhStaffNotLoginException(String message) {
		super(message);
	}

	public WhStaffNotLoginException(Throwable cause) {
		super(cause);
	}


}
