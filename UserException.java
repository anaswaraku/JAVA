class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

class UserException {
    public static void main(String args[]) {
        int age = 15;
        try {
            if (age < 18 || age > 60) {
                throw new InvalidAge("Age must be between 18 and 60!!!");
            } else {
                System.out.println("Age is valid");
            }
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}
