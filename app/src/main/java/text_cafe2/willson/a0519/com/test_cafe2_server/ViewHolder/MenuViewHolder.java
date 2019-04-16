package text_cafe2.willson.a0519.com.test_cafe2_server.ViewHolder;

/**
 * Created by Asus on 27/11/2017.
 */

import android.content.ClipData;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import text_cafe2.willson.a0519.com.test_cafe2_server.Interface.ItemClickListener;
import text_cafe2.willson.a0519.com.test_cafe2_server.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;
    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemview){
        super(itemview);
        txtMenuName = (TextView)itemview.findViewById(R.id.menu_name);
        imageView = (ImageView)itemview.findViewById(R.id.menu_image);
        itemview.setOnClickListener(this);
    }
    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);

    }
}
