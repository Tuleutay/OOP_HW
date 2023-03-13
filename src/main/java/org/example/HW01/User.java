package org.example.HW01;

public class User {
    private String userName;
    private String password;

    private Basket invoice = new Basket();


    public User(String userName, String password, Basket invoice) {
        this.userName = userName;
        this.password = password;
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", invoice=" + invoice +
                '}';
    }

    public void bayProduct(Category category,Product product){
        invoice.addBasket(product);
        category.removeProduct(product);

    }


    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getInvoice() {
        return invoice;
    }

    public void setInvoice(Basket invoice) {
        this.invoice = invoice;
    }
}
