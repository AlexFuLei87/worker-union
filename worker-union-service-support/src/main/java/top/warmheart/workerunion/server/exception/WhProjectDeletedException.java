/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhProjectDeletedException extends Exception {

	public WhProjectDeletedException() {
		super();
	}

	public WhProjectDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhProjectDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhProjectDeletedException(String message) {
		super(message);
	}

	public WhProjectDeletedException(Throwable cause) {
		super(cause);
	}


}
