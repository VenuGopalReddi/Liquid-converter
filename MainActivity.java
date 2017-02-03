package k00382544.liquidconverter.tamuk.edu.liquidconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    RadioGroup inputradiogroup;
    RadioGroup outputradiogroup;
    Button btnconversion;
    EditText inputvalue;
    TextView result;
    double input,output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputvalue = (EditText) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.output);
        btnconversion = (Button) findViewById(R.id.conversionbtn);
        inputradiogroup = (RadioGroup) findViewById(R.id.inputRadioGroup);
        outputradiogroup = (RadioGroup) findViewById(R.id.outputRadioGroup);

    /* When Doconversion button is clicked, btnconcenrsion onclick listener method starts executing*/

        btnconversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* The selected radio buttons from inputradioGroup and outputradioGroup are stored
                 in selectedinputId and selectedoutputId rescpectively*/

                int selectedinputId=inputradiogroup.getCheckedRadioButtonId();
                int selectedoutputId=outputradiogroup.getCheckedRadioButtonId();

                /* check if input field is empty.If it is empty it will return*/
                if(TextUtils.isEmpty(inputvalue.getText().toString())) {
                    return;
                }
                /* stores the entered value into input variable which is of double type*/
                input=Double.parseDouble(inputvalue.getText().toString());

                /*By using selectedinputid,the clicked unit of radio button value  gets
                converted into fluidounce  */
                /*I am using fluidounce as medium of conversion to decrease the redundancy of code.
                Any input unit of radio button is clicked its corresponding value gets
                converted into equivalent fluid ounce unit and stores in input.By using fluid
                ounce value,we can convert it into required  equivalent output unit  */
                /* Thus  given input unit value is converted into required equivalent output unit*/

                switch(selectedinputId){
                    case R.id.fluidouncei:
                        input=input*1;
                        break;
                    case R.id.cupi:
                        input=input*8;
                        break;
                    case R.id.pinti:
                        input=input*16;
                        break;
                    case R.id.quarti:
                        input=input*32;
                        break;
                    case R.id.galloni:
                        input=input*128;
                        break;
                    case R.id.millilitrei:
                        input=input*0.033814;
                       break;
                    case R.id.litrei:
                        input=input*33.814;
                        break;
                    default:
                        break;
                }
                /*By using selectedoutputid,inputliquid unit value is now gets converted to
                 respective clicked unit of outputgroupradiobutton and stores in output.*/
                /* Thus  given input unit value is converted into required equivalent output unit*/
                switch (selectedoutputId){
                    case R.id.fluidounceo:
                        output=input*1;
                        break;
                    case R.id.cupo:
                        output=input/8;
                        break;
                    case R.id.pinto:
                        output=input/16;
                        break;
                    case R.id.quarto:
                        output=input/32;
                        break;
                    case R.id.gallono:
                        output=input/128;
                        break;
                    case R.id.millilitreo:
                        output=(input/(0.033814));
                        break;
                    case R.id.litreo:
                        output=(input/(33.814));
                        break;
                    default:
                        break;
                }
                /*Decimal format is used to trail the unnecessary zeros in output and if output is
                * decimal number then displays upto three decimal points*/
                DecimalFormat format = new DecimalFormat("0.###");
                result.setText(format.format(output));
            }
        });
    }
}
