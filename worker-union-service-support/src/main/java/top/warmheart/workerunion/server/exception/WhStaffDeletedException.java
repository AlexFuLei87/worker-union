/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhStaffDeletedException extends Exception {

	public WhStaffDeletedException() {
		super();
	}

	public WhStaffDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhStaffDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhStaffDeletedException(String message) {
		super(message);
	}

	public WhStaffDeletedException(Throwable cause) {
		super(cause);
	}


}
