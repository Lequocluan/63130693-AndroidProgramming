package luanlq.myapplication;

public class examData {
    String name;
    String date;
    String massage;

    public examData(String name, String date, String massage) {
        this.name = name;
        this.date = date;
        this.massage = massage;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMassage() {
        return massage;
    }
}
