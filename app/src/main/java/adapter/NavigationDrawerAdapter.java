package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import other.NavDrawerItem;
import webdesign_studio.csandaz.demo.R;

/**
 * Created by Zoli on 30. 5. 2015.
 * This adapter class inflates nav_drawer_row.xml and renders the RecycleView drawer menu.
 */
public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {
    List<NavDrawerItem> data = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;

    public NavigationDrawerAdapter(Context context, List<NavDrawerItem> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    public void delete(int position) {
        data.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        //TODO: nastudovat si, ako sa tam pridava oddelovacia ciara normalnym sposobom
        if(viewType<2) view = inflater.inflate(R.layout.nav_drawer_row, parent, false);
        else if (viewType==2 )view = inflater.inflate(R.layout.nav_drawer_row_topline, parent, false);
        else view = inflater.inflate(R.layout.nav_drawer_row_no_icon, parent, false);

        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    //Nastavenie nazvu a obrazka pre objekty v bocnom menu
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NavDrawerItem current = data.get(position);
        holder.title.setText(current.getTitle());
        switch (position){
            case 0: holder.img.setImageResource(R.drawable.pyramid); break;
            case 1: holder.img.setImageResource(R.drawable.sphere); break;
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            //TODO: pri zobrazeni layoutu bez obrazka je img null. Treba najst lepsi sposob, mozno spravit druhy viewHolder
            img = (ImageView) itemView.findViewById(R.id.nav_drawer_row_icon);
        }
    }
}
