package com.restapi.portfolio.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "about")
public class About {
    private List<Skills> skills;
    private List<Projects> projects;
    private Achivements achivements;
}
