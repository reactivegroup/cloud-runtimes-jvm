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
 */
package group.rxcloud.cloudruntimes.domain.enhanced.sequencer;

import java.util.Map;

public class GetNextIdRequest {

    // Required. Name of sequencer storage
    private String storeName;
    // Required. key is the identifier of a sequencer namespace,e.g. "order_table".
    private String key;
    // (optional) SequencerOptions configures requirements for auto-increment guarantee
    private SequencerOptions options;
    // (optional) The metadata which will be sent to the component.
    private Map<String, String> metadata;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SequencerOptions getOptions() {
        return options;
    }

    public void setOptions(SequencerOptions options) {
        this.options = options;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "GetNextIdRequest{" +
                "storeName='" + storeName + '\'' +
                ", key='" + key + '\'' +
                ", options=" + options +
                ", metadata=" + metadata +
                '}';
    }
}
