package ie.atu.week4;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Min(value = 0, message = "Employee ID cannot be blank")
    private int employeeId;

    @Min(value = 0, message = "Age must be greater than or equal to 0")
    private int age;

    @Email(message = "Email cannot be blank")
    private String email;

    @NotBlank(message = "Name cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;
}
