/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhSubcontractorExistException extends Exception {

	public WhSubcontractorExistException() {
		super();
	}

	public WhSubcontractorExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhSubcontractorExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhSubcontractorExistException(String message) {
		super(message);
	}

	public WhSubcontractorExistException(Throwable cause) {
		super(cause);
	}


}
