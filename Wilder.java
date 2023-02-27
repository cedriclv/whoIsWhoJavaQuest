public class Wilder {

    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(Boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        String message = "";
        if(this.isAware()) {
            message = "Je m'appelle " + this.firstName + " et je suis aware";
        } else {
            message = "Je m'appelle " + this.firstName + " et je ne suis pas aware";
        }



        return message;
    }

}