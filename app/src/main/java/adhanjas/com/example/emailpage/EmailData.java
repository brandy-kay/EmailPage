package adhanjas.com.example.emailpage;

import java.util.ArrayList;
import java.util.List;

public class EmailData {
    public static List<Email_model> emailData=new ArrayList<>();
   // private static Object btn_star_big_off;

    public static List<Email_model> createData(){
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"Brandy","commedian","3:40pm"));
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"Sophy","Actor","4:40pm"));
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"daphy","Jocker","5:40pm"));
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"Ariana","magician","6:40pm"));
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"Brenda","reader","7:40pm"));
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"Valary","singer","8:40pm"));
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"Mumbi","designer","9:40pm"));
        emailData.add(new Email_model(R.drawable.ic_teamwork,R.drawable.ic_launcher_foreground,"Seth","teacher","10:40pm"));
        return emailData;
    }
}

