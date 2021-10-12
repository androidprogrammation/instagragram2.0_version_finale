package com.solal.instagram10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {


    LinearLayout linearLayout, linearLayout2, linearLayout3;
    int a  = 0;
    Drawable coeurplein;

    List<ImageView> coeur = new ArrayList<>();
    int nbrcoeur = -1;

    public void storie(Drawable drawable){


        CircleImageView img = new CircleImageView(this);
        img.setImageDrawable(drawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(200, 200);
        layoutParams.setMargins(35,10,35,10);
        linearLayout3.addView(img, layoutParams);

    }


 public void liker(ImageView imageView){

    imageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(imageView.getDrawable() == coeurplein){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.coeurvide));
            }else{
                imageView.setImageDrawable(coeurplein);
            }
        }
    });



    }









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        coeurplein = getResources().getDrawable(R.drawable.coeurplein);

  linearLayout = findViewById(R.id.linearboutons);
  linearLayout3 = findViewById(R.id.linear);
  linearLayout2 = findViewById(R.id.linear3);




  LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100, 100);
  params.setMargins(25,23, 0,10);

        CircleImageView pp  = new CircleImageView(this);
        pp.setImageDrawable(getResources().getDrawable(R.drawable.e));
        linearLayout.addView(pp, params);


        storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));
        storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));storie(getResources().getDrawable(R.drawable.dd)); storie(getResources().getDrawable(R.drawable.e));


       while (a < 6){
            publication(getResources().getDrawable(R.drawable.dd),"Paul", "Paris", getResources().getDrawable(R.drawable.e)); a += 1;
        }



    }

    ImageView like, commente, envoyer, enregistrer;

    public void publication(Drawable img, String text, String text1, Drawable post1) {


        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setPadding(20,0,0,0);
        linearLayout2.addView(linearLayout);



        //PP NOM de PROFIL LIEU
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(150, 150);
        layoutParams.setMargins(20,10,0,100);


        CircleImageView imageView= new CircleImageView(this);
        imageView.setPadding(20,0,0,0);
        imageView.setImageDrawable(img);
        linearLayout.addView(imageView,  layoutParams);

        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(LinearLayout.VERTICAL);
        linearLayout2.setPadding(0,0,0,20);
        linearLayout.addView(linearLayout2);

        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(170, 70);
        layoutParams2.setMargins(20,10,0,0);

        TextView nomducompte = new TextView(this);
        nomducompte.setText(text);
        nomducompte.setTextColor(getResources().getColor(R.color.noir));
        nomducompte.setPadding(0,12,0,0);
        linearLayout2.addView(nomducompte, layoutParams2);

        TextView nomducompte1 = new TextView(this);
        nomducompte1.setText(text1);
        nomducompte1.setTextSize(14);
        nomducompte1.setPadding(0,0,0,0);
        linearLayout2.addView(nomducompte1, layoutParams2);


        //POST
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 600);
        layoutParams3.setMargins(3,0,0,100);

        ImageView post = new ImageView(this);
        post.setImageDrawable(post1);
        post.setMaxHeight(400);
        post.setMaxWidth(700);
        post.setPadding(1,0,0,1);
        linearLayout2.addView(post,  layoutParams3);



        // LIKE COMMENTAIRE ETC
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout3.setPadding(30,0,0,0);
        linearLayout2.addView(linearLayout3);


        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(90,90);
        layoutParams4.setMargins(15,10,0,50);


        like = new ImageView(this);
        like.setImageDrawable(getResources().getDrawable(R.drawable.coeurvide));
        like.setPadding(0,0,0,0);
        linearLayout3.addView(like,  layoutParams4);

        commente = new ImageView(this);
        commente.setImageDrawable(getResources().getDrawable(R.drawable.commenter));
        commente.setPadding(0,0,0,0);
        linearLayout3.addView(commente,  layoutParams4);

        envoyer = new ImageView(this);
        envoyer.setImageDrawable(getResources().getDrawable(R.drawable.messages));
        envoyer.setPadding(0,0,0,0);
        linearLayout3.addView(envoyer,  layoutParams4);

        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(90,90);
        layoutParams5.setMargins(630,0,40,50);

        enregistrer = new ImageView(this);
        enregistrer.setImageDrawable(getResources().getDrawable(R.drawable.enregistrervide));
        enregistrer.setPadding(0,0,0,0);
        linearLayout3.addView(enregistrer,  layoutParams5);


       coeur.add(like);

       nbrcoeur += 1;

       liker(coeur.get(nbrcoeur));






    }




}