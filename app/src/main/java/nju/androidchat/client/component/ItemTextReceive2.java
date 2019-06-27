package nju.androidchat.client.component;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.StyleableRes;

import java.util.UUID;

import nju.androidchat.client.R;

public class ItemTextReceive2 extends LinearLayout {
    @StyleableRes
    int index0 = 0;

    private TextView textView;
    private Context context;
    private UUID messageId;
    private OnRecallMessageRequested onRecallMessageRequested;


    public ItemTextReceive2(Context context, String text, UUID messageId) {
        super(context);
        this.context = context;
        inflate(context, R.layout.item_text_receive2, this);
        ImageView imageView=findViewById(R.id.imgView);
        if(!text.equals("gsy.jpg"))
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.error));
        this.messageId = messageId;
        //setText(text);
    }

    public void init(Context context) {

    }

    public String getText() {
        return textView.getText().toString();
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
