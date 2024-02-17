public class Aggregation {
    public static void main(String[] args){
        Instructor instr = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook txtBk = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Instructor instr2 = new Instructor("Joseph","Quinn", "2-1985");
        Textbook txtBk2 = new Textbook("Design Patterns","John Doe","Mcgraw Hill");
        Course course = new Course("Software Engineering", "Mobile App Development", instr, txtBk,instr2,txtBk2);
        course.printing();

    }
     static class Course{
        private final String courseName;
        private final String courseName2;
        private final Instructor instr;
        private final Instructor instr2;
        private final Textbook txtBk;

        private final Textbook txtBk2;

         public Course(String courseName, String courseName2, Instructor instr, Textbook txtBk, Instructor instr2, Textbook txtBk2){
            this.courseName = courseName;
            this.courseName2 = courseName2;
            this.instr = instr;
            this.txtBk = txtBk;
            this.instr2 = instr2;
            this.txtBk2 = txtBk2;

        }
         public void printing(){
             System.out.println(" Course Name: " + courseName +"\n Instructor: " +
                     instr.getFirstName()+" "+ instr.getLastName() + "\n Office: " +
                     instr.getOfficeNum()+ "\n Textbook: " + txtBk.getTitle()+ "\n Author: " +
                     txtBk.getAuthor()+ "\n Publisher: "+ txtBk.getPublisher());
             System.out.println("\n Course Name: " + courseName2 +"\n Instructor: " +
                     instr2.getFirstName()+" "+ instr2.getLastName() + "\n Office: " +
                     instr2.getOfficeNum()+"\n Textbook: " + txtBk2.getTitle()+ "\n Author: " +
                     txtBk2.getAuthor()+ "\n Publisher: "+ txtBk2.getPublisher());
         }
     }
    static class Instructor {
        private String firstName;
        private String lastName;
        private String officeNum;

        public Instructor(String firstName, String lastName, String officeNum) {
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setOfficeNum(officeNum);
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

        public String getOfficeNum() {
            return officeNum;
        }

        public void setOfficeNum(String officeNum) {
            this.officeNum = officeNum;
        }
    }

    static class Textbook {

        private String title;
        private String author;
        private String publisher;

        public Textbook(String title, String author, String publisher) {
            this.setTitle(title);
            this.setAuthor(author);
            this.setPublisher(publisher);

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }
    }
}
