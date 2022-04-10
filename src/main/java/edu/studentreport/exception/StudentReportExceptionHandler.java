package edu.studentreport.exception;

import edu.studentreport.util.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Peter Cheung
 * @date 2022/4/9 16:32
 */
@ControllerAdvice
@ResponseBody
public class StudentReportExceptionHandler {
    /**
     * 算术运算异常
     */
    @ExceptionHandler(ArithmeticException.class)
    public R exp1() {
        return R.exp().setData("算术运算异常");
    }

    /**
     * 空指针异常
     */
    @ExceptionHandler(NullPointerException.class)
    public R exp2() {
        return R.exp().setData("空指针异常");
    }

    /**
     * 其它统一异常处理
     */
    @ExceptionHandler(Exception.class)
    public R handlerException() {
        return R.exp().setData("其它未知异常");
    }
}