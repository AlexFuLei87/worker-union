/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhMaterialTypeExistException extends Exception {

	public WhMaterialTypeExistException() {
		super();
	}

	public WhMaterialTypeExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhMaterialTypeExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhMaterialTypeExistException(String message) {
		super(message);
	}

	public WhMaterialTypeExistException(Throwable cause) {
		super(cause);
	}


}
