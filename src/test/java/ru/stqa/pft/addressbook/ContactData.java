package ru.stqa.pft.addressbook;

public class ContactData {
    private final String name;
    private final String companyName;
    private final String phone;
    private final String email;

    public ContactData(String name, String companyName, String phone, String email) {
        this.name = name;
        this.companyName = companyName;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
