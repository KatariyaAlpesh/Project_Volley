package com.example.project_volley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Response;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.MyClass>
{

    Context context;
    ArrayList<DataModel> arrayListDataModel;
    ArrayList<DataModel.Address> arrayListAddressModel;
    ArrayList<DataModel.Company> arrayListCompanyModel;

    public RecyclerView_Adapter(Context context, ArrayList<DataModel> arrayListDataModel,
                                ArrayList<DataModel.Address> arrayListAddressModel,
                                ArrayList<DataModel.Company> arrayListCompanyModel)
    {

        this.arrayListDataModel = arrayListDataModel;
        this.context = context;
        this.arrayListAddressModel = arrayListAddressModel;
        this.arrayListCompanyModel = arrayListCompanyModel;

    }

    public class MyClass extends RecyclerView.ViewHolder
    {
        TextView textEmail , textId , textName , textUserName , textAddress , textPhone , textWebSite , textCompany ;

        public MyClass(@NonNull View itemView)
        {
            super(itemView);

            textEmail = itemView.findViewById(R.id.TextViewEmail);
            textId = itemView.findViewById(R.id.TextViewID);
            textName = itemView.findViewById(R.id.TextViewName);
            textUserName = itemView.findViewById(R.id.TextViewUserName);
            textAddress = itemView.findViewById(R.id.TextViewAddress);
            textPhone = itemView.findViewById(R.id.TextViewPhone);
            textWebSite = itemView.findViewById(R.id.TextViewWebSite);
            textCompany = itemView.findViewById(R.id.TextViewCompany);

        }
    }
    @NonNull
    @Override
    public MyClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_imagepage , parent , false);

        MyClass M = new MyClass(view);

        return M;
    }

    @Override
    public void onBindViewHolder(@NonNull MyClass holder, int position)
    {

        holder.textId.setText("" + arrayListDataModel.get(position).getId());
        holder.textEmail.setText(arrayListDataModel.get(position).getEmail());
        holder.textName.setText(arrayListDataModel.get(position).getName());
        holder.textPhone.setText(arrayListDataModel.get(position).getPhone());
        holder.textWebSite.setText((CharSequence) arrayListDataModel.get(position).getAddress());
        holder.textUserName.setText(arrayListDataModel.get(position).getUsername());

        holder.textAddress.setText(""+ arrayListAddressModel.get(position).getCity() +
                "" + arrayListAddressModel.get(position).getSuite() +
                "" + arrayListAddressModel.get(position).getStreet() +
                "" + arrayListAddressModel.get(position).getCity() +
                "" + arrayListAddressModel.get(position).getZipcode() +
                "" + arrayListAddressModel.get(position).getGeo());

        holder.textCompany.setText(""+arrayListCompanyModel.get(position).getName() +
                "" + arrayListCompanyModel.get(position).getCatchPhrase() +
                "" + arrayListCompanyModel.get(position).getBs());


    }

    @Override
    public int getItemCount()
    {
        return arrayListDataModel.size();
    }


}
