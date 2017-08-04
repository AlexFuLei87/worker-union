/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhAttachmentAuditedException extends Exception {

	public WhAttachmentAuditedException() {
		super();
	}

	public WhAttachmentAuditedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhAttachmentAuditedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhAttachmentAuditedException(String message) {
		super(message);
	}

	public WhAttachmentAuditedException(Throwable cause) {
		super(cause);
	}


}
