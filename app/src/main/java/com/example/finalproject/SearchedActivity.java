package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchedActivity extends AppCompatActivity {
    private GoogleBookModel book;
    private TextView mTitleText;
    private TextView mAuthorText;
    private TextView mSubtitleText;
    private TextView mDescriptionText;
    private TextView mPublisherText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched);
        Intent intent = getIntent();

        // TODO: Get the book object from the intent
        //GoogleBookModel book = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        getIntent().getSerializableExtra("MyClass");

        // Set the text fields to the information from Book object
        mTitleText = findViewById(R.id.title_text);
        mTitleText.setText(book.getTitle());

        mAuthorText = findViewById(R.id.authors_text);
        mAuthorText.setText(book.getAuthors());

        mSubtitleText = findViewById(R.id.subtitle_text);
        mSubtitleText.setText(book.getSubtitle());

        mDescriptionText = findViewById(R.id.description_text);
        mDescriptionText.setText(book.getDescription());

        mPublisherText = findViewById(R.id.publisher_text);
        mPublisherText.setText(book.getPublisher());

    }
}
