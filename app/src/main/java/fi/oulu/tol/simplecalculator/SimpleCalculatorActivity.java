package fi.oulu.tol.simplecalculator;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

import java.math.BigInteger;

public class SimpleCalculatorActivity extends ActionBarActivity {
//public class SimpleCalculatorActivity extends Activity implements OnClickListener
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
    EditText summary;
    BigInteger result = BigInteger.ZERO;
    BigInteger store = BigInteger.ZERO;
    LinearLayout linearLayout;

    /*
    @Override
    protected void onStateInstanceState(Bundle SavedInstanceState){
        SavedInstanceState.putAll(SavedInstanceState);
        super.onSaveInstanceState(SavedInstanceState);
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);

        //Find resources
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        summary = (EditText) findViewById(R.id.summary);
        linearLayout = (LinearLayout) findViewById(R.id.layout1);


        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(7).toString());
                result = result.add(BigInteger.valueOf(7));
            }

        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
              summary.setText(BigInteger.valueOf(8).toString());
              result = result.add(BigInteger.valueOf(8));
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                    summary.setText(BigInteger.valueOf(9).toString());
                    result = result.add(BigInteger.valueOf(9));
            }
        });

        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(4).toString());
                result = result.add(BigInteger.valueOf(4));
            }
        });

        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(5).toString());
                result = result.add(BigInteger.valueOf(5));
            }
        });

        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(6).toString());
                result = result.add(BigInteger.valueOf(6));
            }
        });

        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(1).toString());
                result = result.add(BigInteger.valueOf(1));
            }
        });

        button8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(2).toString());
                result = result.add(BigInteger.valueOf(2));
            }
        });

        button9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(3).toString());
                result = result.add(BigInteger.valueOf(3));
            }
        });

        button10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(BigInteger.valueOf(0).toString());
                result = result.add(BigInteger.valueOf(0));
            }
        });

        button11.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                summary.setText(result.toString());
            }
        });

       // onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_simple_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_clear) {
            result = BigInteger.ZERO;
            summary.setText("0");
            return true;
        }else if(id == R.id.action_store) {
            store = BigInteger.valueOf(Long.valueOf(summary.getText().toString()));
            result = BigInteger.ZERO;
            return true;
        }else if(id == R.id.action_recall) {
            summary.setText(store.toString());
            result = result.add(store);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}





