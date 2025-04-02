package ca.sheridancollege.bhindeak.a3_aksheen_bhinder.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.Random;

@Entity
@Data
public class Employee {

    @Id
    private Long emp_id = generateRandomId();

    @Column(nullable = false, length = 45)
    private String first_name;

    @Column(nullable = false, length = 45)
    private String last_name;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private Date hire_date;

    private static Long generateRandomId() {
        return 10000000000L + new Random().nextInt(900000000);
    }

    public enum Gender { M, F }
}
