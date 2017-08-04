/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidRoleException extends Exception {

	public WhInvalidRoleException() {
		super();
	}

	public WhInvalidRoleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidRoleException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidRoleException(String message) {
		super(message);
	}

	public WhInvalidRoleException(Throwable cause) {
		super(cause);
	}


}
