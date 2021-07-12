package com.tshimologong.project.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROJECT_TBL")
public class Project {

    @Id
    private int project_id;
    private String project_name;
    private String project_due_date;


}
