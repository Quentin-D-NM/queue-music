package com.example.queuemusic.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.queuemusic.R;
import com.example.queuemusic.view.SongRecyclerAdapter.SongHolder;
import java.util.ArrayList;
import java.util.List;

public class SongRecyclerAdapter extends RecyclerView.Adapter<SongHolder> {

  private List<String> songs;

  public SongRecyclerAdapter() {
    this.songs = new ArrayList<String>();
    songs.add("Evan Baxter");
    songs.add("Michael Scott");
    songs.add("James Halpert");
    songs.add("Jim Carrey");
    songs.add("Bill Gates");
    songs.add("Dwight Shrute");
    songs.add("Spongebob");
    songs.add("Nick Bennett");
    songs.add("Elvis ?:");
    songs.add("Warren Buffet");
  }

  @NonNull
  @Override
  public SongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_song, parent, false);
    return new SongHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull SongHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  public class SongHolder extends RecyclerView.ViewHolder {

    public TextView song;

    public SongHolder(@NonNull View itemView) {
      super(itemView);
      song = itemView.findViewById(R.id.song_title);
    }

    private void bind(int position, String song) {
      this.song.setText(song);
    }
  }
}
