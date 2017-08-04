/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhSupplierDeletedException extends Exception {

	public WhSupplierDeletedException() {
		super();
	}

	public WhSupplierDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhSupplierDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhSupplierDeletedException(String message) {
		super(message);
	}

	public WhSupplierDeletedException(Throwable cause) {
		super(cause);
	}


}
