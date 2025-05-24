public class EmployeeProfile {

    // Please note that all details are only examples

    public String employeeProfile() {
        // Initialize employee data (in a real app, these would likely be instance
        // variables)
        int employeeNumber = 12345;
        String employeeLastName = "Doe";
        String employeeFirstName = "John";
        String birthday = "1990-05-15";
        String address = "123 Main St, Cityville";
        int contactNumber = 987654321;
        int SSSNumber = 123456789;
        int philHealthNumber = 987654321;
        int tinNumber = 123456789;
        int pagIbigNumber = 987654321;
        String status = "Regular";
        String position = "Software Developer";
        String immediateSupervisor = "Jane Smith";

        // Format the profile information
        String profile = String.format(
                "EMPLOYEE PROFILE\n" +
                        "----------------\n" +
                        "Employee #: %d\n" +
                        "Name: %s, %s\n" +
                        "Birthday: %s\n" +
                        "Address: %s\n" +
                        "Contact: %d\n" +
                        "\nGOVERNMENT IDS:\n" +
                        "SSS: %d\n" +
                        "PhilHealth: %d\n" +
                        "TIN: %d\n" +
                        "Pag-IBIG: %d\n" +
                        "\nEMPLOYMENT DETAILS:\n" +
                        "Status: %s\n" +
                        "Position: %s\n" +
                        "Supervisor: %s",
                employeeNumber,
                employeeLastName, employeeFirstName,
                birthday,
                address,
                contactNumber,
                SSSNumber,
                philHealthNumber,
                tinNumber,
                pagIbigNumber,
                status,
                position,
                immediateSupervisor);

        return profile;
    }

}
