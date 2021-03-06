/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.core.source;

import lombok.*;

import static org.apache.skywalking.oap.server.core.source.DefaultScopeDefine.SEGMENT;

/**
 * @author peng-yongsheng
 */
@ScopeDeclaration(id = SEGMENT, name = "Segment")
public class Segment extends Source {

    @Override public int scope() {
        return DefaultScopeDefine.SEGMENT;
    }

    @Override public String getEntityId() {
        return segmentId;
    }

    @Setter @Getter private String segmentId;
    @Setter @Getter private String traceId;
    @Setter @Getter private int serviceId;
    @Setter @Getter private int serviceInstanceId;
    @Setter @Getter private String endpointName;
    @Setter @Getter private int endpointId;
    @Setter @Getter private long startTime;
    @Setter @Getter private long endTime;
    @Setter @Getter private int latency;
    @Setter @Getter private int isError;
    @Setter @Getter private byte[] dataBinary;
    @Setter @Getter private int version;
}
