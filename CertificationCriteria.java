package com.example.certification;

public class CertificationCriteria {
    private String certificationName;
    private int minimumPassingScore;

    public CertificationCriteria(String certificationName, int minimumPassingScore) {
        this.certificationName = certificationName;
        this.minimumPassingScore = minimumPassingScore;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public int getMinimumPassingScore() {
        return minimumPassingScore;
    }
}
