public class Patient {

    // Fields
    private int id;
    private String name;
    private int birthYear;
    private double height; // cm
    private double weight; // kg
    private String bloodGroup;
    private int phoneNumber;

    // Construc
    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, int phoneNumber) {
        this.id = id;
        this.name = name;

        if (phoneNumber > 0 && phoneNumber <= 999999999) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number (must be 1-9 digits)");
            this.phoneNumber = 0;
        }

        // ตรวจปีเกิด
        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Invalid birth year");
            this.birthYear = 0;
        }

        // ตรวจความสูง
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height");
            this.height = 0;
        }

        // ตรวจน้ำหนัก
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight");
            this.weight = 0;
        }

        if (bloodGroup == "AB" || bloodGroup == "A" || bloodGroup == "B" || bloodGroup == "O") {
            this.bloodGroup = bloodGroup ;
        } else {
            this.bloodGroup = "XX" ;
        }
    }

    // Getters
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

    public double getWeight() {return weight;}

    public String getBloodGroup() {return bloodGroup;}


    public int getPhoneNumber() { return phoneNumber;}

    // Calculate age
    public int getAge(int currentYear) {
        if (birthYear <= 0 || currentYear < birthYear) {
            return 0;
        }
        return currentYear - birthYear;
    }

    public double getBMI() {
        if (height <= 0 || weight <= 0) return 0.0;

        double heightMeter = height / 100.0; // cm -> m
        double bmi = weight / (heightMeter * heightMeter);

        // ทำทศนิยม2ตำแหน่ง
        return Math.round(bmi * 100.0) / 100.0;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BMI: " + getBMI());
        System.out.println("Patient GroupBlood: " + bloodGroup);
        System.out.println("Patient PhoneNumber: +66" + phoneNumber);
        System.out.println("----------------------------");
    }
}