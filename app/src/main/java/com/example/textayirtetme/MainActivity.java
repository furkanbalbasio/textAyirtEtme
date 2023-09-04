package com.example.textayirtetme;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView dogrulukYuzdesi;
    double x=0,y=0,yuzde=0;
    Button kralButton;
    Button zenginButton;
    Button yasarmisButton;

    Button kaplumbagaButton;
    Button hizliButon;
    Button tavsaninButton;
    ForegroundColorSpan fcs;
    ForegroundColorSpan fcs2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView3);
        dogrulukYuzdesi =findViewById(R.id.dogrulukYuzdesi);
        zenginButton=findViewById(R.id.zenginButton);
        kralButton=findViewById(R.id.kralButton);
        yasarmisButton=findViewById(R.id.yasarmisButton);
        kaplumbagaButton=findViewById(R.id.kaplumbagaButton);
        hizliButon=findViewById(R.id.hizliButton);
        tavsaninButton=findViewById(R.id.tavsaninButton);
        String text = "Bir zamanlar zengin bir ülkeyi yöneten bir kral vardı. Bir gün ülkesinin her köşesini ziyaret etmek istedi.";
        SpannableString ss = new SpannableString(text);
       // StyleSpan boldSpan = new StyleSpan(Color.YELLOW);
        fcs = new ForegroundColorSpan(Color.rgb(204, 0, 0));
       // ss.setSpan(boldSpan, 13, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcs, 43, 48, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView.setText(ss);
        kaplumbagaButton.setVisibility(View.INVISIBLE);
        hizliButon.setVisibility(View.INVISIBLE);
        tavsaninButton.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);

        kralButton.setOnClickListener(view -> {
            kralButton.setBackgroundColor(Color.RED);
            x++;
            visibility();
        });
        zenginButton.setOnClickListener(view -> {
            zenginButton.setBackgroundColor(Color.GREEN);
            y++;
            visibility();
        });
        yasarmisButton.setOnClickListener(view -> {
            yasarmisButton.setBackgroundColor(Color.RED);
            y++;
            visibility();
        });
        String text2 = "Günlerden bir gün, kaplumbağa tavşanın karşısına geçmiş:Ben senden daha hızlı koşarım! demiş.";
        SpannableString ss2 = new SpannableString(text2);
        fcs2 = new ForegroundColorSpan(Color.rgb(204, 0, 0));
        ss2.setSpan(fcs2, 29, 38, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView2.setText(ss2);
        kaplumbagaButton.setOnClickListener(view -> {
            kaplumbagaButton.setBackgroundColor(Color.RED);
            y++;
            visibility2();
        });
        hizliButon.setOnClickListener(view -> {
            hizliButon.setBackgroundColor(Color.RED);
            y++;
            visibility2();
        });
        tavsaninButton.setOnClickListener(view -> {
            tavsaninButton.setBackgroundColor(Color.GREEN);
            x++;
            visibility2();
        });
    }
    public void visibility(){
        setYuzde();
        kralButton.setVisibility(View.INVISIBLE);
        zenginButton.setVisibility(View.INVISIBLE);
        yasarmisButton.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        kaplumbagaButton.setVisibility(View.VISIBLE);
        hizliButon.setVisibility(View.VISIBLE);
        tavsaninButton.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
    }
    public void visibility2(){
        setYuzde();
        kaplumbagaButton.setVisibility(View.INVISIBLE);
        hizliButon.setVisibility(View.INVISIBLE);
        tavsaninButton.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
    }
    @SuppressLint("SetTextI18n")
    public void setYuzde(){
        yuzde=(x/(x+y))*100;
        dogrulukYuzdesi.setText("Doğruluk Yüzdesi:%"+Math.round(yuzde));
    }
}