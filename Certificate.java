package com.example.certification;

public class Certificate {
    private Assessor assessor;
    private CertificationTest test;
    private CertificationCriteria criteria;

    public Certificate(Assessor assessor, CertificationTest test, CertificationCriteria criteria) {
        this.assessor = assessor;
        this.test = test;
        this.criteria = criteria;
    }

    public void generateCertificate() {
        if (assessor.reviewCertificationTest(test, criteria)) {
            System.out.println("Certificate Generated!");
            System.out.println("Assessor Name: " + assessor.getFullName());
            System.out.println("Assessor ID: " + assessor.getEmployeeId());
            System.out.println("Individual Name: " + test.getIndividualName());
            System.out.println("Individual Email: " + test.getEmail());
            System.out.println("Certification Achieved: " + criteria.getCertificationName());
        } else {
            System.out.println("Certification Test Not Passed. No Certificate Generated.");
        }
    }

    public static void main(String[] args) {
        
        Assessor assessor = new Assessor("Alex Carry", 1234);

        CertificationTest test = new CertificationTest("Aleex George", "Alex@example.com", 85);

        CertificationCriteria criteria = new CertificationCriteria("Java Programming", 70);

        Certificate certificate = new Certificate(assessor, test, criteria);
        certificate.generateCertificate();
    }

}
