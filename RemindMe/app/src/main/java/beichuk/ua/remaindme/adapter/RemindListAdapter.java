package beichuk.ua.remaindme.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import beichuk.ua.remaindme.dto.RemindDTO;
import beychuk.ua.remindme.R;

public class RemindListAdapter extends RecyclerView.Adapter<RemindListAdapter.RemindViewHolder>
{
    private List<RemindDTO> data = new ArrayList<>();

    public RemindListAdapter(List<RemindDTO> data)
    {
        this.data = data;
    }

    @Override
    public RemindViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item, parent, false);
        return new RemindViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RemindViewHolder holder, int position)
    {
        holder.title.setText(data.get(position).getTitle());
    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }

    public static class RemindViewHolder extends RecyclerView.ViewHolder
    {
        private CardView cardView;
        private TextView title;

        public RemindViewHolder(View itemView)
        {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cardView);
            title = (TextView)itemView.findViewById(R.id.title);
        }
    }
}