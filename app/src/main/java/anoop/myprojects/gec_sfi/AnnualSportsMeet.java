package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnnualSportsMeet extends Fragment {


    public AnnualSportsMeet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_annual_sports_meet, container, false);
        //Events.right1.setVisibility(ImageView.GONE);
        //Events.left1.setVisibility(ImageView.VISIBLE);

        TextView tv_explore;

        tv_explore = view.findViewById(R.id.exploreinvento);

        tv_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragmentTransaction=getSupportFragmentManager().beginTransaction();
                Intent intent = new Intent(getContext(),AnnualSportMeetExplore.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
