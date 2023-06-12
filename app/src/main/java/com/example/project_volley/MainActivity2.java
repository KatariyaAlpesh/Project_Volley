package com.example.project_volley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity
{

    RecyclerView recyclerView;
    ArrayList<DataModel> arrayListDataModel = new ArrayList<>();
    ArrayList<DataModel.Address> arrayListAddressModel = new ArrayList<>();
    ArrayList<DataModel.Company> arrayListCompanyModel = new ArrayList();

    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.RecyclerView_2);

        url = "https://jsonplaceholder.typicode.com/users";

        call_API();

    }

    private void call_API()
    {
        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                       // textView.setText("Response is: " + response.substring(0,500));

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
                                Log.d("CCCCC" , "onResponce : " + model1.getCity());


                                JSONObject company = mainObject.getJSONObject("company");

                                String companyname = company.getString("name");
                                String catchPhrase = company.getString("catchPhrase");
                                String bs = company.getString("bs");

                                DataModel.Company model2 = new DataModel.Company(companyname , catchPhrase , bs);
                                arrayListCompanyModel.add(model2);
                                Log.d("DDDDD" , "onResponce : " + model2.getBs());

                            }

                        }
                        catch (JSONException e)
                        {
                            throw new RuntimeException(e);
                        }

     ///////////////////////////////     Adapter      <<<<---//////////////////////

                        RecyclerView_Adapter_2 recyclerView_adapter_2 = new RecyclerView_Adapter_2(MainActivity2.this
                                                                                                            , arrayListDataModel
                                                                                                            , arrayListAddressModel
                                                                                                            , arrayListCompanyModel );
                        recyclerView.setAdapter(recyclerView_adapter_2);



                        LinearLayoutManager LM = new LinearLayoutManager(MainActivity2.this
                                                                                , RecyclerView.VERTICAL
                                                                                , false);
                        recyclerView.setLayoutManager(LM);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
              //  textView.setText("That didn't work!");
            }
        });

        queue.add(stringRequest);
    }
}