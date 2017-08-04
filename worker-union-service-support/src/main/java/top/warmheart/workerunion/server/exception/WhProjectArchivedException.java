/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhProjectArchivedException extends Exception {

	public WhProjectArchivedException() {
		super();
	}

	public WhProjectArchivedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhProjectArchivedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhProjectArchivedException(String message) {
		super(message);
	}

	public WhProjectArchivedException(Throwable cause) {
		super(cause);
	}


}
