package com.example.mylibrary

/**
 * Author:Knight
 * Time:2023/8/21 11:10
 * Description:SignatureUtils
 */
object SignatureUtils {



   // companion object {
        // Used to load the 'myapplication' library on application startup.
        init {
            System.loadLibrary("md5")
        }
//    }
    /**
     * native 方法签名参数
     * @return
     */
    external fun signatureParams(params:String): String


}