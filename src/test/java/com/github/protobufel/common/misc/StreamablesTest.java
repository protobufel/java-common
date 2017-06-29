/*
 *    Copyright 2017 David Tesler
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.github.protobufel.common.misc;

import com.github.protobufel.test.common.misc.CommonSoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StreamablesTest {
    private CommonSoftAssertions softly;

    @Before
    public void setUp() throws Exception {
        softly = new CommonSoftAssertions();
    }

    @After
    public void tearDown() throws Exception {
        softly.assertAll();
    }

    @Test
    public void testIsUtilityClass() throws Exception {
        softly.assertThatType(Streamables.class).isUtilityClass();
    }
}
