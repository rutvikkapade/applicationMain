package head.consultAdd.Application.model;

public class Student {
    
        private String id;
        private String email;
        private String firstName;
        private String lastName;
        private int mathMarks;
        private int chemMarks;
        private int phyMarks;
        
    
    
        public Student(String id,String email, String firstName, String lastName, int mathMarks, int chemMarks, int phyMarks) {
            this.id = id;
            this.email=email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.mathMarks = mathMarks;
            this.chemMarks = chemMarks;
            this.phyMarks = phyMarks;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public int getMathMarks() {
            return mathMarks;
        }
    
        public void setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
        }
    
        public int getChemMarks() {
            return chemMarks;
        }
    
        public void setChemMarks(int chemMarks) {
            this.chemMarks = chemMarks;
        }
    
        public int getPhyMarks() {
            return phyMarks;
        }
    
        public void setPhyMarks(int phyMarks) {
            this.phyMarks = phyMarks;
        }
    
    
}
