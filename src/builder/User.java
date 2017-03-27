/**
 * 
 */
package builder;

/**
 * @author fubaokui
 * @date   2017年3月15日 下午3:52:03
 */
public class User {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private User (Builder builder){
		this.name 	= builder.name;
		this.age		= builder.age;
	}

	public static Builder newBuilder() {
        return new Builder();
    }
	
    public static class Builder{
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public Builder name(String name){
			this.name = name;
			return this;
		}
		
		public Builder age(int age){
			this.age = age;
			return this;
		}
		
		public User builder(){
			return new User(this);
		}
	}

	public static void main(String[] args) {
		User user = User.newBuilder().name("zhans").age(18).builder();
		System.out.println(user.name);
		System.out.println(user.age);
	}
}
