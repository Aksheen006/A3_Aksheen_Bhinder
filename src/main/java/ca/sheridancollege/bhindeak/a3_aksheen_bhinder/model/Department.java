package ca.sheridancollege.bhindeak.a3_aksheen_bhinder.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Random;

@Entity
@Data
public class Department {

    @Id
    private Long dept_id = generateRandomId();

    @Column(nullable = false, length = 45)
    private String dept_name;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(length = 45)
    private String phone;

    private static Long generateRandomId() {
        return 10000000000L + new Random().nextInt(900000000);
    }
}
