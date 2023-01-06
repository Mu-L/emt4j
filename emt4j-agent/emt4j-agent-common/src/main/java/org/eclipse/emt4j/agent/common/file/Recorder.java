/********************************************************************************
 * Copyright (c) 2022 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/
package org.eclipse.emt4j.agent.common.file;

import org.eclipse.emt4j.common.Dependency;

import java.io.IOException;

/**
 * <code>Recorder</code> record the dependency.
 */
public interface Recorder {
    /**
     * Record the dependency
     *
     * @param dependency dependency
     * @throws InterruptedException if InterruptedException occurred
     */
    void record(Dependency dependency) throws InterruptedException;

    /**
     * initialize Recorder
     *
     * @return true if success
     * @throws IOException if IO operation failed
     */
    boolean init() throws IOException;
}
