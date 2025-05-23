package StreamApi.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transform_Objects_to_Different_Type {
	
	public static void main(String[] args) {
		
        List<Person> persons = Arrays.asList(
                new Person("John Doe", 25),
                new Person("Jane Smith", 17),
                new Person("Bob Johnson", 65)
            );
        
        List<PersonDTO> personDTOs = persons.stream().map(p->new PersonDTO(p.getName(),	p.getAge()<18?"Minro":p.getAge()>60?"Senior":"Adult"))
        .collect(Collectors.toList());
        
        System.out.println("Person DTOs:");
        personDTOs.forEach(System.out::println);


	}

}
