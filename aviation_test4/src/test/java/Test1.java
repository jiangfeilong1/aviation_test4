import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class Test1 {
    @Test
    public void test(){
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("qqq", "123456");
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(usernamePasswordToken);
    }
}
