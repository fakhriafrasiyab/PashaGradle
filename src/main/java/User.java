import lombok.Data;

@Data
public class  User {
    private String name;
    private Long salary;
    private Integer id;


    public static void main(String[] args) {
        User user = new User();
        user.setName("Faxri");
        System.out.println(user.getName());
    }
}