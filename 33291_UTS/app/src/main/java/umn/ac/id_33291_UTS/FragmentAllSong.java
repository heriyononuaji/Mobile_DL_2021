package umn.ac.id_33291_UTS;

//IMPORT LIBRARY
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import static umn.ac.id_33291_UTS.ListSongAct.FilesSongAct;

public class FragmentAllSong extends Fragment {
    //    RECYCLE VIEW
    RecyclerView recyclerView;
    MusicAdapterAct musicAdapter;
    public FragmentAllSong() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_song, container, false);
        recyclerView = view.findViewById(R.id.rvAllSong);
        recyclerView.setHasFixedSize(true);

        if (FilesSongAct.size() >= 0)
        {
            musicAdapter = new MusicAdapterAct(getContext(), FilesSongAct);
            recyclerView.setAdapter(musicAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        }
        return view;
    }
}