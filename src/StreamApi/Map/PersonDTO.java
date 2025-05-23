package StreamApi.Map;

public class PersonDTO {
	
    private String fullName;
    private String ageCategory;
    
    public PersonDTO(String fullName, String ageCategory) {
        this.fullName = fullName;
        this.ageCategory = ageCategory;
    }
    
    @Override
    public String toString() {
        return fullName + " (" + ageCategory + ")";
    }


}
