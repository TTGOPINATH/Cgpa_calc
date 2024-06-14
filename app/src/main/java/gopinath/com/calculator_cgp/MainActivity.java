package gopinath.com.calculator_cgp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText mark1,credit1,mark2,credit2,mark3,credit3,mark4,credit4,mark5,credit5;
    TextView textview1;
    Button butn;
    int a=19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mark1=findViewById(R.id.mark1);
        credit1=findViewById(R.id.credit1);
        mark2=findViewById(R.id.mark2);
        credit2=findViewById(R.id.credit2);
        mark3=findViewById(R.id.mark3);
        credit3=findViewById(R.id.credit3);
        mark4=findViewById(R.id.mark4);
        credit4=findViewById(R.id.credit4);
        mark5=findViewById(R.id.mark5);
        credit5=findViewById(R.id.credit5);
        butn=findViewById(R.id.butn);
        textview1=findViewById(R.id.result);
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=mark1.getText().toString();
                String value2=credit1.getText().toString();
                String value3=mark2.getText().toString();
                String value4=credit2.getText().toString();
                String value5=mark3.getText().toString();
                String value6=credit3.getText().toString();
                String value7=mark4.getText().toString();
                String value8=credit4.getText().toString();
                String value9=mark5.getText().toString();
                String value10=credit5.getText().toString();

                float result1=Float.parseFloat(value1);
                float result2=Float.parseFloat(value2);
                float result3=Float.parseFloat(value3);
                float result4=Float.parseFloat(value4);
                float result5=Float.parseFloat(value5);
                float result6=Float.parseFloat(value6);
                float result7=Float.parseFloat(value7);
                float result8=Float.parseFloat(value8);
                float result9=Float.parseFloat(value9);
                float result10=Float.parseFloat(value10);


                float r1=result1*result2+result3*result4+result5*result6+result7*result8+result9*result10;
                float r=r1/a;

                textview1.setText(" "+r);
                Toast.makeText(MainActivity.this, "Your calculation is done👌", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,"Thankyou for using my App",Toast.LENGTH_LONG).show();




            }

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
    }
}