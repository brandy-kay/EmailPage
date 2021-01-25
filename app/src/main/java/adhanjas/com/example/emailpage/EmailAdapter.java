package adhanjas.com.example.emailpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailHolder> {
    public List<Email_model> list;

    public EmailAdapter(List<Email_model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public EmailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EmailHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.email_row,parent,false)); }

    @Override
    public void onBindViewHolder(@NonNull EmailHolder holder, int position) {
        holder.clock.setText(list.get(position).getTime());
        holder.head.setText(list.get(position).getTitle());
        holder.body.setText(list.get(position).getMessage());
        holder.star.setImageResource(list.get(position).getImgstar());
        holder.pic.setImageResource(list.get(position).getImgpic()); }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class EmailHolder extends RecyclerView.ViewHolder{
        ImageView pic,star;
        TextView head,body,clock;
        public EmailHolder(@NonNull View itemView) {
            super(itemView);
            pic=itemView.findViewById(R.id.imagePic);
            star=itemView.findViewById(R.id.imageStar);
            head=itemView.findViewById(R.id.textHead);
            body=itemView.findViewById(R.id.textBody);
            clock=itemView.findViewById(R.id.textTime);
        }
    }
}
