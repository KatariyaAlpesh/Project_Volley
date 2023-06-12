package com.example.project_volley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    RecyclerView recyclerView;

    ArrayList<DataModel> arrayListDataModel = new ArrayList();
    ArrayList<DataModel.Address> arrayListAddressModel = new ArrayList();
    ArrayList<DataModel.Company> arrayListCompanyModel = new ArrayList();


    String url;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerViewMai);

        url = " https://jsonplaceholder.typicode.com/users ";    ////   This is for Get API

        call_API();

    }

    private void call_API()
    {

        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                try
                {
                    JSONArray jsonArray = new JSONArray(response);

                    for (int i = 0 ; i < jsonArray.length() ; i++)
                    {

                        JSONObject mainObject = jsonArray.getJSONObject(i);

                        int id = mainObject.getInt("id");
                        String name = mainObject.getString("name");
                        String username = mainObject.getString("username");
                        String email = mainObject.getString("email");
                        String phone = mainObject.getString("phone");
                        String website = mainObject.getString("website");

                        DataModel model = new DataModel(id , name , username , email , phone , website);
                        arrayListDataModel.add(model);
                        Log.d("BBBBB" , "onResponse : " + model.getEmail());


                        JSONObject address = mainObject.getJSONObject("address");

                        String street = address.getString("street");
                        String suite = address.getString("suite");
                        String city = address.getString("city");
                        String zipcode = address.getString("zipcode");
                        String geo = address.getString("geo");

                        DataModel.Address model1 = new DataModel.Address(street , suite , city , zipcode , geo);
                        arrayListAddressModel.add(model1);


                        JSONObject company = mainObject.getJSONObject("company");

                        String companyname = company.getString("name");
                        String catchPhrase = company.getString("catchPhrase");
                        String bs = company.getString("bs");

                        DataModel.Company model2 = new DataModel.Company(companyname , catchPhrase , bs);
                        arrayListCompanyModel.add(model2);

                    }
                }
                catch (JSONException e)
                {
                    throw new RuntimeException(e);
                }

                RecyclerView_Adapter recyclerView_adapter = new RecyclerView_Adapter(MainActivity.this , arrayListDataModel ,
                                                                                        arrayListAddressModel , arrayListCompanyModel);
                recyclerView.setAdapter(recyclerView_adapter);

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this , RecyclerView.VERTICAL , false);
                recyclerView.setLayoutManager(linearLayoutManager);
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error)
            {

            }
        });

            queue.add(stringRequest);

    }
}