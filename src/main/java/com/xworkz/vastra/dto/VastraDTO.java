package com.xworkz.vastra.dto;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VastraDTO {
    private int id;
    private String name;
    private String category;
    private String brand;
    private double price;
    private String size;
}
