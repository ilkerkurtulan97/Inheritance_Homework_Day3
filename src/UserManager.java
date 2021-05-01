public class UserManager{
    public void add(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() + " just added");
    }

    public void addMultiple(User[] users){
        for(User user: users){
            add(user);
        }
    }
}
