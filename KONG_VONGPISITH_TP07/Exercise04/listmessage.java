package KONG_VONGPISITH_TP07.Exercise04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class listmessage {
    private String from_username, to_username, title, text;

    ArrayList<listmessage> lm = new ArrayList<listmessage>();

    public listmessage() {

    }

    public listmessage(String from_username, String to_username, String title, String text) {
        this.from_username = from_username;
        this.to_username = to_username;
        this.title = title;
        this.text = text;
    }

    public void sendSMS(int index, String from_username, String to_usernam, String title, String text) {
        lm.add(index, new listmessage(from_username, to_usernam, title, text));
    }

    public void viewDetail(String to_username) {
        for (listmessage lms : lm) {
            if (lms.to_username.equals(to_username)) {
                System.out.println("Number that send: " + lms.from_username);
                System.out.println("Number that receive: " + lms.to_username);
                System.out.println("Tittle: " + lms.title);
                System.out.println("Content: " + lms.text);
            }
        }
    }
}
