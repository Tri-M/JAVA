import java.lang.*;
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        try {
            ContactDetail cd1 = new ContactDetail("456904","456904","ll1","mail1", "a1");
            ContactDetailBO.validate(cd1.getMobile(), cd1.getAlternateMobile());
        } catch (DuplicateMobileNumberException e) {
            System.err.println(e);
        }

        
        try {
            ContactDetail cd2 = new ContactDetail("123124","123124","ll2","mail2", "a2");
            ContactDetailBO.validate(cd2.getMobile(), cd2.getAlternateMobile());
        } catch (DuplicateMobileNumberException e) {
            System.err.println(e);
        }
    }
}

class ContactDetail {
    private String mobileNo1;
    private String mobileNo2;
    private String landline;
    private String email;
    private String address;

    public ContactDetail() {
    }

    public ContactDetail(String mobileNo1, String mobileNo2, String landline, String email, String address) {
        this.mobileNo1 = mobileNo1;
        this.mobileNo2 = mobileNo2;
        this.landline = landline;
        this.email = email;
        this.address = address;
    }

    public String getMobile() {
        return mobileNo1;
    }

    public void setMobile(String mobile) {
        this.mobileNo1 = mobileNo1;
    }

    public String getAlternateMobile() {
        return mobileNo2;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.mobileNo2 = mobileNo2;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nContactDetail{" +
                "\n\tmobile='" + mobileNo1 + '\'' +
                ",\n\talternateMobile='" + mobileNo2 + '\'' +
                ",\n\tlandline='" + landline + '\'' +
                ",\n\temail='" + email + '\'' +
                ",\n\taddress='" + address + '\'' +
                "\n}";
    }
}


class ContactDetailBO{
    static void validate(String mobileNo1, String mobileNo2) throws DuplicateMobileNumberException {
        if(mobileNo1 == mobileNo2){
            throw new DuplicateMobileNumberException("mobile number1 and mobile number2 duplicated " + mobileNo1 + ".");
        }
        else return;
    }
}

class DuplicateMobileNumberException extends Exception {
    public DuplicateMobileNumberException(String str) {
        super(str);
    }
}
