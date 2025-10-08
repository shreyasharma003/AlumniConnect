// package com.alumni.model;

// public class JobPost {
    
// }
package com.alumni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_posts")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobTitle;
    private String description;

    @ManyToOne
    @JoinColumn(name = "posted_by")
    private User postedBy;
}
