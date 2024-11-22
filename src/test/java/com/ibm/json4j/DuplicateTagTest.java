package com.ibm.json4j;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import com.ibm.json.java.JSONObject;

public class DuplicateTagTest {

    @Test
    public void testDuplicateId() throws IOException {
        String inputJson = "{\"duplicate\": 123, \"duplicate\": 456}";

        try {
            JSONObject obj = JSONObject.parse(inputJson, true);
            fail("Exception should have been thrown");
        } catch (IOException e) {
            assertEquals("Duplicate Key \'duplicate\'", e.getMessage());
        }
    }

}
