package com.example.hwplaner;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.hwplaner.R.id.homework;

/**
 * Adapter to bind a ToDoItem List to a view
 */
public class ToDoItemAdapter extends ArrayAdapter<Homework> {

    /**
     * Adapter context
     */
    Context mContext;

    /**
     * Adapter View layout
     */
    int mLayoutResourceId;

    public ToDoItemAdapter(Context context, int layoutResourceId) {
        super(context, layoutResourceId);

        mContext = context;
        mLayoutResourceId = layoutResourceId;
    }

    /**
     * Returns the view for a specific item on the list
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        final Homework currentItem = getItem(position);

        if (row == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            row = inflater.inflate(mLayoutResourceId, parent, false);
        }

        row.setTag(currentItem);
        final TextView tv = (TextView) row.findViewById(homework);
        tv.setText(currentItem.getTitle());

        final Button button1 = (Button) row.findViewById(R.id.date);
        button1.setText(currentItem.getDate());

        final Button button2 = (Button) row.findViewById(R.id.subject);
        button2.setText(currentItem.getSubject());

        final LinearLayout frameLayout = (LinearLayout) row.findViewById(R.id.frame);

        switch (currentItem.getSubject()){

            case("Deutsch"):
                frameLayout.setBackgroundColor(Color.parseColor("#633DBF"));
                break;
            case("Mathe"):
                frameLayout.setBackgroundColor(Color.parseColor("#0F825F"));
                break;
            case("Französisch"):
                frameLayout.setBackgroundColor(Color.parseColor("#EE2808"));
                break;
            case("Geschichte"):
                frameLayout.setBackgroundColor(Color.parseColor("#459C1B"));
                break;
            case("Chemie"):
                frameLayout.setBackgroundColor(Color.parseColor("#1A81DB"));
                break;
            case("Physik"):
                frameLayout.setBackgroundColor(Color.parseColor("#EF871F"));
                break;


        }

        final RelativeLayout layout = (RelativeLayout) row.findViewById(R.id.rlayout);
        layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (mContext instanceof ToDoActivity) {
                    ToDoActivity activity = (ToDoActivity) mContext;
                    activity.openHomeworkActivity(currentItem);
                }
            }
        });

        return row;
    }

}