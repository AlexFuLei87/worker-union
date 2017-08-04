/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidContractException extends Exception {

	public WhInvalidContractException() {
		super();
	}

	public WhInvalidContractException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidContractException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidContractException(String message) {
		super(message);
	}

	public WhInvalidContractException(Throwable cause) {
		super(cause);
	}


}
