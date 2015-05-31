package adapter;

/**
 * Created by Zoli on 30. 5. 2015.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import activities.Main;
import other.ObsahItem;
import webdesign_studio.csandaz.demo.R;

/**
 * Created by Edwin on 28/02/2015.
 */
public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {



    public GridAdapter() {
        super();
        Main.mItems = new ArrayList<ObsahItem>();
        ObsahItem fotka = new ObsahItem();
        fotka.setName("Steblo");
        fotka.setThumbnail(R.drawable.img1);
        Main.mItems.add(fotka);

        fotka = new ObsahItem();
        fotka.setName("Kvetina");
        fotka.setThumbnail(R.drawable.img2);
        Main.mItems.add(fotka);

        fotka = new ObsahItem();
        fotka.setName("Kvapka");
        fotka.setThumbnail(R.drawable.img3);
        Main.mItems.add(fotka);

        fotka = new ObsahItem();
        fotka.setName("Strom");
        fotka.setThumbnail(R.drawable.img4);
        Main.mItems.add(fotka);

        fotka = new ObsahItem();
        fotka.setName("Mach");
        fotka.setThumbnail(R.drawable.img5);
        Main.mItems.add(fotka);

        fotka = new ObsahItem();
        fotka.setName("List");
        fotka.setThumbnail(R.drawable.img6);
        Main.mItems.add(fotka);

        fotka = new ObsahItem();
        fotka.setName("Huba");
        fotka.setThumbnail(R.drawable.img7);
        Main.mItems.add(fotka);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ObsahItem nature = Main.mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return Main.mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.tv_species);
        }
    }
}