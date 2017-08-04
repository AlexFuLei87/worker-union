/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhSafetyCheckItemModifyDisabledException extends Exception {

	public WhSafetyCheckItemModifyDisabledException() {
		super();
	}

	public WhSafetyCheckItemModifyDisabledException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhSafetyCheckItemModifyDisabledException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhSafetyCheckItemModifyDisabledException(String message) {
		super(message);
	}

	public WhSafetyCheckItemModifyDisabledException(Throwable cause) {
		super(cause);
	}


}
