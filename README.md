# Object Oriented Programming 1
In 4th semester I had this course. I learned JAVA that time and completed the course. 

I used two IDE to run and test java.
```Eclipse & Apache NetBeans```
               here are my most of the codes and I didn't use any **Ignore** while uploading.

6.12 PM, 28 April, 2022.

CREATE DATABASE student_menagement;          create database
    Table create
CREATE TABLE student (SID varchar(12), name varchar(30), email varchar(30), cgpa int(3), major varchar(10));
CREATE TABLE course (C_code varchar(10), title varchar(20), credit int(2));
CREATE TABLE faculty (ID int(10), name varchar(30), designation varchar(10), salary int(6));
CREATE TABLE enrollment (SID varchar(12), FID int(10), C_code varchar(10));
    Insert value
INSERT INTO student VALUES ('230-15-3871','Shanto', 'a@gmail.com', 3, 'software');
INSERT INTO student VALUES ('230-15-3820','Rakib', 'b@gmail.com', 3, 'software');
INSERT INTO student VALUES ('230-15-3810','Samsun', 'c@gmail.com', 3, 'software');
INSERT INTO student VALUES ('230-15-3882','Asme', 'd@gmail.com', 3, 'software');
    Insert value
INSERT INTO faculty VALUES (12345, 'Samsun naher', 'Professor', 100000);
INSERT INTO faculty VALUES (12346, 'Asme', 'Lecturer', 100000);
INSERT INTO faculty VALUES (12347, 'Rakibul Islam', 'Professor', 100000);
INSERT INTO faculty VALUES (12348, 'Shanto', 'Lecturer', 100000);
    Insert value
INSERT INTO course VALUES ('cse311', 'dbms', 3);
INSERT INTO course VALUES ('cse312', 'dbms lab', 2);
INSERT INTO course VALUES ('cse313', 'oop2', 3);
INSERT INTO course VALUES ('cse314', 'oop2 lab', 2);
    Insert value
INSERT INTO enrollment VALUES ('230-15-3871', 12345, 'cse311');
INSERT INTO enrollment VALUES ('230-15-3820', 12346, 'cse312');
INSERT INTO enrollment VALUES ('230-15-3810', 12347, 'cse313');
INSERT INTO enrollment VALUES ('230-15-3882', 12348, 'cse314');


ALTER TABLE course ADD COLUMN money int(5);                      add column

ALTER TABLE course MODIFY money varchar(5);                      change column type

ALTER TABLE course CHANGE money taka varchar(5);	               change column name

ALTER TABLE course drop taka;                                    drop column

ALTER TABLE faculty RENAME TO teacher;                           change table name

DROP TABLE faculty;                                              drop table

DROP DATABASE student_menagement;                                drop database

ALTER TABLE student ADD PRIMARY KEY (SID);
ALTER TABLE faculty ADD PRIMARY KEY (ID);                        add primary key
ALTER TABLE course ADD PRIMARY KEY (C_code);

ALTER TABLE course DROP PRIMARY KEY ;                            drop primary key

ALTER TABLE enrollment
ADD CONSTRAINT FK_sid                                            add foreign key
FOREIGN KEY (SID) REFERENCES student(SID);

ALTER TABLE enrollment
ADD CONSTRAINT FK_fid                                            add foreign key
FOREIGN KEY (FID) REFERENCES faculty(ID);

ALTER TABLE enrollment
ADD CONSTRAINT FK_code                                           add foreign key
FOREIGN KEY (C_code) REFERENCES course(C_code);

ALTER TABLE enrollment DROP FOREIGN KEY FK_sid;                  drop foreign key


SELECT SID FROM student WHERE name = 'Asme'			                 where
SELECT * FROM student WHERE major = 'CSE'			                   ALL
SELECT * FROM student WHERE major = 'CSE' AND name = 'Asme'	     AND
SELECT * FROM student WHERE major = 'CSE' OR name = 'Asme'	     OR
SELECT name FROM student where cgpa > 3 ;			                   > <
SELECT name FROM student WHERE SID like '230%'			             like
SELECT * FROM student WHERE SID like '%15%'			                 like
SELECT name FROM faculty WHERE ID BETWEEN 12345 AND 12347 ;	     between
SELECT DISTINCT salary , designation FROM faculty			           distinct
SELECT DISTINCT major FROM student ;				                     distinct
SELECT * FROM student ORDER BY cgpa ;				                     order by
SELECT * FROM student ORDER BY cgpa DESC ;			                 order by descending
SELECT * FROM student ORDER BY name ;				                     order by alpabetic
SELECT * FROM passenger ORDER BY p_id LIMIT 3 ;			             order by limit
SELECT * FROM passenger ORDER BY p_id LIMIT 1, 2 ;		           order by limit range
    JOIN
SELECT name FROM student JOIN enrollment ON enrollment.SID = student.SID WHERE C_code = 'CSE311' ;
SELECT name FROM faculty JOIN enrollment JOIN course ON enrollment.FID = faculty.ID AND enrollment.C_code = course.C_code WHERE credit > 2 ;
SELECT student.name from student JOIN faculty JOIN course JOIN enrollment ON student.SID = enrollment.SID AND enrollment.FID = faculty.ID AND enrollment.C_code = course.C_code WHERE faculty.name = 'Samsun Naher' AND course.title = 'DBMS' ;
    Aggregate 
SELECT AVG(cgpa) FROM student ;
SELECT MAX(cgpa) FROM student ;
SELECT MIN(cgpa) FROM student ;
SELECT COUNT(studentID) FROM student ;
SELECT SUM(cgpa) FROM student ;
    Aggregate  (condition)
SELECT SUM(cgpa) FROM student WHERE department = "cse";
SELECT AVG(cgpa) FROM student GROUP BY department HAVING department = "cse";

    View create
CREATE VIEW studentt_view AS
SELECT * FROM student JOIN faculty JOIN enrollment JOIN course ON
student.studentID = enrollment.SID AND
faculty.facultyID = enrollment.FID AND
course.Course_code = enrollment.C_code ;
    search from view
SELECT studentID FROM studentt_view WHERE Course_code = "cse314"  ;
SELECT studentName, facultyName FROM studentt_view WHERE Course_code = "cse314" AND title = "oop2 lab" ;
