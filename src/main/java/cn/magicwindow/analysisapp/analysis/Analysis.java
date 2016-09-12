package cn.magicwindow.analysisapp.analysis;

import cn.magicwindow.analysisapp.analysis.handler.BaseHandler;
import cn.magicwindow.analysisapp.utils.Preconditions;
import lombok.Data;

import java.util.List;

/**
 * Created by tony on 16/8/9.
 */
@Data
public class Analysis {

    private List<BaseHandler> handlers;

    public BaseHandler getFirstHandler() {

        if (Preconditions.isNotBlank(handlers)) {

            for (int i = 0;i<handlers.size();i++) {
                if(i>0) {
                    handlers.get(i-1).setNextHandler(handlers.get(i));
                }
            }

            return handlers.get(0);
        }

        return null;
    }
}
