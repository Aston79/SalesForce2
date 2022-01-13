package objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Account {
    private String accountName;
    private String type;
    private String website;
    private String phone;
    private String industry;
    private String employees;
}
