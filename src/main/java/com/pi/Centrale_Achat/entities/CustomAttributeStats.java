package com.pi.Centrale_Achat.entities;

import weka.core.AttributeStats;

public class CustomAttributeStats extends AttributeStats {
    private String attributeName;
    private double coefficient;
    private double correlation;

    // Constructeur
    public CustomAttributeStats() {
        this.attributeName = attributeName;
        this.coefficient = coefficient;
        this.correlation = correlation;
    }

    // Getters et Setters
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCorrelation() {
        return correlation;
    }

    public void setCorrelation(double correlation) {
        this.correlation = correlation;
    }
}