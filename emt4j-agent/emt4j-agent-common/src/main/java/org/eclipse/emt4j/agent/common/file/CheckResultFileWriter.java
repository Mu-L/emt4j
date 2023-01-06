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
import org.eclipse.emt4j.common.rule.ExecutableRule;
import org.eclipse.emt4j.common.rule.model.ReportCheckResult;

import java.io.IOException;


public interface CheckResultFileWriter {

    /**
     * Prepare the write to file,can do some initialization work.
     *
     * @throws IOException if IO operation failed
     */
    void begin() throws IOException;

    void write(Dependency dependency, ReportCheckResult checkResult, ExecutableRule rule) throws IOException;

    /**
     * close writer.Now only when there occurs a exception,the <code>close</code> will be called.
     * Normal case will not call <code>close</code>,so need flush file for each writing.
     *
     * @throws IOException if IO operation failed
     */
    void close() throws IOException;
}
