/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhProjectCollapsedException extends Exception {

	public WhProjectCollapsedException() {
		super();
	}

	public WhProjectCollapsedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhProjectCollapsedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhProjectCollapsedException(String message) {
		super(message);
	}

	public WhProjectCollapsedException(Throwable cause) {
		super(cause);
	}


}
