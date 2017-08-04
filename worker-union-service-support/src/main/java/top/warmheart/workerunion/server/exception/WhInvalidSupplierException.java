/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidSupplierException extends Exception {

	public WhInvalidSupplierException() {
		super();
	}

	public WhInvalidSupplierException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidSupplierException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidSupplierException(String message) {
		super(message);
	}

	public WhInvalidSupplierException(Throwable cause) {
		super(cause);
	}


}
