import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentsreport.Marks;
import com.example.studentsreport.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter  extends BaseAdapter {
    Context context;
    List<Marks> marksList;

    public MyAdapter(Context context, List<Marks> marksList) {
        this.context = context;
        this.marksList = marksList;
    }

    @Override
    public int getCount() {
        return marksList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
     convertView= LayoutInflater.from(context).inflate(R.layout.listview,parent, false);
        TextView txt_SNO =convertView.findViewById(R.id.sno);
        TextView txtName =convertView.findViewById(R.id.name);
        TextView txtRegno =convertView.findViewById(R.id.reg);
        TextView txtEnglish =convertView.findViewById(R.id.eng);
        TextView txtMaths =convertView.findViewById(R.id.math);
        TextView txtKiswahili =convertView.findViewById(R.id.kis);
        TextView txtChemistry =convertView.findViewById(R.id.chem);
        TextView txtPhysics =convertView.findViewById(R.id.phy);
        TextView txtBiology =convertView.findViewById(R.id.bio);
        TextView txtHistory =convertView.findViewById(R.id.hist);
        TextView txtGeography =convertView.findViewById(R.id.geo);
        TextView txtCRE =convertView.findViewById(R.id.cr);
        TextView txtBStudies =convertView.findViewById(R.id.bs);
        TextView txtAgriculture =convertView.findViewById(R.id.agri);
        TextView txtComputer =convertView.findViewById(R.id.comp);
        TextView txtTotal =convertView.findViewById(R.id.total);
        TextView txtPosition =convertView.findViewById(R.id.position);

        txt_SNO.setText(marksList.get(position).getSno());
        txtName.setText(marksList.get(position).getName());
        txtRegno.setText(marksList.get(position).getRegno());
        txtEnglish.setText(marksList.get(position).getEnglish());
        txtMaths.setText(marksList.get(position).getMaths());
        txtKiswahili.setText(marksList.get(position).getKisw());
        txtChemistry.setText(marksList.get(position).getChemistry());
        txtPhysics.setText(marksList.get(position).getPhysics());
        txtBiology.setText(marksList.get(position).getBiology());
        txtHistory.setText(marksList.get(position).getHistory());
        txtGeography.setText(marksList.get(position).getGeography());
        txtCRE.setText(marksList.get(position).getCre());
        txtBStudies.setText(marksList.get(position).getBstudies());
        txtAgriculture.setText(marksList.get(position).getAgriculture());
        txtComputer.setText(marksList.get(position).getComputer());
        txtTotal.setText(marksList.get(position).getTotal());
        txtPosition.setText(marksList.get(position).getPosition());

        return convertView;
    }
}
