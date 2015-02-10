/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.ibm.mqlight.api.impl.logging.logback;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/**
 * A logback filter for selecting MQ Light header type events. These are events that have been marked as a header. 
 */
public class HeaderFilter extends Filter<ILoggingEvent> {

  final static Marker HEADER_MARKER = MarkerFactory.getMarker("HEADER");
  
  @Override
  public FilterReply decide(ILoggingEvent event) {
    if (HEADER_MARKER == event.getMarker()) {
      return FilterReply.ACCEPT;
    } else {
      return FilterReply.DENY;
    }
  }
}