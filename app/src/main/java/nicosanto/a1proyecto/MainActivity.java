package nicosanto.a1proyecto;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String msg="El valor mayor es:" + valorMinimo();

        tvValor=(TextView)findViewById(R.id.tvValor);

        tvValor.setText(msg);
    }

    private int valorMinimo(){
        int a=5;
        int b=10;
        int c=20;
        int mayor;

        if(a>b){
            mayor=a;
        }
        else{
            mayor=b;
        }

        if(c>mayor){
            mayor=c;
        }
        return mayor;
    }


}
