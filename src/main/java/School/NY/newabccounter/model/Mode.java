package School.Citytech.newabccounter.model;

public class Mode {

        private String mode;
        private  String description;

    public Mode(String mode, String description) {
        this.mode = mode;
        this.description = description;
    }



    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
