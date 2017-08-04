/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidSubcontractorException extends Exception {

	public WhInvalidSubcontractorException() {
		super();
	}

	public WhInvalidSubcontractorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidSubcontractorException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidSubcontractorException(String message) {
		super(message);
	}

	public WhInvalidSubcontractorException(Throwable cause) {
		super(cause);
	}


}
