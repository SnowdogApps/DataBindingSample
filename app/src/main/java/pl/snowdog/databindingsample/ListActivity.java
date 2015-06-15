package pl.snowdog.databindingsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import de.greenrobot.event.EventBus;
import pl.snowdog.databindingsample.adapter.QuotesAdapter;
import pl.snowdog.databindingsample.dao.MockDao;
import pl.snowdog.databindingsample.databinding.ActivityListBinding;
import pl.snowdog.databindingsample.event.ItemClickEvent;

public class ListActivity extends AppCompatActivity {

    private QuotesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        binding.setTotal(MockDao.getTotal());
        adapter = new QuotesAdapter(MockDao.quotes);
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    public void onEvent(ItemClickEvent event) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("index", event.getPosition());
        startActivity(intent);
    }
}
