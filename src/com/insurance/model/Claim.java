package com.insurance.model;

public class Claim {

    /*claimId: Unique identifier for the claim.
    policyId: Identifier linking the claim to the associated policy.
    customerId: Identifier linking the claim to the customer who filed it.
    dateFiled: Date when the claim was filed.
    claimType: Type of claim (e.g., medical, property damage, accident).
    description: Description of the claim and what happened.
            status: Status of the claim (e.g., pending, approved, rejected).
    amount: The claim amount requested.
    dateResolved: Date when the claim was resolved (if applicable).
    resolution: The outcome of the claim (e.g., paid amount, reason for rejection).*/
    private String claimId;
    private int claimType;
    private String policyId;

    public Claim(){
    }

    public Claim(String claimId, String policyId) {
        this.claimId = claimId;
        this.policyId = policyId;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
}
