import com.sun.istack.internal.NotNull;

public class Person {
    private String fName, lName;

    public String getfName() {
        return fName;
    }

    public void setfName(@NotNull String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
