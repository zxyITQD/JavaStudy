package exception;

// 自定义异常
public class AgeOutRoundsException extends RuntimeException {
    //空参构造
    public AgeOutRoundsException() {
    }

    // 带参构造 异常信息
    public AgeOutRoundsException(String message) {
        super(message);
    }

}
