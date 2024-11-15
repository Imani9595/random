package com.example.certification;

public class CertificationTest {
    private String individualName;
    private String email;
    private int score;

    public CertificationTest(String individualName, String email, int score) {
        this.individualName = individualName;
        this.email = email;
        this.score = score;
    }

    public String getIndividualName() {
        return individualName;
    }

    public String getEmail() {
        return email;
    }

    public int getScore() {
        return score;
    }
}
