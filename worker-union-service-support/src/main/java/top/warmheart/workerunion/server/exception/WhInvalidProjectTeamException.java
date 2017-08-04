/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidProjectTeamException extends Exception {

	public WhInvalidProjectTeamException() {
		super();
	}

	public WhInvalidProjectTeamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidProjectTeamException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidProjectTeamException(String message) {
		super(message);
	}

	public WhInvalidProjectTeamException(Throwable cause) {
		super(cause);
	}


}
