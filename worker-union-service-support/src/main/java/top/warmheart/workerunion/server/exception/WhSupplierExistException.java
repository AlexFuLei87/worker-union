/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhSupplierExistException extends Exception {

	public WhSupplierExistException() {
		super();
	}

	public WhSupplierExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhSupplierExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhSupplierExistException(String message) {
		super(message);
	}

	public WhSupplierExistException(Throwable cause) {
		super(cause);
	}


}
