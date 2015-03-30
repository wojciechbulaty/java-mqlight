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
package com.ibm.mqlight.api.impl.engine;

import com.ibm.mqlight.api.ClientException;
import com.ibm.mqlight.api.impl.Message;

public class OpenResponse extends Message {

    public final OpenRequest request;
    public final EngineConnection connection;
    public final ClientException exception;
    
    public OpenResponse(OpenRequest request, EngineConnection connection) {
        this.request = request;
        this.connection = connection;
        this.exception = null;
    }
    
    public OpenResponse(OpenRequest request, ClientException exception) {
        this.request = request;
        this.connection = null;
        this.exception = exception;
    }
}