package edu.poo.actividad4.ui;

public class En extends Language {

    public En(){
        MENU_OPC1 = "1. Register professor";
        MENU_OPC2 = "2. Register student";
        MENU_OPC3 = "3. Create course";
        MENU_OPC4 = "4. Register subject";
        MENU_OPC5 = "5. Show courses";
        MENU_OPC6 = "6. Show subjects and number of students";
        MENU_OPC7 = "7. Show professor and weekly salary";
        MENU_OPC8 = "8. Change language";
        MENU_OPC9 = "9. Exit";
        INVALID_OPTION = "Invalid option";

        SUBJECTS_HEADER = "Subjects: ";
        SUBJECT_SEPARATOR = "==========================================================================================";
        SUBJECT_NAME_LABEL = "Subject name: ";
        SUBJECT_CREDITS_LABEL = "Subject credits: ";
        SUBJECT_HOURS_LABEL = "Subject hours: ";
        SUBJECT_STUDENTS_LABEL = "Number of enrolled students: ";

        COURSES_HEADER = "Courses: ";
        COURSE_SEPARATOR = "==========================================================================================";
        COURSE_ID_LABEL = "Course ID: ";
        COURSE_SUBJECTS_LABEL = "Subjects in the course: ";
        COURSE_TOTAL_CREDITS_LABEL = "Total course credits: ";

        ENTER_PROFESSOR_NAME = "Enter the professor's name: ";
        ENTER_PROFESSOR_SUBJECT_COUNT = "Enter the number of subjects for the professor: ";
        PROFESSOR_SALARY_RESULT = "The total salary of professor %s is: %.2f";

        ENTER_STUDENT_ID = "Enter the student's ID: ";
        ENTER_STUDENT_NAME = "Enter the student's name: ";
        ENTER_STUDENT_AGE = "Enter the student's age: ";
        ENTER_STUDENT_COURSE = "Enter the student's course name: ";
        STUDENT_REGISTER_SUCCESS = "Student registered successfully.";
        COURSE_DOES_NOT_EXIST = "The course does not exist.";

        ENTER_COURSE_ID = "Enter the course key: ";
        ENTER_SUBJECT_FOR_COURSE = "Enter the subject name ";
        SUBJECT_ALREADY_SELECTED_OR_NOT_EXIST = "The subject has already been selected or does not exist. Please choose another subject.";
        COURSE_ADDED_SUCCESS = "Course added successfully.";
        NOT_ENOUGH_SUBJECTS = "There are less than 3 registered subjects.";

        ENTER_SUBJECT_NAME = "Enter the subject name: ";
        ENTER_SUBJECT_CREDITS = "Enter the number of credits for the subject: ";
        ENTER_SUBJECT_HOURS = "Enter the number of hours for the subject: ";

        NO_PROFESSORS = "No professors registered.";
        PROFESSOR_DETAILS = "Name: %s, Hourly salary: %.2f, Number of subjects: %d, Weekly salary: %.2f";

        LANGUAGE_SELECTION_PROMPT = "Select language: 1. Español, 2. English";
        LANGUAGE_OPTION_SPANISH = "Español";
        LANGUAGE_OPTION_ENGLISH = "English";
    }
}