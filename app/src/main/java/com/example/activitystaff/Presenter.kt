package com.example.activitystaff

import retrofit2.Call

class Presenter (val crudView: MainActivity) {
    //fungsi get data
    fun getData(){
        NetworkConfig.getService().getData()
            .enqueue(object : retrofit2.Callback<ResultStaff>
                override fun onFailure(Call: Call<ResultStaff>, t: Throwable) {
                    crudView.onFailedGet(t.localizedMessage)
                    Log.d("Error", "Error Data")
                }

            })
    }
}