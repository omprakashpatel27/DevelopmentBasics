package com.crudapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "student")
public class Student {
    @Id
    private String rollNumber;
    private String name;
    private String marksObtainedTenth;
    private String marksObtainedTwelve;
}
