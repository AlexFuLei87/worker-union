/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidSettlementItemException extends Exception {

	public WhInvalidSettlementItemException() {
		super();
	}

	public WhInvalidSettlementItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidSettlementItemException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidSettlementItemException(String message) {
		super(message);
	}

	public WhInvalidSettlementItemException(Throwable cause) {
		super(cause);
	}


}
