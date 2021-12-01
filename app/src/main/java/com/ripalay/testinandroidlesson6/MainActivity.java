package com.ripalay.testinandroidlesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ripalay.testinandroidlesson6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        math = new Math();
        binding.addBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.num1Et.getText().toString().trim().length() == 0 && binding.num1Et.getText().toString().trim().length() == 0) {
                    binding.resTv.setText("");
                } else {
                    Integer num1 = Integer.parseInt(binding.num1Et.getText().toString().trim());
                    Integer num2 = Integer.parseInt(binding.num2Et.getText().toString().trim());
                    binding.resTv.setText(String.valueOf(math.add(num1, num2)));

                }
            }
        });
        binding.subBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.num1Et.getText().toString().trim().length() == 0 && binding.num1Et.getText().toString().trim().length() == 0) {
                    binding.resTv.setText("");
                } else {
                    Integer num1 = Integer.parseInt(binding.num1Et.getText().toString().trim());
                    Integer num2 = Integer.parseInt(binding.num2Et.getText().toString().trim());
                    binding.resTv.setText(String.valueOf(math.sub(num1, num2)));
                }
            }
        });

        binding.divBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.num1Et.getText().toString().trim().length() == 0 && binding.num1Et.getText().toString().trim().length() == 0) {
                    binding.resTv.setText("");
                } else {
                    Integer num1 = Integer.parseInt(binding.num1Et.getText().toString().trim());
                    Integer num2 = Integer.parseInt(binding.num2Et.getText().toString().trim());
                    binding.resTv.setText(String.valueOf(math.div(num1, num2)));
                }
            }
        });
        binding.multiplyBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.num1Et.getText().toString().trim().length() == 0 && binding.num1Et.getText().toString().trim().length() == 0) {
                    binding.resTv.setText("");
                } else {
                    Integer num1 = Integer.parseInt(binding.num1Et.getText().toString().trim());
                    Integer num2 = Integer.parseInt(binding.num2Et.getText().toString().trim());
                    binding.resTv.setText(String.valueOf(math.multiply(num1, num2)));
                }

            }
        });

    }
}