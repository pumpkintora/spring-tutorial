import com.example.demo.dao.UserDao
import com.example.demo.service.UserService

beans = {
    // Define the UserDao bean
    userDao(UserDao) {}

    // Define the UserService bean and inject UserDao
    userService(UserService) {
        userDao = ref('userDao')
    }
}
