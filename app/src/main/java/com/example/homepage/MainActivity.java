package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homepage.R;
import com.example.homepage.adapter.BookAdapter;
import com.example.homepage.model.Book_homepage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvBookSale, rcvEBook, rcvBookBorrow;
    BookAdapter adapter;
    ArrayList<Book_homepage> book_homepages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkViews();
        configRecycleView();
        iniData();

    }

    private void linkViews() {
        rcvBookSale=findViewById(R.id.rcvBookSale);
        rcvEBook=findViewById(R.id.rcvEBook);
        rcvBookBorrow=findViewById(R.id.rcvBookBorrow);
    }

    private void configRecycleView() {
        LinearLayoutManager managersale = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager managerebook = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager managerborrow = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        rcvBookSale.setLayoutManager(managersale);
        rcvEBook.setLayoutManager(managerborrow);
        rcvBookBorrow.setLayoutManager(managerebook);

//        DividerItemDecoration decoration = new DividerItemDecoration(rcvBeers.getContext(), manager.getOrientation());
//        rcvBeers.addItemDecoration(decoration);

        //Custom divider
//        DividerItemDecoration decoration = new DividerItemDecoration(rcvListBook.getContext(),DividerItemDecoration.HORIZONTAL);
//        rcvListBook.addItemDecoration(decoration);
    }

    private void iniData() {
        book_homepages=new ArrayList<Book_homepage>();
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        book_homepages.add(new Book_homepage(R.drawable.book_model));
        adapter = new BookAdapter(MainActivity.this, book_homepages);
        rcvBookSale.setAdapter(adapter);
        rcvBookBorrow.setAdapter(adapter);
        rcvEBook.setAdapter(adapter);
    }
}