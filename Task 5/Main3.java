class Patient {
    private String patientName;
    private String nationalId;

    public Patient(String patientName, String nationalId) {
        this.patientName = patientName;
        this.nationalId = nationalId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getNationalId() {
        return nationalId;
    }
}



class IdValidator {

    public boolean validate(String nationalId) {
        return nationalId.length() == 10 || nationalId.length() == 17;
    }
}


// Responsible only for sending SMS notifications
class SmsService {

    public void sendConfirmation(Patient patient) {
        System.out.println(
            "Sending SMS to " + patient.getPatientName() +
            ": Registration successful."
        );
    }
}

public class Main {

    public static void main(String[] args) {

        // Patient data
        Patient patient = new Patient("John Smith", "1234567890");

        // Validation
        IdValidator validator = new IdValidator();

        // Notification
        SmsService smsService = new SmsService();


        if (validator.validate(patient.getNationalId())) {
            smsService.sendConfirmation(patient);
        } else {
            System.out.println("Invalid National ID.");
        }
    }
}
