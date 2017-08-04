/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhRoleDeletedException extends Exception {

	public WhRoleDeletedException() {
		super();
	}

	public WhRoleDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhRoleDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhRoleDeletedException(String message) {
		super(message);
	}

	public WhRoleDeletedException(Throwable cause) {
		super(cause);
	}


}
