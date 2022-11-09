package moe.feng.danmaqua.api.bili

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import moe.feng.danmaqua.model.SpaceInfo
import moe.feng.danmaqua.util.HttpUtils
import okhttp3.Request

object UserApi {

    const val SPACE_INFO_URL = "https://api.bilibili.com/x/space/acc/info?mid=%d"

    suspend fun getSpaceInfo(uid: Long): SpaceInfo = withContext(Dispatchers.IO) {
        val request = Request.Builder()
            .url(SPACE_INFO_URL.format(uid))
            .addHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36")
            .build()

        HttpUtils.requestAsJson<SpaceInfo>(request)
    }

}