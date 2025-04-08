class EligibleToVoteException extends Exception {
    public EligibleToVoteException(String message) {
        super(message);
    }
}

public class CustomExceptions {
    private int age;

    public CustomExceptions(int age) {  
        this.age = age;
    }

    public void checkEligibility() throws EligibleToVoteException {
        if (age < 18) {  
            throw new EligibleToVoteException("Permission Denied. Candidate must be greater than 18 to vote!");
        } else {
            System.out.println("Permission Allowed: Candidate is Eligible to Vote");
        }
    }

    public static void main(String[] args) {
        CustomExceptions student1 = new CustomExceptions(15);
        CustomExceptions student2 = new CustomExceptions(19);

        try {
            student1.checkEligibility();
        } catch (EligibleToVoteException e) {
            System.out.println(e.getMessage());
        }

        try {
            student2.checkEligibility();
        } catch (EligibleToVoteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All eligibility checks completed."); 
    }
}
/*
Permission Denied. Candidate must be greater than 18 to vote!
Permission Allowed: Candidate is Eligible to Vote
All eligibility checks completed.
*/