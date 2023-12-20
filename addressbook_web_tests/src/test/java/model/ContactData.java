package model;

public record ContactData(
        String firstName,
        String middleName,
        String lastName,
        String nickname,
        String title,
        String company,
        String address,
        String homeTelephoneNumber,
        String mobileNumber,
        String workTelephoneNumber,
        String fax,
        String email,
        String birthdayDay,
        String birthDayMonth,
        String birthDayYear
) {
    public ContactData() {
        this("",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "");
    }
}
