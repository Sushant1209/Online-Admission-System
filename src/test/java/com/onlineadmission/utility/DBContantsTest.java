package com.onlineadmission.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DBContantsTest {
    /**
     * Method under test: {@link DBContants.ApprovalStatus#value()}
     */
    @Test
    void testApprovalStatusValue() {
        assertEquals("Approval Pending", DBContants.ApprovalStatus.APPROVAL_PENDIND.value());
    }

    /**
     * Method under test: {@link DBContants.City#equals(String)}
     */
    @Test
    void testCityEquals() {
        assertFalse(DBContants.City.MUMBAI.equals("Oxford"));
    }

    /**
     * Method under test: {@link DBContants.City#value()}
     */
    @Test
    void testCityValue() {
        assertEquals("Mumbai", DBContants.City.MUMBAI.value());
    }

    /**
     * Method under test: {@link DBContants.Country#equals(String)}
     */
    @Test
    void testCountryEquals() {
        assertFalse(DBContants.Country.INDIA.equals("GB"));
    }

    /**
     * Method under test: {@link DBContants.Country#value()}
     */
    @Test
    void testCountryValue() {
        assertEquals("India", DBContants.Country.INDIA.value());
    }

    /**
     * Method under test: {@link DBContants.Course#equals(String)}
     */
    @Test
    void testCourseEquals() {
        assertFalse(DBContants.Course.BE.equals("Course"));
        assertTrue(DBContants.Course.BE.equals("BE"));
    }

    /**
     * Method under test: {@link DBContants.Course#value()}
     */
    @Test
    void testCourseValue() {
        assertEquals("BE", DBContants.Course.BE.value());
    }

    /**
     * Method under test: {@link DBContants.IsAmountPaid#value()}
     */
    @Test
    void testIsAmountPaidValue() {
        assertEquals("Yes", DBContants.IsAmountPaid.YES.value());
    }

    /**
     * Method under test: {@link DBContants.IsDocumentUploaded#value()}
     */
    @Test
    void testIsDocumentUploadedValue() {
        assertEquals("Yes", DBContants.IsDocumentUploaded.YES.value());
    }

    /**
     * Method under test: {@link DBContants.IsMobileVerified#value()}
     */
    @Test
    void testIsMobileVerifiedValue() {
        assertEquals(1, DBContants.IsMobileVerified.YES.value());
    }

    /**
     * Method under test: {@link DBContants.IsSeatFull#value()}
     */
    @Test
    void testIsSeatFullValue() {
        assertEquals("Yes", DBContants.IsSeatFull.YES.value());
    }

    /**
     * Method under test: {@link DBContants.Qualification#equals(String)}
     */
    @Test
    void testQualificationEquals() {
        assertFalse(DBContants.Qualification.TWELVETH.equals("Qualification"));
    }

    /**
     * Method under test: {@link DBContants.Qualification#value()}
     */
    @Test
    void testQualificationValue() {
        assertEquals("12th", DBContants.Qualification.TWELVETH.value());
    }

    /**
     * Method under test: {@link DBContants.SelectionStatus#value()}
     */
    @Test
    void testSelectionStatusValue() {
        assertEquals("Selected", DBContants.SelectionStatus.SELECTED.value());
    }

    /**
     * Method under test: {@link DBContants.Standard#equals(String)}
     */
    @Test
    void testStandardEquals() {
        assertFalse(DBContants.Standard.TENTH.equals("Standard"));
    }

    /**
     * Method under test: {@link DBContants.Standard#value()}
     */
    @Test
    void testStandardValue() {
        assertEquals("10th", DBContants.Standard.TENTH.value());
    }

    /**
     * Method under test: {@link DBContants.State#equals(String)}
     */
    @Test
    void testStateEquals() {
        assertFalse(DBContants.State.MAHARASHTRA.equals("MD"));
        assertTrue(DBContants.State.MP.equals("MP"));
    }

    /**
     * Method under test: {@link DBContants.State#value()}
     */
    @Test
    void testStateValue() {
        assertEquals("Maharashtra", DBContants.State.MAHARASHTRA.value());
    }

    /**
     * Method under test: {@link DBContants.Subject#equals(String)}
     */
    @Test
    void testSubjectEquals() {
        assertFalse(DBContants.Subject.NONE.equals("Hello from the Dreaming Spires"));
        assertTrue(DBContants.Subject.PCB.equals("PCB"));
    }

    /**
     * Method under test: {@link DBContants.Subject#value()}
     */
    @Test
    void testSubjectValue() {
        assertEquals("None", DBContants.Subject.NONE.value());
    }
}

