public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

        if(birthYear < 0) {
            System.out.println("Invalid birth year");
        } else {
            this.birthYear = birthYear;
        }

        if(height < 0) {
            System.out.println("Invalid height");
            this.height = 165;
        } else {
            this.height = height;
        }

        if(weight < 0) {
            System.out.println("Invalid weight");
            this.weight = 65;
        } else {
            this.weight = weight;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge(int currentYear) {
        return currentYear - this.birthYear;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBMI() {
        if(height <= 0 || weight <= 0) {
            return 0.0;
        } else {
            double MeterHigh = height / 100;
            return weight / (MeterHigh * MeterHigh);
        }
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood Group: " + bloodGroup);
        System.out.println("patient Phone Number: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());
    }

}