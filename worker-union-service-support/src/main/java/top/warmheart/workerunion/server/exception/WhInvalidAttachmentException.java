/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidAttachmentException extends Exception {

	public WhInvalidAttachmentException() {
		super();
	}

	public WhInvalidAttachmentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidAttachmentException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidAttachmentException(String message) {
		super(message);
	}

	public WhInvalidAttachmentException(Throwable cause) {
		super(cause);
	}


}
