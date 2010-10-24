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
package org.fuin.auction.command.server.base;

import org.fuin.auction.command.api.exceptions.UserEmailAlreadyExistException;
import org.fuin.auction.command.api.exceptions.UserNameAlreadyExistException;
import org.fuin.auction.command.api.exceptions.UserNameEmailCombinationAlreadyExistException;
import org.fuin.objects4j.EmailAddress;
import org.fuin.objects4j.UserName;

/**
 * Internal service for checking constraints that are not enforceable by the
 * domain model.
 */
public interface ConstraintSet {

	/**
	 * Checks if a user id/email combination already exists and adds it
	 * otherwise to the constraint set.<br>
	 * <br>
	 * The following conditions must be met:<br>
	 * <ul>
	 * <li>The user name / email couple does not exist</li>
	 * <li>The user name (with a different email) does not exist</li>
	 * <li>The email (with different user id) does not exist</li>
	 * </ul>
	 * 
	 * @param userName
	 *            User name to add.
	 * @param email
	 *            Email address to add.
	 * 
	 * @throws UserNameEmailCombinationAlreadyExistException
	 *             Exact combination of user/email is already registered.
	 * @throws UserNameAlreadyExistException
	 *             The user id is already in use by another user.
	 * @throws UserEmailAlreadyExistException
	 *             The email is already used for another user account.
	 */
	public void add(UserName userName, EmailAddress email)
	        throws UserNameEmailCombinationAlreadyExistException, UserNameAlreadyExistException,
	        UserEmailAlreadyExistException;

	/**
	 * Removes the user id and the email address) from the set.
	 * 
	 * @param userName
	 *            User name to remove.
	 * @param email
	 *            Email address to remove.
	 */
	public void remove(UserName userName, EmailAddress email);

}