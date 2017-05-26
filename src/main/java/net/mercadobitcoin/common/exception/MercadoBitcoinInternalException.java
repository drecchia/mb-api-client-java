/**
 * under the MIT License (MIT)
 * Copyright (c) 2015 Mercado Bitcoin Servicos Digitais Ltda.
 * @see more details in /LICENSE.txt
 */

package net.mercadobitcoin.common.exception;

/**
 * Mercado Bitocin generic exception type used in internal errors ( If its internal, should not be an checked exception ).
 */
public class MercadoBitcoinInternalException extends RuntimeException {

	private static final long serialVersionUID = 3299761335363609520L;

	public MercadoBitcoinInternalException(String message) {
		super(message);
	}

}
