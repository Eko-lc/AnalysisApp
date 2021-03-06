package cn.magicwindow.analysisapp.analysis.handler

import cn.magicwindow.analysisapp.analysis.ActivityRequest
import cn.magicwindow.analysisapp.utils.SDKUtils
import org.springframework.stereotype.Service

/**
 * Created by tony on 16/8/20.
 */
@Service
class DuibaHandler extends BaseHandler {

    protected boolean handle(ActivityRequest request) {

        if (request?.activity?.name == "cn.com.duiba.credits.CreditActivity" ||
        request?.receiver?.name == 'cn.com.duiba.credits.CreditActivity$AlarmReciver') {

            SDKUtils.addSDK("兑吧sdk")
            return true
        }
        return false
    }
}
