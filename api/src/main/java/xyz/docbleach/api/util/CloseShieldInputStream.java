package xyz.docbleach.api.util;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Proxy stream that prevents the underlying input stream from being closed.
 * <p>
 * This class is typically used in cases where an input stream needs to be
 * passed to a component that wants to explicitly close the stream even if
 * more input would still be available to other components.
 * <p>
 * JavaDoc copied from the Apache Commons-IO project, with code changed to match our dependencies.
 * file: org.apache.commons.io.input.CloseShieldInputStream.java
 */
public class CloseShieldInputStream extends FilterInputStream {

    public CloseShieldInputStream(InputStream inStream) {
        super(inStream);
    }

    @Override
    public void close() throws IOException {
        // no-action
    }

    public void _close() throws IOException {
        super.close();
    }
}