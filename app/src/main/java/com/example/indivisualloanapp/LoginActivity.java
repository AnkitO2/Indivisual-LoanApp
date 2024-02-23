package com.example.indivisualloanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.indivisualloanapp.Request.MemberLoginWithIDAndPasswordRequest;
import com.example.indivisualloanapp.Response.MemberLoginWithIDAndPasswordResponse;
import com.example.indivisualloanapp.Retrofit.RetrofitClient;
import com.example.indivisualloanapp.databinding.ActivityLoginBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.loginBtn.setOnClickListener(v ->{
            if (binding.usernameInputEditText.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter User Id", Toast.LENGTH_SHORT).show();
            } else if (binding.passwordInputEditText.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter password", Toast.LENGTH_SHORT).show();
            }
            else {
                userLogin();
            }
        } );
    }
    void userLogin(){
        MemberLoginWithIDAndPasswordRequest request = new MemberLoginWithIDAndPasswordRequest();
        request.setMemberId(binding.usernameInputEditText.getText().toString());
        request.setPassword(binding.passwordInputEditText.getText().toString());

        RetrofitClient.getClient().LoginIdAndPassword(request).enqueue(new Callback<MemberLoginWithIDAndPasswordResponse>() {
            @Override
            public void onResponse(Call<MemberLoginWithIDAndPasswordResponse> call, Response<MemberLoginWithIDAndPasswordResponse> response) {
              if (response.body().getLoginMessage().equalsIgnoreCase("Student Login Successfull")){

              }
              else {
                  Toast.makeText(LoginActivity.this, "response is not successfully"+response.body().getLoginMessage(), Toast.LENGTH_SHORT).show();
              }
            }

            @Override
            public void onFailure(Call<MemberLoginWithIDAndPasswordResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this,"Something went wrong",Toast.LENGTH_SHORT).show();
            }
        });
    }
}