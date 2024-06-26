package za.ac.cput.domain;
//UserProfile.java
//UserProfile model class
//Author:Braedon Sidney Mullins(222821825)
//Date:27 March 2024
public class UserProfile {
    private String Name;
    private String Surname;
    private String Gender;
    private double Age;
    private String ID;
    private String Location;
    private String Bio;


    public UserProfile() {
    }

    private UserProfile(Builder builder) {
        this.Name = builder.Name;
        this.Surname = builder.Surname;
        this.Gender = builder.Gender;
        this.Age = builder.Age;
        this.ID = builder.ID;
        this.Location=builder.Location;
        this.Bio= builder.Bio;;

    }

//    public UserProfile(String name, String surname, String gender, int age, int ID) {
//        Name = name;
//        Surname = surname;
//        Gender = gender;
//        Age = age;
//        this.ID = ID;
//    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getGender() {
        return Gender;
    }

    public double getAge() {
        return Age;
    }

    public String getID() {
        return ID;
    }

    public String getLocation() {
        return Location;
    }

    public String getBio() {
        return Bio;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", ID='" + ID + '\'' +
                ", Location='" + Location + '\'' +
                ", Bio='" + Bio + '\'' +
                '}';
    }

    public static class Builder {
        private String Name;
        private String Surname;
        private String Gender;
        private double Age;
        private String ID;
        private String Location;
        private String Bio;






        public Builder setName(String Name) {
        this.Name = Name;
        return this;
    }

    public Builder setSurname(String Surname) {
        this.Surname = Surname;
        return this;
    }

    public Builder setGender(String Gender) {
        this.Gender = Gender;
        return this;
    }

    public Builder setAge(double Age) {
        this.Age = Age;
        return this;
    }

    public Builder setID(String ID) {
        this.ID = ID;
        return this;
    }
    public Builder setLocation(String Location){
            this.Location=Location;
            return this;
    }
    public Builder setBio(String Bio){
            this.Bio=Bio;
            return this;
    }

    public Builder copy(UserProfile e) {
        this.Name = e.Name;
        this.Surname = e.Surname;
        this.Gender = e.Gender;
        this.Age = e.Age;
        this.ID = e.ID;
        this.Location= e.Location;
        this.Bio=e.Bio;
        return this;
    }

    public UserProfile build() {
        return new UserProfile(this);
    }
}
}

