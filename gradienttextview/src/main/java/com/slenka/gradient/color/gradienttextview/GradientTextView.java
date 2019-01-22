package com.slenka.gradient.color.gradienttextview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.widget.TextView;

public class GradientTextView extends android.support.v7.widget.AppCompatTextView {


    public GradientTextView(Context context) {
        super(context);
    }

    public static void setGradientColor(TextView textView,int startColor, int endColor)
    {

        TextPaint paint = textView.getPaint();
        float width = paint.measureText("Gradient Colors");

        Shader textShader = new LinearGradient(0, 0, width, textView.getTextSize(),
                new int[]{
                        startColor,
                        endColor,
                }, null, Shader.TileMode.CLAMP);
        textView.getPaint().setShader(textShader);

        textView.setTextColor(startColor);

    }

}
