package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button addButton, subtractButton, multiplyButton, divideButton;
    float ValueOne, ValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ET1 = findViewById(R.id.et1);
        Button ET2 = findViewById(R.id.et2);

        Button num0 = findViewById(R.id.btn0);
        Button num1 = findViewById(R.id.btn1);
        Button num2 = findViewById(R.id.btn2);
        Button num3 = findViewById(R.id.btn3);
        Button num4 = findViewById(R.id.btn4);
        Button num5 = findViewById(R.id.btn5);
        Button num6 = findViewById(R.id.btn6);
        Button num7 = findViewById(R.id.btn7);
        Button num8 = findViewById(R.id.btn8);
        Button num9 = findViewById(R.id.btn9);
        Button AC = findViewById(R.id.AC);
        Button Equal = findViewById(R.id.equel);
        addButton = findViewById(R.id.plus);
        subtractButton = findViewById(R.id.minus);
        multiplyButton = findViewById(R.id.btnx);
        divideButton = findViewById(R.id.btndivide);
        Button dot = findViewById(R.id.dot);
        EditText number2 = findViewById(R.id.num1);
        EditText number1 = findViewById(R.id.num2);
        TextView outcome = findViewById(R.id.outcome);
        TextView Action = findViewById(R.id.action);





        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(number1.getText() + "");
                ValueTwo = Float.parseFloat(number2.getText() + "");
                if (Action.getText() == "+") {
                    outcome.setText(ValueOne + ValueTwo + "");
                    Addition = false;
                }
                if (Action.getText() == "-") {
                    outcome.setText(ValueOne - ValueTwo + "");
                    Subtract = false;
                }
                if (Action.getText() == "*") {
                    outcome.setText(ValueOne * ValueTwo + "");
                    Multiplication = false;
                }
                if (Action.getText() == "/") {
                    outcome.setText(ValueOne / ValueTwo + "");
                    Division = false;
                }
            }
        });

        //action buttons
        {
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Action.setText("+");
                }

            });
            subtractButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Action.setText("-");
                }
            });
            multiplyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Action.setText("*");
                }
            });
            divideButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Action.setText("/");

                }
            });
        }
        ET1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "1");
                    }
                });
                num2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "2");
                    }
                });
                num3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "3");
                    }
                });
                num4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "4");
                    }
                });

                num5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "5");
                    }
                });
                num6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "6");
                    }
                });
                num7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "7");
                    }
                });
                num8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "8");
                    }
                });
                num9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "9");
                    }
                });
                num0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + "0");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText(number1.getText() + ".");
                    }
                });
                AC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number1.setText("");
                    }
                });
            }

        });

        ET2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "1");
                    }
                });
                num2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "2");
                    }
                });
                num3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "3");
                    }
                });
                num4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "4");
                    }
                });

                num5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "5");
                    }
                });
                num6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "6");
                    }
                });
                num7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "7");
                    }
                });
                num8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "8");
                    }
                });
                num9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "9");
                    }
                });
                num0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + "0");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText(number2.getText() + ".");
                    }
                });
                AC.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number2.setText("");
                    }
                });
            }

        });
    }
}