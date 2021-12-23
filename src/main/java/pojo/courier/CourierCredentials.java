package pojo.courier;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CourierCredentials {
    public String login;
    public String password;

    public CourierCredentials (String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static CourierCredentials getCourierCredentials(Courier courier) {
        return new CourierCredentials(courier.login, courier.password);
    }
}

