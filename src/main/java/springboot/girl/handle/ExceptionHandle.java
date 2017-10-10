package springboot.girl.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.girl.domain.Result;
import springboot.girl.exception.GirlException;
import springboot.girl.utils.ResultUtil;

/**
 * Created by yinywf on 2017/10/11
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof GirlException){
            GirlException girlException=(GirlException)e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        }else {
            LOGGER.error("[系统异常] {}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
