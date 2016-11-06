package com.felipegenuino.funfactsproject;


import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
        // Fields (Member Variables) - Properties about the object
        private String[] mColors = {
                "#3F51B5",
                "#3949AB",
                "#303F9F",
                "#283593",
                "#1A237E",
                "#0097A7",
                "#00838F",
                "#006064",
                "#009688",
                "#00897B",
                "#00796B",
                "#00695C",
                "#004D40",
                "#F44336",
                "#E53935",
                "#D32F2F",
                "#C62828",
                "#B71C1C",
                "#D50000",
                "#E91E63",
                "#D81B60",
                "#C2185B",
                "#AD1457",
                "#880E4F",
                "#FF4081",
                "#F50057",
                "#FF5722",
                "#F4511E",
                "#E64A19",
                "#D84315",
                "#BF360C",
                "#6D4C41",
                "#5D4037",
                "#4E342E"
        };


        //methods - acitons the obejct can take
        public int getColor(){
            String color;

            //Randomly select a fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(mColors.length);
            color = mColors[randomNumber];
            int colorAsInt = Color.parseColor(color);
            return colorAsInt;

        }


}