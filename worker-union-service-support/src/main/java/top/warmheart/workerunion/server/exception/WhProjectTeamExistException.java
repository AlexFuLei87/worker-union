/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhProjectTeamExistException extends Exception {

	public WhProjectTeamExistException() {
		super();
	}

	public WhProjectTeamExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhProjectTeamExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhProjectTeamExistException(String message) {
		super(message);
	}

	public WhProjectTeamExistException(Throwable cause) {
		super(cause);
	}


}
