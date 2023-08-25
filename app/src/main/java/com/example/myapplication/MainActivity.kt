package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.mylibrary.AesUtils
import com.example.mylibrary.SignatureUtils


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //参数的加密，应该是在运行时架构中 HttpUtils 对参数字典排序 HashMap 2.生成待加密链接链接

      //  AesUtils.setAESKey("cretinzp**273846")
       // val signature = SignatureUtils.signatureParams("userName=240336124&userPwd=123456")
        //作为参数给到服务器，服务也会生成同样的密文，然后对加密的字符串进行比较
        binding.sampleText.text = SignatureUtils.signatureParams("userName=240336124&userPwd=123456")


        binding.btnEncrypt.setOnClickListener {
            binding.tvContent.text = AesUtils.encrypt("http://jokes-bucket.oss-cn-beijing.aliyuncs.com/aliyun/jokes/video/7/0/1/4/a/e/7/7/9d286c19cae94943bb8e88f94d749f53.mp4?Expires=1692774885&OSSAccessKeyId=LTAI4G33rJxqaDSGJy7BNMEQ&Signature=dNQnQ8EjV4rabORJb%2F9dpi2roHc%3D")
        }

        binding.btnDecrypt.setOnClickListener {
            binding.tvContent.text = AesUtils.decrypt("ZQb79GrjmFK1UI4BoacGKeLcxFIp7WGXlVyKPxD8hQUYTrdXQx31WNsMNGGjBZr/foibU1cuvRArycfN/+/fRxN+Truwfh8dF4ygv3nLYYzfgeUZQ12hiMDLA0ORCZb77FxswDpBq4ZCI3JVk6veZhxIRiDF3/ILMmWcJ1t9vmMyODhmKD9orl1AHedIF5IngptS1OK0cE0V4cj9CPOmkGcrzOY0Ap3Ygz97IV16yHZY7K6y6VMOxFyLo4QIRJQ5JAravV+1xh/Xb4RsULbrar55uC7oO5mQSE7TzAXEykI=")
        }

    }




}