package pl.snowdog.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pl.snowdog.databindingsample.dao.MockDao;
import pl.snowdog.databindingsample.databinding.ActivityMainBinding;
import pl.snowdog.databindingsample.model.Quote;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Quote quote;

        if (getIntent().hasExtra("index")) {
            quote = MockDao.quotes.get(getIntent().getIntExtra("index", 0));
        } else {
            quote = MockDao.getRandomQuote();
        }

        binding.setQuote(quote);

        binding.nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Quote quote = MockDao.getRandomQuote();
                binding.setQuote(quote);
            }
        });
    }
}
