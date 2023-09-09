create database online_admission;
use online_admission;

-- Create the 'admin' table

CREATE TABLE admin (
  id INT(11) PRIMARY KEY,
  city VARCHAR(255) CHARACTER SET utf8mb4,
  email_id VARCHAR(255) CHARACTER SET utf8mb4,
  first_name VARCHAR(255) CHARACTER SET utf8mb4,
  last_name VARCHAR(255) CHARACTER SET utf8mb4,
  mobile_no VARCHAR(255) CHARACTER SET utf8mb4,
  password VARCHAR(255) CHARACTER SET utf8mb4,
  pincode VARCHAR(255) CHARACTER SET utf8mb4,
  street VARCHAR(255) CHARACTER SET utf8mb4,
  user_name VARCHAR(255) CHARACTER SET utf8mb4
);

-- Create the 'course' table
CREATE TABLE course (
  id INT(11) PRIMARY KEY,
  minimum_qualification VARCHAR(255) CHARACTER SET utf8mb4,
  name VARCHAR(255) CHARACTER SET utf8mb4,
  subject_criteria VARCHAR(255) CHARACTER SET utf8mb4
);

-- Create the 'college' table
CREATE TABLE college (
  id INT(11) PRIMARY KEY,
  address VARCHAR(255) CHARACTER SET utf8mb4,
  available_seat INT(11),
  code VARCHAR(255) CHARACTER SET utf8mb4,
  email VARCHAR(255) CHARACTER SET utf8mb4,
  is_seat_full VARCHAR(255) CHARACTER SET utf8mb4,
  location VARCHAR(255) CHARACTER SET utf8mb4,
  name VARCHAR(255) CHARACTER SET utf8mb4,
  password VARCHAR(255) CHARACTER SET utf8mb4,
  phone_no VARCHAR(255) CHARACTER SET utf8mb4,
  total_seat INT(11)
);

-- Create the 'student' table
CREATE TABLE student (
  id INT(11) PRIMARY KEY,
  city VARCHAR(255) CHARACTER SET utf8mb4,
  email_id VARCHAR(255) CHARACTER SET utf8mb4,
  first_name VARCHAR(255) CHARACTER SET utf8mb4,
  is_verified INT(11),
  last_name VARCHAR(255) CHARACTER SET utf8mb4,
  mobile_no VARCHAR(255) CHARACTER SET utf8mb4,
  password VARCHAR(255) CHARACTER SET utf8mb4,
  pincode VARCHAR(255) CHARACTER SET utf8mb4,
  register_date VARCHAR(255) CHARACTER SET utf8mb4,
  street VARCHAR(255) CHARACTER SET utf8mb4,
  user_name VARCHAR(255) CHARACTER SET utf8mb4
);

-- Create the 'applied_college' table with relationships
CREATE TABLE applied_college (
  id INT(11) PRIMARY KEY,
  allotment_status VARCHAR(255) CHARACTER SET utf8mb4,
  college_id INT(11),
  student_id INT(11),
  FOREIGN KEY (college_id) REFERENCES college(id),
  FOREIGN KEY (student_id) REFERENCES student(id)
);

-- Create the 'college_available_course' table with relationships
CREATE TABLE college_available_course (
  id INT(11) PRIMARY KEY,
  college_id INT(11),
  course_id INT(11),
  FOREIGN KEY (college_id) REFERENCES college(id),
  FOREIGN KEY (course_id) REFERENCES course(id)
);

-- Create the 'mobile_verification' table
CREATE TABLE mobile_verification (
  id INT(11) PRIMARY KEY,
  mobile VARCHAR(255) CHARACTER SET utf8mb4,
  otp VARCHAR(255) CHARACTER SET utf8mb4
);

-- Create the 'student_application' table with relationships
CREATE TABLE student_application (
  id INT(11) PRIMARY KEY,
  application_date VARCHAR(255) CHARACTER SET utf8mb4,
  city VARCHAR(255) CHARACTER SET utf8mb4,
  country VARCHAR(255) CHARACTER SET utf8mb4,
  course_id INT(11),
  dob VARCHAR(255) CHARACTER SET utf8mb4,
  father_name VARCHAR(255) CHARACTER SET utf8mb4,
  is_amount_paid VARCHAR(255) CHARACTER SET utf8mb4,
  is_approved VARCHAR(255) CHARACTER SET utf8mb4,
  mother_name VARCHAR(255) CHARACTER SET utf8mb4,
  pin_code VARCHAR(255) CHARACTER SET utf8mb4,
  state VARCHAR(255) CHARACTER SET utf8mb4,
  student_id INT(11),
  student_photo VARCHAR(255) CHARACTER SET utf8mb4,
  FOREIGN KEY (course_id) REFERENCES course(id),
  FOREIGN KEY (student_id) REFERENCES student(id)
);

-- Create the 'student_documents' table with relationships
CREATE TABLE student_documents (
  id INT(11) PRIMARY KEY,
  document VARCHAR(255) CHARACTER SET utf8mb4,
  is_approved VARCHAR(255) CHARACTER SET utf8mb4,
  is_document_uploaded VARCHAR(255) CHARACTER SET utf8mb4,
  percentage DECIMAL(20,2),
  standard VARCHAR(255) CHARACTER SET utf8mb4,
  student_id INT(11),
  uploaded_date VARCHAR(255) CHARACTER SET utf8mb4,
  year_of_passing INT(11),
  FOREIGN KEY (student_id) REFERENCES student(id)
);
