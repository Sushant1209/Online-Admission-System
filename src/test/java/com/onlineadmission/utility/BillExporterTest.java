package com.onlineadmission.utility;

import static org.mockito.Mockito.mock;

import com.lowagie.text.DocumentException;
import com.onlineadmission.dao.AppliedCollegeDao;
import com.onlineadmission.dao.CollegeDao;
import com.onlineadmission.model.Course;
import com.onlineadmission.model.Student;
import com.onlineadmission.model.StudentApplication;
import com.onlineadmission.model.StudentDocuments;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class BillExporterTest {
    /**
     * Method under test: {@link BillExporter#BillExporter(Course, List, StudentApplication, Student, CollegeDao, AppliedCollegeDao)}
     */
    @Test
    void testConstructor() {

        Course course = new Course();
        course.setId(1);
        course.setMinimumQualification("Minimum Qualification");
        course.setName("Name");
        course.setSubjectCriteria("Hello from the Dreaming Spires");
        ArrayList<StudentDocuments> studentDocument = new ArrayList<>();

        StudentApplication studentApplication = new StudentApplication();
        studentApplication.setApplicationDate("2020-03-01");
        studentApplication.setCity("Oxford");
        studentApplication.setCountry("GB");
        studentApplication.setCourseId(1);
        studentApplication.setDob("Dob");
        studentApplication.setFatherName("Father Name");
        studentApplication.setId(1);
        studentApplication.setIsAmountPaid("10");
        studentApplication.setIsApproved("Is Approved");
        studentApplication.setMotherName("Mother Name");
        studentApplication.setPinCode("Pin Code");
        studentApplication.setState("MD");
        studentApplication.setStudentId(1);
        studentApplication.setStudentPhoto("alice.liddell@example.org");

        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");
        new BillExporter(course, studentDocument, studentApplication, student, mock(CollegeDao.class),
                mock(AppliedCollegeDao.class));

    }

    /**
     * Method under test: {@link BillExporter#export(HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExport() throws DocumentException, IOException {

        Course course = new Course();
        ArrayList<StudentDocuments> studentDocument = new ArrayList<>();
        StudentApplication studentApplication = new StudentApplication();
        BillExporter billExporter = new BillExporter(course, studentDocument, studentApplication, new Student(),
                mock(CollegeDao.class), mock(AppliedCollegeDao.class));
        billExporter.export(new Response());
    }

    /**
     * Method under test: {@link BillExporter#export(HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExport2() throws DocumentException, IOException {

        ArrayList<StudentDocuments> studentDocument = new ArrayList<>();
        StudentApplication studentApplication = new StudentApplication();
        BillExporter billExporter = new BillExporter(null, studentDocument, studentApplication, new Student(),
                mock(CollegeDao.class), mock(AppliedCollegeDao.class));
        billExporter.export(new Response());
    }

    /**
     * Method under test: {@link BillExporter#export(HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExport3() throws DocumentException, IOException {
        Course course = new Course();
        ArrayList<StudentDocuments> studentDocument = new ArrayList<>();
        StudentApplication studentApplication = new StudentApplication();
        (new BillExporter(course, studentDocument, studentApplication, new Student(), mock(CollegeDao.class),
                mock(AppliedCollegeDao.class))).export(null);
    }
}

