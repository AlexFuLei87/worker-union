/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhStaffCannotDeleteException extends Exception {

	public WhStaffCannotDeleteException() {
		super();
	}

	public WhStaffCannotDeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhStaffCannotDeleteException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhStaffCannotDeleteException(String message) {
		super(message);
	}

	public WhStaffCannotDeleteException(Throwable cause) {
		super(cause);
	}


}
