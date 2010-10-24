/*
 * Copyright (c) 2010. Axon Auction Example
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fuin.auction.command.api.exceptions;

import org.fuin.auction.command.api.support.VoidExceptionResult;

/**
 * Shared behavior for all command excaptions.
 */
public interface CommandException {

	/**
	 * Returns a system wide unique message id of this exception.
	 * 
	 * @return Unique exception message id.
	 */
	public int getMessageId();

	/**
	 * Converts the exception into a command result.
	 * 
	 * @return Command result.
	 */
	public VoidExceptionResult toResult();

}
