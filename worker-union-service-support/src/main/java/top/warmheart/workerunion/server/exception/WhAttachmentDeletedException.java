/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhAttachmentDeletedException extends Exception {

	public WhAttachmentDeletedException() {
		super();
	}

	public WhAttachmentDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhAttachmentDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhAttachmentDeletedException(String message) {
		super(message);
	}

	public WhAttachmentDeletedException(Throwable cause) {
		super(cause);
	}


}
