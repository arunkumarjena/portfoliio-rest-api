package com.restapi.portfolio.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "home")
public class Home {
    private String name;
    private String description;

}
