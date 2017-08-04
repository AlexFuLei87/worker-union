/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhMaterialTypeDeletedException extends Exception {

	public WhMaterialTypeDeletedException() {
		super();
	}

	public WhMaterialTypeDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhMaterialTypeDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhMaterialTypeDeletedException(String message) {
		super(message);
	}

	public WhMaterialTypeDeletedException(Throwable cause) {
		super(cause);
	}


}
