import implementations.Student;

public class GreatStudent extends Student {
    private String giaiDacBiet;

    public String getGiaiDacBiet() {
        return giaiDacBiet;
    }

    public void setGiaiDacBiet(String giaiDacBiet) {
        this.giaiDacBiet = giaiDacBiet;
    }

    public GreatStudent(String giaiDacBiet) {
        this.giaiDacBiet = giaiDacBiet;
    }

    public GreatStudent(int ID, String name, int age, double score, String giaiDacBiet) {
        super(ID, name, age, score);
        this.giaiDacBiet = giaiDacBiet;
    }

    @Override
    public String toString() {
        return super.toString() +"Giai dac biet: "+giaiDacBiet;
    }
}
