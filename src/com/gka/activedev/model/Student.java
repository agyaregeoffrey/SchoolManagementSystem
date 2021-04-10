package com.gka.activedev.model;

import javafx.beans.Observable;
import javafx.beans.property.*;
import javafx.collections.ObservableList;
import javafx.util.Callback;



public class Student {

    // Student information
    private final StringProperty studentName = new SimpleStringProperty(
            this, "student name", ""
    );
    private final StringProperty dateOfBirth = new SimpleStringProperty(
            this, "dob", ""
    );
    private final StringProperty studentClass = new SimpleStringProperty(
            this, "class enrolled", ""
    );
    private final StringProperty homeAddress = new SimpleStringProperty(
            this, "home address", ""
    );
    private final StringProperty phoneNumber = new SimpleStringProperty(
            this, "phone number", ""
    );
    private final StringProperty lastSchoolAttended = new SimpleStringProperty(
            this, "last school attended", ""
    );
    private final StringProperty reasonForLeaving = new SimpleStringProperty(
            this, "reason for leaving", ""
    );
    private final StringProperty medicalCondition = new SimpleStringProperty(
            this, "medical condition", ""
    );
    private final StringProperty dateEnrolled = new SimpleStringProperty(
            this, "date enrolled", ""
    );

    // family information - mother
    private final StringProperty motherName = new SimpleStringProperty(
            this, "name of mother", ""
    );
    private final StringProperty motherPhone = new SimpleStringProperty(
            this, "mother's contact", ""
    );
    private final StringProperty motherOccupation = new SimpleStringProperty(
            this, "mother's occupation", ""
    );
    private final StringProperty motherEmail = new SimpleStringProperty(
            this, "mother's email", ""
    );

    // family information - father
    private final StringProperty fatherName = new SimpleStringProperty(
            this, "name of father", ""
    );
    private final StringProperty fatherPhone = new SimpleStringProperty(
            this, "father's contact", ""
    );
    private final StringProperty fatherOccupation = new SimpleStringProperty(
            this, "father's occupation", ""
    );
    private final StringProperty fatherEmail = new SimpleStringProperty(
            this, "father's email", ""
    );

    private final StringProperty maritalStatus = new SimpleStringProperty(
            this, "marital status", ""
    );

    // if separated
    private final StringProperty currentPlaceOfStayOfChild = new SimpleStringProperty(
            this, "current place of stay", ""
    );

    // food and bus
    private final BooleanProperty useBusServices = new SimpleBooleanProperty(
            this, "bus services", false
    );
    private final BooleanProperty takeBreakfast = new SimpleBooleanProperty(
            this, "breakfast", false
    );
    private final BooleanProperty takeLunch = new SimpleBooleanProperty(
            this, "lunch", false
    );

    // authorized persons to pick up students
    private final ListProperty<String> authorizedPickUpPersons = new SimpleListProperty<>(
            this, "authorized persons", null
    );

    public Student() {
    }

    public Student(String name, String dob, String studentClass, String address, String phoneNumber,
                   String lastSchool, String reasonForLeaving, String medicalCondition,
                   String dateEnrolled, String mumName, String mumPhone, String mumOccupation, String mumEmail,
                   String dadName, String dadPhone, String dadOccupation, String dadEmail,
                   String currentPlace, boolean busServices, boolean breakfast, boolean lunch,
                   ObservableList<String> authorizedPersons) {
        this.studentName.set(name);
        this.dateOfBirth.set(dob);
        this.studentClass.set(studentClass);
        this.homeAddress.set(address);
        this.phoneNumber.set(phoneNumber);
        this.lastSchoolAttended.set(lastSchool);
        this.reasonForLeaving.set(reasonForLeaving);
        this.medicalCondition.set(medicalCondition);
        this.dateEnrolled.set(dateEnrolled);
        this.motherName.set(mumName);
        this.motherPhone.set(mumPhone);
        this.motherOccupation.set(mumOccupation);
        this.motherEmail.set(mumEmail);
        this.fatherName.set(dadName);
        this.fatherPhone.set(dadPhone);
        this.fatherOccupation.set(dadOccupation);
        this.fatherEmail.set(dadEmail);
        this.currentPlaceOfStayOfChild.set(currentPlace);
        this.useBusServices.set(busServices);
        this.takeBreakfast.set(breakfast);
        this.takeLunch.set(lunch);
        this.authorizedPickUpPersons.set(authorizedPersons);
    }

    public void setStudentName(String studentName) {
        this.studentName.set(studentName);
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth.set(dateOfBirth);
    }

    public void setStudentClass(String studentClass) {
        this.studentClass.set(studentClass);
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress.set(homeAddress);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public void setLastSchoolAttended(String lastSchoolAttended) {
        this.lastSchoolAttended.set(lastSchoolAttended);
    }

    public void setReasonForLeaving(String reasonForLeaving) {
        this.reasonForLeaving.set(reasonForLeaving);
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition.set(medicalCondition);
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled.set(dateEnrolled);
    }

    public void setMotherName(String motherName) {
        this.motherName.set(motherName);
    }

    public void setMotherPhone(String motherPhone) {
        this.motherPhone.set(motherPhone);
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation.set(motherOccupation);
    }

    public void setMotherEmail(String motherEmail) {
        this.motherEmail.set(motherEmail);
    }

    public void setFatherName(String fatherName) {
        this.fatherName.set(fatherName);
    }

    public void setFatherPhone(String fatherPhone) {
        this.fatherPhone.set(fatherPhone);
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation.set(fatherOccupation);
    }

    public void setFatherEmail(String fatherEmail) {
        this.fatherEmail.set(fatherEmail);
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus.set(maritalStatus);
    }

    public void setCurrentPlaceOfStayOfChild(String currentPlaceOfStayOfChild) {
        this.currentPlaceOfStayOfChild.set(currentPlaceOfStayOfChild);
    }

    public void setUseBusServices(boolean useBusServices) {
        this.useBusServices.set(useBusServices);
    }

    public void setTakeBreakfast(boolean takeBreakfast) {
        this.takeBreakfast.set(takeBreakfast);
    }

    public void setTakeLunch(boolean takeLunch) {
        this.takeLunch.set(takeLunch);
    }

    public void setAuthorizedPickUpPersons(ObservableList<String> authorizedPickUpPersons) {
        this.authorizedPickUpPersons.set(authorizedPickUpPersons);
    }

    public String getStudentName() {
        return studentName.get();
    }

    public StringProperty studentNameProperty() {
        return studentName;
    }

    public String getDateOfBirth() {
        return dateOfBirth.get();
    }

    public StringProperty dateOfBirthProperty() {
        return dateOfBirth;
    }

    public String getStudentClass() {
        return studentClass.get();
    }

    public StringProperty studentClassProperty() {
        return studentClass;
    }

    public String getHomeAddress() {
        return homeAddress.get();
    }

    public StringProperty homeAddressProperty() {
        return homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public String getLastSchoolAttended() {
        return lastSchoolAttended.get();
    }

    public StringProperty lastSchoolAttendedProperty() {
        return lastSchoolAttended;
    }

    public String getReasonForLeaving() {
        return reasonForLeaving.get();
    }

    public StringProperty reasonForLeavingProperty() {
        return reasonForLeaving;
    }

    public String getMedicalCondition() {
        return medicalCondition.get();
    }

    public StringProperty medicalConditionProperty() {
        return medicalCondition;
    }

    public String getDateEnrolled() {
        return dateEnrolled.get();
    }

    public StringProperty dateEnrolledProperty() {
        return dateEnrolled;
    }

    public String getMotherName() {
        return motherName.get();
    }

    public StringProperty motherNameProperty() {
        return motherName;
    }

    public String getMotherPhone() {
        return motherPhone.get();
    }

    public StringProperty motherPhoneProperty() {
        return motherPhone;
    }

    public String getMotherOccupation() {
        return motherOccupation.get();
    }

    public StringProperty motherOccupationProperty() {
        return motherOccupation;
    }

    public String getMotherEmail() {
        return motherEmail.get();
    }

    public StringProperty motherEmailProperty() {
        return motherEmail;
    }

    public String getFatherName() {
        return fatherName.get();
    }

    public StringProperty fatherNameProperty() {
        return fatherName;
    }

    public String getFatherPhone() {
        return fatherPhone.get();
    }

    public StringProperty fatherPhoneProperty() {
        return fatherPhone;
    }

    public String getFatherOccupation() {
        return fatherOccupation.get();
    }

    public StringProperty fatherOccupationProperty() {
        return fatherOccupation;
    }

    public String getFatherEmail() {
        return fatherEmail.get();
    }

    public StringProperty fatherEmailProperty() {
        return fatherEmail;
    }

    public String getMaritalStatus() {
        return maritalStatus.get();
    }

    public StringProperty maritalStatusProperty() {
        return maritalStatus;
    }

    public String getCurrentPlaceOfStayOfChild() {
        return currentPlaceOfStayOfChild.get();
    }

    public StringProperty currentPlaceOfStayOfChildProperty() {
        return currentPlaceOfStayOfChild;
    }

    public boolean isUseBusServices() {
        return useBusServices.get();
    }

    public BooleanProperty useBusServicesProperty() {
        return useBusServices;
    }

    public boolean isTakeBreakfast() {
        return takeBreakfast.get();
    }

    public BooleanProperty takeBreakfastProperty() {
        return takeBreakfast;
    }

    public boolean isTakeLunch() {
        return takeLunch.get();
    }

    public BooleanProperty takeLunchProperty() {
        return takeLunch;
    }

    public ObservableList<String> getAuthorizedPickUpPersons() {
        return authorizedPickUpPersons.get();
    }

    public ListProperty<String> authorizedPickUpPersonsProperty() {
        return authorizedPickUpPersons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName=" + studentName +
                ", dateOfBirth=" + dateOfBirth +
                ", studentClass=" + studentClass +
                ", homeAddress=" + homeAddress +
                ", phoneNumber=" + phoneNumber +
                ", lastSchoolAttended=" + lastSchoolAttended +
                ", reasonForLeaving=" + reasonForLeaving +
                ", medicalCondition=" + medicalCondition +
                ", dateEnrolled=" + dateEnrolled +
                ", motherName=" + motherName +
                ", motherPhone=" + motherPhone +
                ", motherOccupation=" + motherOccupation +
                ", motherEmail=" + motherEmail +
                ", fatherName=" + fatherName +
                ", fatherPhone=" + fatherPhone +
                ", fatherOccupation=" + fatherOccupation +
                ", fatherEmail=" + fatherEmail +
                ", maritalStatus=" + maritalStatus +
                ", currentPlaceOfStayOfChild=" + currentPlaceOfStayOfChild +
                ", useBusServices=" + useBusServices +
                ", takeBreakfast=" + takeBreakfast +
                ", takeLunch=" + takeLunch +
                ", authorizedPickUpPersons=" + authorizedPickUpPersons +
                '}';
    }

    // an extractor for sorting after a new person is added
    public static Callback<Student, Observable[]> extractor =
            person -> new Observable[]{
                    person.studentNameProperty()
            };
}
