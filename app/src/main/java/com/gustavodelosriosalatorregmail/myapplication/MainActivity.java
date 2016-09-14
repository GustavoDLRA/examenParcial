package com.gustavodelosriosalatorregmail.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void calculate(View view){
        EditText cajaNumero1=(EditText) findViewById(R.id.cajaNumero1);
        EditText cajaNumero2=(EditText) findViewById(R.id.cajaNumero2);
        TextView comparisonResult=(TextView)findViewById(R.id.comparisonResult);
        TextView additionResult=(TextView) findViewById(R.id.adittionResult);
        TextView substractionResult=(TextView) findViewById(R.id.substractionResult);
        TextView productResult=(TextView) findViewById(R.id.productResult);
        TextView errorMsg=(TextView) findViewById(R.id.errorMsg);
        Button calcular=(Button) findViewById(R.id.calcular);
        Button clean=(Button) findViewById(R.id.clean) ;

        String scajaNumero1=cajaNumero1.getText().toString().trim();
        String scajaNumero2=cajaNumero2.getText().toString().trim();
        String msg="";

        Integer number1=Integer.parseInt(scajaNumero1);
        Integer number2=Integer.parseInt(scajaNumero2);

        if(number1==0&&number2==0){
            errorMsg.setText("No imput on the text boxes yet");
            calcular.setEnabled(false);



        } else if (number2==0){
            errorMsg.setText("Please enter a whole number that isn't 0 in box 2");
            calcular.setEnabled(false);

        }else{
            if (number1>number2) {
                comparisonResult.setText(String.valueOf(number1)"is greater than", String.valueOf(number2));
            }else if (number1<number2) {
                comparisonResult.setText(String.valueOf(number1)"is smaller than", String.valueOf(number2));
            }else if (number1==number2){
                comparisonResult.setText(String.valueOf(number1)"is equal to",String.valueOf(number2));

        }
           Integer suma= number1+number2;
                    additionResult.setText(String.valueOf(suma));
            Integer resta=number1-number2;
            substractionResult.setText(String.valueOf(resta));

            Integer producto=number1*number2;
            productResult.setText(String.valueOf(producto));

            calcular.setEnabled(false);
            cajaNumero1.setEnabled(false);
            cajaNumero2.setEnabled(false);
            clean.setEnabled(true);
            clean.setVisibility(View.VISIBLE);




        }






    }
    public void clean (View view){
        EditText cajaNumero1=(EditText) findViewById(R.id.cajaNumero1);
        EditText cajaNumero2=(EditText) findViewById(R.id.cajaNumero2);
        TextView comparisonResult=(TextView)findViewById(R.id.comparisonResult);
        TextView additionResult=(TextView) findViewById(R.id.adittionResult);
        TextView substractionResult=(TextView) findViewById(R.id.substractionResult);
        TextView productResult=(TextView) findViewById(R.id.productResult);
        Button calcular=(Button) findViewById(R.id.calcular);
        Button clean=(Button) findViewById(R.id.clean) ;

        cajaNumero1.setText("");
        cajaNumero2.setText("");
        comparisonResult.setText("");
        additionResult.setText("");
        substractionResult.setText("");
        productResult.setText("");

        calcular.setEnabled(true);
        clean.setVisibility(View.INVISIBLE);

    }
private boolean isEmpty(EditText cajaNumero1){
    String msg="";
    if (cajaNumero1.getText().toString().trim().length()>0)
        return false;
    return true;

}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


