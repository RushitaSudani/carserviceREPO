package org.technous.car.carservice.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceId;
    private String serviceName;
    private String description;
    private int price;
    private String duration;
}
