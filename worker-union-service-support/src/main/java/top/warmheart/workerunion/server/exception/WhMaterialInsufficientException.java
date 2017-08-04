/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhMaterialInsufficientException extends Exception {

	public WhMaterialInsufficientException() {
		super();
	}

	public WhMaterialInsufficientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhMaterialInsufficientException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhMaterialInsufficientException(String message) {
		super(message);
	}

	public WhMaterialInsufficientException(Throwable cause) {
		super(cause);
	}


}
