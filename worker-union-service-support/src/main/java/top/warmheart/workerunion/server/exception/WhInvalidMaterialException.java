/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidMaterialException extends Exception {

	public WhInvalidMaterialException() {
		super();
	}

	public WhInvalidMaterialException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidMaterialException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidMaterialException(String message) {
		super(message);
	}

	public WhInvalidMaterialException(Throwable cause) {
		super(cause);
	}


}
