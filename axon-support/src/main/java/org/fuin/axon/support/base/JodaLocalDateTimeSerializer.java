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
package org.fuin.axon.support.base;

import java.io.IOException;

import org.fuin.serialver4j.hessian.BaseSerializer;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import com.caucho.hessian.io.AbstractHessianOutput;

/**
 * Serializes Joda {@link LocalDateTime} objects.
 */
public final class JodaLocalDateTimeSerializer extends BaseSerializer {

	@Override
	protected final void writeValue(final AbstractHessianOutput out, final Object obj)
	        throws IOException {
		final LocalDateTime localDateTime = (LocalDateTime) obj;
		final long millis = localDateTime.toDateTime(DateTimeZone.UTC).getMillis();
		out.writeUTCDate(millis);
	}

}
