/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidFundPlanItemException extends Exception {

	public WhInvalidFundPlanItemException() {
		super();
	}

	public WhInvalidFundPlanItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidFundPlanItemException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidFundPlanItemException(String message) {
		super(message);
	}

	public WhInvalidFundPlanItemException(Throwable cause) {
		super(cause);
	}


}
