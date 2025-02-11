package YAIP7;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
        this.memberType = "None"; // Évite que ce soit null
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        if (member) {
            this.memberType = type;
        } else {
            this.memberType = "None";
        }
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
    }
}

