/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidTeamRoleException extends Exception {

	public WhInvalidTeamRoleException() {
		super();
	}

	public WhInvalidTeamRoleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidTeamRoleException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidTeamRoleException(String message) {
		super(message);
	}

	public WhInvalidTeamRoleException(Throwable cause) {
		super(cause);
	}


}
