package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link ArticleAdapter} knows how to create a list item layout for each article
 * in the data source (a list of {@link Article} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * Constructs a new {@link ArticleAdapter}.
     *
     * @param context  of the app
     * @param articles is the list of articles, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> articles) {
        super( context, 0, articles );
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of article.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.news_list_item, parent, false );
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem( position );

        // Find the TextView with view ID title
        TextView titleView = listItemView.findViewById( R.id.title_text_view );
        // Display the title of the current article in that TextView
        titleView.setText( currentArticle.getTitle() );

        // Find the TextView with view ID section
        TextView sectionView = listItemView.findViewById( R.id.title_text_view );
        // Display the section name of the current article in that TextView
        sectionView.setText( currentArticle.getSectionName() );

        // Find the TextView with view ID author
        TextView authorView = listItemView.findViewById( R.id.title_text_view );
        // Display the author name of the current article in that TextView
        authorView.setText( currentArticle.getAuthorName() );


        // Find the TextView with view ID date
        TextView publishView = listItemView.findViewById( R.id.title_text_view );
        // Display the publish date of the current article in that TextView
        publishView.setText( currentArticle.getPublishDate() );

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
