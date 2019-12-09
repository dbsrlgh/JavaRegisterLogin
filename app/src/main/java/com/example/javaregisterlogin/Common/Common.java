package com.example.javaregisterlogin.Common;

import com.example.javaregisterlogin.Remote.IMyAPI;
import com.example.javaregisterlogin.Remote.RetrofitClient;

public class Common {
    public static final String BASE_URL = "http://49.247.134.78/edmtdb/";

    public static IMyAPI getAPI(){
        return RetrofitClient.getClient(BASE_URL).create(IMyAPI.class);
    }
}
