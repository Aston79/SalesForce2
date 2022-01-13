package objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Contact {
    private String firstName;
    private String lastName;
    private String accountName;
    private String phone;
    private String email;
    private String department;
}
