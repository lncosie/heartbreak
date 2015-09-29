package com.lncosie.socket


import com.squareup.okhttp.RequestBody
import com.squareup.okhttp.ResponseBody
import retrofit.*
import retrofit.http.Body
import retrofit.http.GET
import retrofit.http.Path
import retrofit.http.Streaming
import java.io.InputStreamReader
import java.io.Reader
import java.net.*

fun run(){
    val addr=InetAddress.getByName("www.baidu.com");
    val socket=Socket(addr,80);
    socket.inputStream.read();
    val reader=InputStreamReader(socket.inputStream)

    val udp=MulticastSocket();
    udp.joinGroup(addr)
    val packet=DatagramPacket(ByteArray(1024),1024);
    while(true)
    {
        udp receive packet

    }
    val retrofit =  Retrofit.Builder().baseUrl("https://api.github.com").build();

    val service=retrofit.create(RetrofitClient::class.java)
    service.getImage("doub").enqueue(object : Callback<ResponseBody> {
        override fun onFailure(t: Throwable?) {
            throw UnsupportedOperationException()
        }

        override fun onResponse(response: Response<ResponseBody>?) {
            throw UnsupportedOperationException()
        }
    })


}
interface RetrofitClient{
    //@GET("/users/list?sort=desc")
    //@Query("sort") String sort
    //@Multipart
    //@Part("photo") RequestBody photo
    //@Streaming
    @GET("/group/{id}/users")//Post put
    fun getImage(@Path("") user:String):Call<ResponseBody>;

}
fun softrounte(){
    class Ip{

    }
    class IpTable{
        inner data class Next(next:String,weight:Long);
        lateinit val weights:Map<String,Next>;
    }
    class Rounter{
        fun Query(node:String):Ip?{
            return null
        }
    }
    interface  Node{
        fun descriptor():String;
        fun invoke(rest:String):String;
    }
    fun send(node:Ip,message:ByteArray){

    }
}