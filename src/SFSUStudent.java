public class SFSUStudent {
    private static int numberOfStudents;
    private String firstName;
    private String lastName;
    private String preferredName;
    private String gender;
    private int age;
    private int ID;
    private String[] classes;

    public SFSUStudent(String firstName, String lastName, String preferredName, int age, int ID, String[] classes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredName = preferredName;
        this.age = age;
        this.ID = ID;
        this.classes = classes;
        numberOfStudents++;
    }

    public SFSUStudent(String firstName, String lastName, String preferredName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredName = preferredName;
        numberOfStudents++;
    }

    public SFSUStudent() {
        numberOfStudents++;
    }

    public static void main(String[] args) {
        SFSUStudent s1 = new SFSUStudent();
        SFSUStudent s2 = new SFSUStudent("Kullathon", "Sitthisarnwattanachai", "Mos");
        // using getter is preferred
        System.out.println(s2.getFirstName());
        System.out.println(s2.firstName);
        s2.setGender("M");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
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

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public void addClass(String newClass) {
        String[] newClasses = new String[classes.length + 1];
        for (int i = 0; i < classes.length; i++) {
            newClasses[i] = classes[i];
        }
        newClasses[classes.length + 1] = newClass;
        classes = newClasses;
    }
}
