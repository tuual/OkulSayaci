package furkan.karapinar.okulsayaci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = (TextView) findViewById(R.id.tv2);
        textView = (TextView) findViewById(R.id.tv1);
        textView3 = (TextView) findViewById(R.id.tv3);
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        LocalDate today =  LocalDate.now();

        String inputString2 = "16 06 2023";
        String inputString3 = "17 06 2023";
        String inputString4 = "04 06 2023";

        try {
            Date date1 = myFormat.parse(today.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            textView.setText("Okulun Kapanmasına: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            Date date3 = myFormat.parse(today.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
            Date date4 = myFormat.parse(inputString3);
            long diff = date4.getTime() - date3.getTime();
            textView2.setText("YKS Sınavına: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            Date date5 = myFormat.parse(today.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
            Date date6 = myFormat.parse(inputString4);
            long diff = date6.getTime() - date5.getTime();
            textView3.setText("LGS Sınavına: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}