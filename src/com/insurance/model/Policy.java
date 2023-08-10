package com.insurance.model;

public class Policy {
    /*policyId: Unique identifier for the policy.
    customerId: Identifier linking the policy to the customer who owns it.
    policyNumber: A unique number associated with the policy.
            policyType: Type of insurance policy (e.g., health, auto, home).
    startDate: The date when the policy coverage starts.
            endDate: The date when the policy coverage ends.
            premium: The amount the customer pays for the policy.
    coverageAmount: The total coverage amount provided by the policy.
    beneficiaries: List of beneficiaries associated with the policy (if applicable).
    status: Status of the policy (e.g., active, expired, canceled).*/
    private String policyNumber;
    private String policyHolderId;
    private boolean isClaimed;

    public Policy() {
    }

    public Policy(String policyNumber, String policyHolderId, boolean isClaimed) {
        this.policyNumber = policyNumber;
        this.policyHolderId = policyHolderId;
        this.isClaimed = isClaimed;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(String policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public boolean isClaimed() {
        return isClaimed;
    }

    public void setClaimed(boolean claimed) {
        isClaimed = claimed;
    }
}
