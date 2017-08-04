/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhStaffJobNoExistException extends Exception {

	public WhStaffJobNoExistException() {
		super();
	}

	public WhStaffJobNoExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhStaffJobNoExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhStaffJobNoExistException(String message) {
		super(message);
	}

	public WhStaffJobNoExistException(Throwable cause) {
		super(cause);
	}


}
