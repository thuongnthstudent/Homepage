package com.example.homepage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homepage.R;
import com.example.homepage.model.Book_homepage;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHoler> {

    Context context;
    ArrayList<Book_homepage> book_homepages;

    public BookAdapter(Context context, ArrayList<Book_homepage> book_homepages) {
        this.context = context;
        this.book_homepages = book_homepages;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.homepage_item_book,parent,false);
        return new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        holder.imvBook.setImageResource(book_homepages.get(position).getProductBook());

    }

    @Override
    public int getItemCount() {
        return book_homepages.size();
    }

    public  class  ViewHoler extends RecyclerView.ViewHolder {

        ImageView imvBook;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            imvBook = itemView.findViewById(R.id.imvBook);
        }
    }

}
