/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhSettlementItemExistException extends Exception {

	public WhSettlementItemExistException() {
		super();
	}

	public WhSettlementItemExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhSettlementItemExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhSettlementItemExistException(String message) {
		super(message);
	}

	public WhSettlementItemExistException(Throwable cause) {
		super(cause);
	}


}
