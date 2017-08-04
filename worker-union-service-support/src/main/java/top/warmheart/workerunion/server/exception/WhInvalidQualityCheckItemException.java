/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidQualityCheckItemException extends Exception {

	public WhInvalidQualityCheckItemException() {
		super();
	}

	public WhInvalidQualityCheckItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidQualityCheckItemException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidQualityCheckItemException(String message) {
		super(message);
	}

	public WhInvalidQualityCheckItemException(Throwable cause) {
		super(cause);
	}


}
