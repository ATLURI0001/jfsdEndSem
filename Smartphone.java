package com.klef.jfsd.exam.InheritanceMapping;


import jakarta.persistence.Entity;

@Entity
public class Smartphone extends Device {
    private String operatingSystem;
    private int cameraResolution;

    // Getters and Setters
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public int getCameraResolution() {
        return cameraResolution;
    }
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}

