package com.onlineadmission.utility;

import org.junit.jupiter.api.Test;

class SendOTPTest {
    /**
     * Method under test: {@link SendOTP#sendOTP(String, String, String)}
     */
    @Test
    void testSendOTP() {

        SendOTP.sendOTP("Not all who wander are lost", "42", "Api Key");
    }
}

