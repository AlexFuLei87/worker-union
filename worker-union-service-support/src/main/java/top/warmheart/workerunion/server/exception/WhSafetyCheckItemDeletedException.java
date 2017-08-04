/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhSafetyCheckItemDeletedException extends Exception {

	public WhSafetyCheckItemDeletedException() {
		super();
	}

	public WhSafetyCheckItemDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhSafetyCheckItemDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhSafetyCheckItemDeletedException(String message) {
		super(message);
	}

	public WhSafetyCheckItemDeletedException(Throwable cause) {
		super(cause);
	}


}
