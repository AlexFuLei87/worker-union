/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhProjectApplicationExistException extends Exception {

	public WhProjectApplicationExistException() {
		super();
	}

	public WhProjectApplicationExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhProjectApplicationExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhProjectApplicationExistException(String message) {
		super(message);
	}

	public WhProjectApplicationExistException(Throwable cause) {
		super(cause);
	}


}
