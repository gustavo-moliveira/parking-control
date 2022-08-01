package com.api.parkingcontrol.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class ParkingSpotDto {
    @NotBlank(message = "O campo não pode ser vazio")
    private String parkingSpotNumber;
    @NotBlank(message = "O campo não pode ser vazio")
    @Size(max = 7)
    private String licensePlateCar;
    @NotBlank(message = "O campo não pode ser vazio")
    private String brandCar;
    @NotBlank(message = "O campo não pode ser vazio")
    private String modelCar;
    @NotBlank(message = "O campo não pode ser vazio")
    private String colorCar;
    @NotBlank(message = "O campo não pode ser vazio")
    private String responsibleName;
    @NotBlank(message = "O campo não pode ser vazio")
    private String apartment;
    @NotBlank(message = "O campo não pode ser vazio")
    private String block;

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
