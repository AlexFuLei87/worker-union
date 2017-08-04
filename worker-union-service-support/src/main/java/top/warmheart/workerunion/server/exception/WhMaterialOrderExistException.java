/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhMaterialOrderExistException extends Exception {

	public WhMaterialOrderExistException() {
		super();
	}

	public WhMaterialOrderExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhMaterialOrderExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhMaterialOrderExistException(String message) {
		super(message);
	}

	public WhMaterialOrderExistException(Throwable cause) {
		super(cause);
	}


}
