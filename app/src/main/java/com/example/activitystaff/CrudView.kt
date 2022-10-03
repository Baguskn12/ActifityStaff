package com.example.activitystaff

interface CrudView {
    //get data
    fun onSuccessGet(data: List<DataItem>?)
    fun onFailedGet(msg : String)

    //untuk add
    fun onSuccessGet(msg: String)
    fun errorAdd(msg : String)

    //untuk update
    fun onSuccessUpdate(msg: String)
    fun errorUpdate(msg : String)

    //untuk delete
    fun onSuccessDelete(msg: String)
    fun errorDelete(msg : String)
}