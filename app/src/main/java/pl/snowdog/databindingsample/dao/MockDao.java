package pl.snowdog.databindingsample.dao;

import java.util.ArrayList;
import java.util.Random;

import pl.snowdog.databindingsample.model.Quote;

/**
 * Created by bartek on 12.06.15.
 */
public class MockDao {
    public static ArrayList<Quote> quotes;

    static {
        quotes = new ArrayList<>();
        quotes.add(new Quote("If debugging is the process of removing software bugs, then programming must be the process of putting them in.", "Edsger Dijkstra"));
        quotes.add(new Quote("Measuring programming progress by lines of code is like measuring aircraft building progress by weight.","Bill Gates"));
        quotes.add(new Quote("Nine people can’t make a baby in a month.","Fred Brooks"));
        quotes.add(new Quote("Any fool can write code that a computer can understand. Good programmers write code that humans can understand.","Martin Fowler"));
        quotes.add(new Quote("Programming is like sex. One mistake and you have to support it for the rest of your life.","Michael Sinz"));
        quotes.add(new Quote("When debugging, novices insert corrective code; experts remove defective code.","Richard Pattis"));
        quotes.add(new Quote("Most good programmers do programming not because they expect to get paid or get adulation by the public, but because it is fun to program.","Linus Torvalds"));
        quotes.add(new Quote("One of my most productive days was throwing away 1000 lines of code.","Ken Thompson"));
    }

    private static Quote quote;

    public static Quote getRandomQuote() {
        final Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        Quote quote = quotes.get(rand.nextInt(quotes.size()));
        return quote;
    }
}
