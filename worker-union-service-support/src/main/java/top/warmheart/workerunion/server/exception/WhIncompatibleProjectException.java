/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhIncompatibleProjectException extends Exception {

	public WhIncompatibleProjectException() {
		super();
	}

	public WhIncompatibleProjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhIncompatibleProjectException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhIncompatibleProjectException(String message) {
		super(message);
	}

	public WhIncompatibleProjectException(Throwable cause) {
		super(cause);
	}


}
