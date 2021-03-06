/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhAttachmentExistException extends Exception {

	public WhAttachmentExistException() {
		super();
	}

	public WhAttachmentExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhAttachmentExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhAttachmentExistException(String message) {
		super(message);
	}

	public WhAttachmentExistException(Throwable cause) {
		super(cause);
	}


}
