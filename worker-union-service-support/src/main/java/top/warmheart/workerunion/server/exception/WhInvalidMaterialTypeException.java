/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidMaterialTypeException extends Exception {

	public WhInvalidMaterialTypeException() {
		super();
	}

	public WhInvalidMaterialTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidMaterialTypeException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidMaterialTypeException(String message) {
		super(message);
	}

	public WhInvalidMaterialTypeException(Throwable cause) {
		super(cause);
	}


}
