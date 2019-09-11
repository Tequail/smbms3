import com.github.mybatis.dao.BillMapper;
import com.github.mybatis.dao.UserMapper;
import com.github.mybatis.pojo.Bill;
import com.github.mybatis.pojo.User;
import com.github.mybatis.util.PageBean;
import com.github.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {

        SqlSession sqlSession = null;

        try {
            //获取sqlsession
            sqlSession = SqlSessionUtil.getSqlSession();
            //加载接口对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //查询用户列表    根据用户名  角色名
           /*List<User> userList = userMapper.queryUserByUserNameAndUserRole(null,2,1);
            for (User user : userList) {
                System.out.println(user);
            }*/
           /*根据用户id更新用户信息*/
            /*User user = new User();
            user.setUserName("神雕大侠");
            user.setId(14);
            int row = userMapper.updateUserByUserId(user);
            if (row > 0){
                System.out.println("更新成功!");
            }*/
            // 根据id 查询用户
            //创建map集合对象
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(5);
            list.add(6);
            List<User> userList = userMapper.queryUserByArr(list);
            for (User user : userList) {
                System.out.println(user);
            }
            /*Integer[] arr = {1,2,5,6};
            //创建map集合对象
            HashMap<String,Object> map = new HashMap<>();
            map.put("ids",arr);
            List<User> userList = userMapper.queryUserByArr(map);
            for (User user : userList) {
                System.out.println(user);
            }*/
           //获取billMapper的对象
            /*BillMapper billMapper = sqlSession.getMapper(BillMapper.class);
            //分页查询 查询所有的商品账单  一页显示 5 条
            PageBean<Bill> pageBean = new PageBean<>();
            pageBean.setCurrentPage(2);
            pageBean.setPageSize(6);
            //先写一个查询 来查询总记录数
            int count = billMapper.findBillCount();
            pageBean.setTotalCount(count);
            //分页查询五条数据
            List<Bill> billList = billMapper.queryPageBean(pageBean);
            //遍历查询出来的结果
            for (Bill bill : billList) {
                System.out.println(bill);
            }
            pageBean.setResult(billList);*/
            //sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
            //sqlSession.rollback();
        } finally {
            //关流
            SqlSessionUtil.closeSqlSession(sqlSession);
        }


    }
}
