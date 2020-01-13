public class staticmethod {
    private String subject;

    staticmethod (String subject) {
        this.subject = subject;
    }

    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + mywebsite.Website);
    }

    public static void changeWebsite(String website) {
        mywebsite.Website = website;
    }

}
