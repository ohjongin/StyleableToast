package com.muddzdev.styleabletoast;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    private StyleableToast styleableToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Toaster(View v) {
        switch (v.getId()) {
            case R.id.button1:
                StyleableToast.makeText(this, "Turn off fly mode", Toast.LENGTH_SHORT, R.style.StyleableToast).show();
                break;

            case R.id.button2:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .text(fromHtml("New update available"))
                        .textColor(Color.WHITE)
                        .textSize(18)
                        .icon(R.drawable.ic_file_download)
                        .backgroundColor(Color.parseColor("#23ad33"))
                        .build();
                break;

            case R.id.button3:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .duration(Toast.LENGTH_LONG)
                        .text("Your collection has been updated")
                        .textColor(Color.WHITE)
                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/dosis.otf"))
                        .backgroundColor(Color.parseColor("#cc3784"))
                        .build();
                break;

            case R.id.button4:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .text("Thank you for your health donation!")
                        .textColor(Color.parseColor("#6063b2"))
                        .strokeWidth(2)
                        .duration(Toast.LENGTH_LONG)
                        .strokeColor(Color.parseColor("#989ad1"))
                        .backgroundColor(Color.WHITE)
                        .background(R.drawable.shape_success)
                        .build();

                break;

            case R.id.button5:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .icon(R.drawable.ic_overheating)
                        .text("Phone is overheating!")
                        .textBold()
                        .textColor(Color.parseColor("#FFDA44"))
                        .cornerRadius(5)
                        .build();
                break;

            case R.id.button6:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .duration(Toast.LENGTH_LONG)
                        .icon(R.drawable.ic_autorenew_black_24dp)
                        .spinIcon()
                        .text("Downloading your information")
                        .textColor(Color.WHITE)
                        .backgroundColor(Color.parseColor("#184c6d"))
                        .build();
                break;

            case R.id.button7:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .text(fromHtml("<b>New</b> update <font color=\"#ff4350\">available</font>"))
                        .textColor(Color.WHITE)
                        .textSize(18)
                        .icon(R.drawable.ic_file_download)
                        .backgroundColor(Color.parseColor("#23ad33"))
                        .build();
                break;

            case R.id.button8:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .duration(Toast.LENGTH_LONG)
                        .text("Your collection has been updated")
                        .textColor(Color.WHITE)
                        .textSize(20)
                        .typeface(Typeface.createFromAsset(getAssets(), "fonts/dosis.otf"))
                        .background(R.drawable.shape_warning)
                        .build();
                break;

            case R.id.button9:
                styleableToast = new StyleableToast
                        .Builder(this)
                        .text("Thank you for your health donation!")
                        .textColor(Color.WHITE)
                        .textSize(24)
                        .strokeWidth(2)
                        .duration(Toast.LENGTH_LONG)
                        .strokeColor(Color.parseColor("#989ad1"))
                        .backgroundColor(Color.WHITE)
                        .background(R.drawable.shape_success)
                        .build();

                break;
        }

        if (styleableToast != null) {
            styleableToast.show();
            styleableToast = null;
        }
    }

    protected Spanned fromHtml(CharSequence html){
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html.toString(), Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html.toString());
        }
        return result;
    }
}
