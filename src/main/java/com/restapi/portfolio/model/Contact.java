package com.restapi.portfolio.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "contact")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String name;
    private String mobileNumber;
    private String email;
    private String profession;
    private String address;
    private String specialization;
}
