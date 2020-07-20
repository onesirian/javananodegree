
@Mapper
public interface UserMapper {
	@Select("SELECT * FROM USERS WHERE username = #{username}")
	User getUser(String username);


	@Insert("INSERT INTO USERS (username, salt, password, firstname, lastname) " +
	           "VALUES(#{username}, #{salt}, #{password}, #{firstName}, #{lastName})")
		   @Options(useGeneratedKeys = true, keyProperty = "userId")
		      int insert(User user);

	@Delete("DELETE FROM USERS  WHERE username = #{username}")
	   void delete(String username);
}

