package kodlamaio.hrms.entities.concretes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployersForRegisterDto {
	
	private String companyName;
	private String phone;
	private String website;
	private String email;
	private String password;
	private String verifyPassword;

}
