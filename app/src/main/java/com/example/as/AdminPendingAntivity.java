package com.example.as;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.as.classes.adapters.SARAdapter;
import com.example.as.classes.adapters.SARAdapter.OnSARListener;
import com.example.as.classes.database.ConstantsDataBase;
import com.example.as.classes.database.SARData;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AdminPendingAntivity extends AppCompatActivity implements OnSARListener {

    private List<SARData> sarDataList;
    boolean stateButton = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_pending);

        Button buttonAction = findViewById(R.id.button_action);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        sarDataList = new ArrayList<>();

        FirebaseDatabase.getInstance().getReference(ConstantsDataBase.SARS)
                .addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot keyNode : snapshot.getChildren()) {
                    SARData sarData = keyNode.getValue(SARData.class);
                    if (!sarData.getState()) {
                        sarDataList.add(sarData);
                    }
                }
                SARAdapter sarAdapter;
                sarAdapter = new SARAdapter(AdminPendingAntivity.this, sarDataList,
                        AdminPendingAntivity.this);
                recyclerView.setAdapter(sarAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager
                        (AdminPendingAntivity.this, LinearLayoutManager.VERTICAL,false));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    @Override
    public void onSARClick(int position) {

    }
}
