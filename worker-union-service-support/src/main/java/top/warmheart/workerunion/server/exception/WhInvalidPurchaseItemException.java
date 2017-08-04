/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidPurchaseItemException extends Exception {

	public WhInvalidPurchaseItemException() {
		super();
	}

	public WhInvalidPurchaseItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidPurchaseItemException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidPurchaseItemException(String message) {
		super(message);
	}

	public WhInvalidPurchaseItemException(Throwable cause) {
		super(cause);
	}


}
