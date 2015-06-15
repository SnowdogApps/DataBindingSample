package pl.snowdog.databindingsample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

import pl.snowdog.databindingsample.databinding.ItemQuoteBinding;
import pl.snowdog.databindingsample.model.Quote;

/**
 * Created by bartek on 15.06.15.
 */
public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ItemQuoteBinding binding;

        public ViewHolder(ItemQuoteBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ItemQuoteBinding getBinding() {
            return binding;
        }
    }

    private ArrayList<Quote> quotes;

    public QuotesAdapter(ArrayList<Quote> quotes) {
        this.quotes = quotes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ItemQuoteBinding binding = ItemQuoteBinding.
                inflate(LayoutInflater.from(viewGroup.getContext()));

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.getBinding().setQuote(quotes.get(i));
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }
}
