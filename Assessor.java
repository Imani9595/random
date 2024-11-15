package com.example.certification;

public class Assessor {
    private String fullName;
    private int employeeId;

    public Assessor(String fullName, int employeeId) {
        this.fullName = fullName;
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public boolean reviewCertificationTest(CertificationTest test, CertificationCriteria criteria) {
        return test.getScore() >= criteria.getMinimumPassingScore();
    }
}
